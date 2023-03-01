 -- Creaci�n de la BASE de DATOS
create database dbmentorias;
-- Poner en uso la Base de datos
use dbmentorias;
--Crear Tablas

--Tabla Contenido
create table contenido
(
codigo_con char(10) constraint cod_con_pk primary key,
nombre_con char(100),
descripcion_con varchar (1000),
observaciones_con varchar (1000),

);
-- Tabla emprendedor

create table emprendedor
(
id_emp char(10) constraint cod_emp_pk primary key,
nombre_emp char(50),
telefono_emp  char(15),
sexo_emp      char(10),  
email_emp char(100),
direccion_emp varchar(100),
nombre_tie_emp char(100),
descripccion_tie_emp varchar(100),
googleMaps_tie_emp varchar(100),
facebook_emp varchar(100),
direccion_tie_emp varchar(100),
observaciones_emp varchar (1000),
);
--Tabla Encargado
create table encargado_mentoria
(
id_enc char(10) constraint cod_enc_pk primary key,
cedula_enc char(10),
nombre_enc char(50),
telefono_enc char (12),
email_enc char(100),
direccion_enc varchar(100),
sexo_enc             char(10),  
observaciones_enc varchar (1000),
);
--Tabla Producto
create table producto
(
id_pro char(10) constraint cod_prod_pk primary key,
nombre_pro char(100),
descripcion_pro varchar(500),
precion_pro decimal(16,2),
observaciones_pro varchar (1000),
id_emp char(10) constraint cod_emp_fk references emprendedor (id_emp),
);
--Tabla Mentorias

create table mentorias
(
	id_men char(10) constraint cod_men_pk primary key,
	nombre_men char(100),
	descripcion_men varchar(1000),
	fecha_men date,
	hora_men char(10),
	observaciones_men varchar (1000),
	id_emp char(10) constraint cod_emp_fk1 references emprendedor (id_emp),
	id_enc char(10) constraint cod_enc_fk references Encargado_Mentoria (id_enc),
	codigo_con char(10) constraint cod_con_fk references contenido (codigo_con)
);

--Tabla Usuarios
create table usuario
(
	codigo_usr char(10) constraint cod_usr_resp_pk primary key,
	fullname_usr char(100),
	nikName_usr char(50),
	password_usr char(50),
	rol_usr char(20),
	codigoBin_usr char(10)
);

select *from usuario
select *from contenido
----------------------------------------------------------------

-- los Sp que use

--Usuario

--Ingresar
Create proc insertar_usr
@codigo_usr			char(10),	
@fullname_usr		char(100),
@nikName_usr		char(50),
@password_usr		char(50),
@rol_usr		    char(20),
@codigoBin_usr      char(10)
as
Insert into usuario values(@codigo_usr, @fullname_usr, @nikName_usr, @password_usr, @rol_usr,@codigoBin_usr );

--rol
create proc getRol 
@nikName	char(50),
@password	char(50)	
as
select rol_usr from usuario where nikName_usr = @nikName and password_usr=@password

--Binario
create proc getRolBin
@nikName	char(50),
@password	char(50)	
as
select codigoBin_usr from usuario where nikName_usr = @nikName and password_usr=@password

-- Verificar Usuario
create proc verificar_U
@nikName_usr char(50),
@password_usr char(50) 
as
SELECT * FROM usuario WHERE nikName_usr=@nikName_usr  and password_usr=@password_usr

--Eliminar 
--Implementar la auditoria
create proc eleminar_usr
@codigo_usr	char(12)
as
DELETE FROM usuario WHERE codigo_usr=@codigo_usr

-- Buscar
create proc buscar_usuario
@codigo_usr	 char(10)
as
Select * from usuario
Where codigo_usr=@codigo_usr;

--Visualizar
create proc visualizar_usuario
as 
Select * from USUARIO;

--Actualizar
create proc actualizar_usuario
@codigo_usr			char(10),	
@fullname_usr		char(100),
@nikName_usr		char(50),
@password_usr		char(50),
@rol_usr		    char(20),
@codigoBin_usr      char(10)
as
begin 
Update usuario
set			
	fullname_usr=@fullname_usr,	
	nikName_usr=@nikName_usr,		
	password_usr=@password_usr,		
	rol_usr=@rol_usr, 
	codigoBin_usr=@codigoBin_usr      
where 
	@codigo_usr=codigo_usr
end

select *from usuario
--Contenidos

--Insertar
create  proc  insertar_contenidos
@codigo_con char(10),
@nombre_con char(100),
@descripcion_con varchar(100),
@observaciones_con varchar(1000)
as
Insert into contenido values (@codigo_con,@nombre_con,@descripcion_con,@observaciones_con );

--Actualizar

create proc actualizar_contenido
@codigo_con		char(10),	
@nombre_con		char(100),
@descripcion_con		varchar(1000),
@observaciones_con		varchar(1000)
as
begin 
Update contenido
set			
	nombre_con=@nombre_con,	
	descripcion_con=@descripcion_con,		
	observaciones_con=@observaciones_con	     
where 
	@codigo_con=codigo_con
end

--Visualizar
create proc visualizar_contenidos
as
Select * from CONTENIDO

--Eliminar
create proc eliminar_contenido
@codigo_con char(10)
as
DELETE FROM contenido where codigo_con=@codigo_con

--Buscar
create proc buscar_contenido
@codigo_con char(10)
as
Select * from CONTENIDO 
where codigo_con=@codigo_con;


---Emprendedores

--Insertar
create proc  insertar_emprendedor
@id_emp			char(10),
@nombre_emp		char(50),
@telefono_emp	char(15),
@sexo_emp		char(10),
@email_emp		char(100),
@direccion_emp	varchar(1000),
@nombre_tie_emp char(100),
@descripcion_tie_emp	varchar(100),
@googleMapUrl_tie		varchar(500),
@facebook_emp			varchar(100),
@direcccion_tie_emp		varchar(100),
@observaciones_emp		varchar(100)
as
Insert into emprendedor values (@id_emp,@nombre_emp,@telefono_emp,@sexo_emp,@email_emp,@direccion_emp,@nombre_tie_emp,@descripcion_tie_emp,@googleMapUrl_tie,@facebook_emp,@direcccion_tie_emp,@observaciones_emp);

--Buscar
create proc buscar_emprendedor
@id_emp char (10)
as
Select * from emprendedor
Where id_emp=@id_emp;

--Visualizar
create proc visualizar_emprendedor
as 
Select * from emprendedor;


--Actualizar
create proc actualizar_emprendedor
@id_emp			char(10),
@nombre_emp		char(50),
@telefono_emp	char(15),
@sexo_emp		char(10),
@email_emp		char(100),
@direccion_emp	varchar(1000),
@nombre_tie_emp char(100),
@descripcion_tie_emp	varchar(100),
@googleMapUrl_tie		varchar(500),
@facebook_emp			varchar(100),
@direcccion_tie_emp		varchar(100),
@observaciones_emp		varchar(100)
as
begin 
Update emprendedor
set			
	nombre_emp=@nombre_emp,	
	telefono_emp=@telefono_emp,
	sexo_emp=@sexo_emp,
	email_emp=@email_emp,
	direccion_emp=@direccion_emp,
	nombre_tie_emp=@nombre_tie_emp,
	descripccion_tie_emp=@descripcion_tie_emp,	
	googleMaps_tie_emp=@googleMapUrl_tie,	
	facebook_emp=@facebook_emp,	
	direccion_tie_emp=@direcccion_tie_emp,		
	observaciones_emp=@observaciones_emp			     
where 
	@id_emp=id_emp
end

--Eliminar
create proc eliminar_emprendedor
@codigo_empr char(10)
as
DELETE FROM emprendedor where id_emp=@codigo_empr


--Encargado

--Insertar
create proc insertar_encargado
@id_enc char(10),
@cedula_enc char(10),
@nombre_enc char(50),
@telefono_enc char(12),
@email_enc char(100),
@direccion_enc char(100),
@sexo_enc char(10),
@observaciones_enc varchar(1000)
as
Insert into encargado_mentoria values (@id_enc ,@cedula_enc,@nombre_enc,@telefono_enc,@email_enc,@direccion_enc,@sexo_enc,@observaciones_enc);

--Actualizar
create proc actualizar_encargado
@id_enc		char(10),
@cedula_enc		char(10),
@nombre_enc		char(50),
@telefono_enc	char(15),
@email_enc		char(100),
@direccion_enc	varchar(1000),
@sexo_enc		char(10),
@observaciones_enc 	varchar(1000)
as
begin 
Update encargado_mentoria
set			
	cedula_enc=@cedula_enc,
	nombre_enc=@nombre_enc,
	telefono_enc=@telefono_enc,
	email_enc=@email_enc,
	direccion_enc=@direccion_enc,
	sexo_enc=@sexo_enc,
	observaciones_enc=@observaciones_enc
where 
	@id_enc=id_enc
end

--Buscar
create proc buscar_encargado
@id_enc char (10)
as
Select * from encargado_mentoria
Where id_enc=@id_enc;


--Eliminar
create proc eliminar_encargado
@codigo_enc char(10)
as
DELETE FROM encargado_mentoria where id_enc=@codigo_enc

--Visualizar
create proc visualizar_encargado
as 
Select * from encargado_mentoria;


--Productos

--Insertar
create proc insertar_productos
@id_pro				char(10),
@nombre_pro			char(100),
@descripcion_pro	varchar(100),
@precio_pro			decimal(16,2),
@observaciones_pro	varchar(1000),
@id_fk_emp			char(10)
as
Insert into producto 
values (@id_pro,@nombre_pro,@descripcion_pro,@precio_pro,@observaciones_pro,@id_fk_emp);

--Actualizar
create proc actualizar_producto
@id_pro				char(10),
@nombre_pro			char(100),
@descripcion_pro	varchar(100),
@precio_pro			decimal(16,2),
@observaciones_pro	varchar(1000),
@id_fk_emp			char(10)
as
begin 
Update producto
set			
	nombre_pro=@nombre_pro,
	descripcion_pro=@descripcion_pro,
	precion_pro=@precio_pro,
	observaciones_pro=@observaciones_pro,
	id_emp=@id_fk_emp		
where 
	@id_pro=id_pro
end


--Buscar
create proc buscar_producto
@id_pro char (10)
as
Select * from producto 
Where id_pro=@id_pro;

--Eliminar
create proc eliminar_producto
@id_pro char(10)
as
DELETE FROM producto where id_pro=@id_pro

--Visualizar
create proc visualizar_producto
as 
Select * from producto;

--Llenar combo
create  proc llenar_combo
as
Select id_emp from emprendedor;

--Vista Producto
create  view view_producto
as
Select p.id_pro,p.nombre_pro,p.descripcion_pro,p.precion_pro,p.id_emp,e.nombre_emp from producto as p, emprendedor as e
where p.id_emp=e.id_emp;


--Mentoria

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
as
Insert into mentorias values (@id_men,@nombre_men,@descripcion_men,@fecha_men,@hora_men,@observaciones_enc,@id_emp,@id_enc,@cod_con);

create proc auditoria


--Actualizar
create proc actualizar_mentoria
@id_men char(10),
@nombre_men char(100),
@descripcion_men varchar(1000),
@fecha_men date,
@hora_men char(10),
@observaciones_enc varchar(1000),
@id_emp char(10),
@id_enc char(10),
@cod_con char(10)
as
begin 
Update mentorias
set			
	nombre_men=@nombre_men ,
	descripcion_men=@descripcion_men ,
	fecha_men=@fecha_men ,
	hora_men=@hora_men ,
	observaciones_men=@observaciones_enc ,
	id_emp=@id_emp ,
	id_enc=@id_enc ,
	codigo_con=@cod_con 	
where 
	@id_men=id_men
end

--Buscar
create proc buscar_mentoria
@id_ment char (10)
as
Select * from  mentorias
Where id_men=@id_ment;

--Eliminar 
create proc eliminar_mentoria
@id_ment char(10)
as
DELETE FROM mentorias where id_men=@id_ment

--Visualizar
create proc visualizar_mentoria
as 
Select * from mentorias;

select codigo_con from contenido 

exec insertar_mentoria 'MT001','Test1','Prueba 1','2023-03-01','07:10','','E00001','EC001','C00001'



