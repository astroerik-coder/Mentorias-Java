use dbmentorias;


--Triggers
create table respaldo_usuario
(
	codigo_usr char(10),
	fullname_usr char(100),
	nikName_usr char(50),
	password_usr char(50),
	rol_usr char(20),
	codigoBin_usr char(10),
	fecha_borrado  DATETIME DEFAULT GETDATE(),
	usuario_borrado char(50)
);


--Respaldo del usuario a una tabla temp_usuario
create trigger tr_respaldo_usuario on usuario
after delete 
as 
begin
	--utiliza para evitar que se muestre un mensaje de conteo de filas afectadas después de la operació
	SET NOCOUNT ON;
	DECLARE @usuario VARCHAR(50);
    SET @usuario = SYSTEM_USER;
	insert into respaldo_usuario (codigo_usr, fullname_usr, nikName_usr, password_usr, rol_usr,codigoBin_usr,usuario_borrado )
	select d.codigo_usr,d.fullname_usr,d.nikName_usr,d.password_usr,d.rol_usr,d.codigoBin_usr,@usuario from deleted as d;
end;

SELECT * FROM respaldo_usuario;

--Respaldo Mentorias
create table respaldo_mentorias
(
	id_men char(10) ,
	nombre_men char(100),
	descripcion_men varchar(1000),
	fecha_men date,
	hora_men char(10),
	observaciones_men varchar (1000),
	id_emp char(10),
	id_enc char(10),
	codigo_con char(10),
);

--Create Triger
--Respaldo de la mentoria a una tabla 

--Eliminar
create  trigger tr_respaldo_mentoria on mentorias
after delete 
as 
begin
	DECLARE 
	--utiliza para evitar que se muestre un mensaje de conteo de filas afectadas después de la operació
	SET NOCOUNT ON;
	insert into respaldo_mentorias (id_men, nombre_men, descripcion_men, fecha_men, hora_men,observaciones_men,id_emp, id_enc, codigo_con)
	select d.codigo_con,d.nombre_men,d.descripcion_men,d.fecha_men,d.hora_men,d.observaciones_men,d.id_emp,d.id_enc, d.codigo_con from deleted as d;
end;

select *from respaldo_mentorias;



--Tabla Auditorias
create table auditorias
(
	id_aud int IDENTITY PRIMARY KEY,
	fecha_hora_aud  DATETIME DEFAULT GETDATE(),
	usuario_aud  char(50),
	operacion_aud  char(10),
	tabla_aud  char(10),
	observaciones_aud  varchar (1000)
);

--Actualizar
--Insertar
create proc insertar_mentoria
	@id_men char(10),
	@nombre_men char(100),
	@descripcion_men varchar(1000),
	@fecha_men date,
	@hora_men char(10),
	@observaciones_enc varchar(1000),
	@id_emp char(10),
	@id_enc char(10),
	@cod_con char(10),
	@usuario char(20)
AS
BEGIN
	 SET NOCOUNT ON;
	Insert into mentorias values (@id_men,@nombre_men,@descripcion_men,@fecha_men,@hora_men,@observaciones_enc,@id_emp,@id_enc,@cod_con);
	Insert into auditorias values(GETDATE(),@usuario,'mentorias','INSERT','');
END

exec insertar_mentoria 'MT010','EJEMPLO','GOOD','2023/10/25','07:15','','E00001','EC001','C00001','admin'

select * from auditorias

select * from respaldo_mentorias
exec visualizar_mentoria;
