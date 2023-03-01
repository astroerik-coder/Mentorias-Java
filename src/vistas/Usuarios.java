package vistas;

import Tablas.ListarUsuario;
import Conexion.Conexion;
import Datos.Usuario;
import Gestion.GestionUsuario;
import javax.swing.JOptionPane;

public class Usuarios extends javax.swing.JInternalFrame {

    GestionUsuario gu = new GestionUsuario();
    ListarUsuario tblUs = new ListarUsuario();

    public Usuarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPermisos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtPasword = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        checkAuditorias = new javax.swing.JCheckBox();
        checkGestionUsuario = new javax.swing.JCheckBox();
        checkContenidos = new javax.swing.JCheckBox();
        checkEmprendedores = new javax.swing.JCheckBox();
        checkEncargados = new javax.swing.JCheckBox();
        checkProductos = new javax.swing.JCheckBox();
        checkMentorias = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Usuarios");
        setMaximumSize(new java.awt.Dimension(628, 474));
        setMinimumSize(new java.awt.Dimension(628, 474));
        setPreferredSize(new java.awt.Dimension(628, 474));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 57, 57));
        jPanel1.setMaximumSize(new java.awt.Dimension(570, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 10, 360));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 154, 118));
        jLabel1.setText("Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 154, 118));
        jLabel3.setText("Rol:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 20));

        lblPermisos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPermisos.setForeground(new java.awt.Color(18, 154, 118));
        jPanel1.add(lblPermisos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 154, 118));
        jLabel5.setText("Login:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 154, 118));
        jLabel6.setText("Password:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(18, 154, 118));
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 90, 20));
        jPanel1.add(txtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 160, 30));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 160, 30));
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 160, 30));
        jPanel1.add(txtPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 160, 30));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 160, 30));

        btnBuscar.setBackground(new java.awt.Color(18, 154, 118));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 110, 30));

        btnEliminar.setBackground(new java.awt.Color(18, 154, 118));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 240, 30));

        btnEditar.setBackground(new java.awt.Color(18, 154, 118));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Actualizar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 110, 30));

        btnListar.setBackground(new java.awt.Color(18, 154, 118));
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 270, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(18, 154, 118));
        jLabel8.setText("Id:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 30, 20));

        checkAuditorias.setText("Auditorias");
        checkAuditorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAuditoriasActionPerformed(evt);
            }
        });
        jPanel1.add(checkAuditorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 90, 30));

        checkGestionUsuario.setText("Usuarios");
        jPanel1.add(checkGestionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 90, 30));

        checkContenidos.setText("Contenido");
        checkContenidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkContenidosActionPerformed(evt);
            }
        });
        jPanel1.add(checkContenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 90, 30));

        checkEmprendedores.setText("Emprendedores");
        checkEmprendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEmprendedoresActionPerformed(evt);
            }
        });
        jPanel1.add(checkEmprendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, 30));

        checkEncargados.setText("Encargado");
        checkEncargados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEncargadosActionPerformed(evt);
            }
        });
        jPanel1.add(checkEncargados, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 90, 30));

        checkProductos.setText("Producto");
        checkProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkProductosActionPerformed(evt);
            }
        });
        jPanel1.add(checkProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 90, 30));

        checkMentorias.setText("Mentoria");
        checkMentorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMentoriasActionPerformed(evt);
            }
        });
        jPanel1.add(checkMentorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 90, 30));

        btnGuardar.setBackground(new java.awt.Color(18, 154, 118));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 240, 30));

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 280, 240));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/people-96.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(18, 154, 118));
        jLabel9.setText("Permisos:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 70, 30));

        btnLimpiar.setBackground(new java.awt.Color(18, 154, 118));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 270, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Usuario usuarios = gu.BuscarUsuario(txtId.getText());
        if (usuarios != null) {
            //se ubican los resultados obtenidos de la funcion ConsultarUsuarios
            txtId.setText(usuarios.getCodigo());
            txtLogin.setText(usuarios.getNikname());
            txtNombre.setText(usuarios.getFullname());
            txtPasword.setText(usuarios.getPassword());
            txtRol.setText(usuarios.getRol());
            lblPermisos.setText(usuarios.getCodBin());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (gu.eliminarusuario(txtId.getText()) == true) {
            JOptionPane.showMessageDialog(null, "Usuario elminado exitosamente");
            //llamo a la funcion limpiar para limpiar las entradas 
            limpiar();
        } else {
            System.out.println("Nose pudo eliminar");
            /*JOptionPane.showMessageDialog(null, "Nose pudo eliminar"); */
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String codBin = generarCodigo();
        gu.actualizarUsuario(new Usuario(
                txtId.getText(),
                txtNombre.getText(),
                txtLogin.getText(),
                txtPasword.getText(),
                txtRol.getText(), codBin), codBin);
        limpiar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void checkAuditoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAuditoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAuditoriasActionPerformed

    private void checkContenidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkContenidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkContenidosActionPerformed

    private void checkEmprendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEmprendedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkEmprendedoresActionPerformed

    private void checkEncargadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEncargadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkEncargadosActionPerformed

    private void checkProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkProductosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkProductosActionPerformed

    private void checkMentoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMentoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMentoriasActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String codBin = generarCodigo();
        //se llama a la funcion para ingresar registros a la bdd
        gu.insertarUsuario(new Usuario(
                txtId.getText(),
                txtNombre.getText(),
                txtLogin.getText(),
                txtPasword.getText(),
                txtRol.getText(), codBin), codBin);
        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        ListarUsuario ls = new ListarUsuario();
        ///añadimos el Formulario al DesktopPane
        this.getParent().add(ls);
        //hacemos visible Formulario 
        ls.setVisible(true);
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private String generarCodigo() {
        System.out.println("PERMISOS :");

        //Definir la pociciones del Array
        //permisos=new String[6];
        //permisos[0]--> usuario
        //permisos[1]--> Contenidos
        //permisos[2]--> Emprendedor
        //permisos[3]--> Encargado
        //permisos[4]--> Producto
        //permisos[5]--> Mentoria
        //permisos[6]--> Auditoria
        String permisos[] = {"0", "0", "0", "0", "0", "0", "0"};
        if (checkGestionUsuario.isSelected()) {
            System.out.println("-----------------------------");
            System.out.println("pantalla gestion Usuario permitida");
            permisos[0] = "1";
        }

        if (checkContenidos.isSelected()) {
            System.out.println("-----------------------------");
            System.out.println("pantalla gestion Contenidos permitida");
            permisos[1] = "1";
        }

        if (checkEmprendedores.isSelected()) {
            System.out.println("-----------------------------");
            System.out.println("pantalla gestion Emprendedor permitida");
            permisos[2] = "1";

        }

        if (checkEncargados.isSelected()) {

            System.out.println("-----------------------------");
            System.out.println("pantalla gestion Encargado permitida");
            permisos[3] = "1";
        }

        if (checkProductos.isSelected()) {

            System.out.println("-----------------------------");
            System.out.println("pantalla Proceso Producto permitida");
            permisos[4] = "1";
        }
        if (checkMentorias.isSelected()) {
            System.out.println("-----------------------------");
            System.out.println("pantalla Proceso Mentorias permitida");
            permisos[5] = "1";
        }
        if (checkAuditorias.isSelected()) {
            System.out.println("-----------------------------");
            System.out.println("pantalla Proceso Auditorias permitida");
            permisos[6] = "1";
        }
        String codigoBien = codigoUnido(permisos);
        System.out.println("-----------------------------");

        System.out.println("el codigo final es: " + codigoBien);
        JOptionPane.showMessageDialog(null, "CODIGO BIN: " + codigoBien);
        return codigoBien;

    }

    private void limpiar() {
        txtId.setText("");
        txtLogin.setText("");
        txtNombre.setText("");
        txtPasword.setText("");
        txtRol.setText("");;
        lblPermisos.setText("");
        checkAuditorias.setSelected(false);
        checkContenidos.setSelected(false);
        checkEmprendedores.setSelected(false);
        checkEncargados.setSelected(false);
        checkGestionUsuario.setSelected(false);
        checkMentorias.setSelected(false);
        checkProductos.setSelected(false);
        txtId.requestFocus();
    }

    private String codigoUnido(String codigo[]) {
        String codigoUnido = "";
        int length = codigo.length;

        for (int i = 0; i < length; i++) {
            codigoUnido = codigoUnido + codigo[i];
        }
        return codigoUnido;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JCheckBox checkAuditorias;
    private javax.swing.JCheckBox checkContenidos;
    private javax.swing.JCheckBox checkEmprendedores;
    private javax.swing.JCheckBox checkEncargados;
    private javax.swing.JCheckBox checkGestionUsuario;
    private javax.swing.JCheckBox checkMentorias;
    private javax.swing.JCheckBox checkProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblPermisos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPasword;
    private javax.swing.JTextField txtRol;
    // End of variables declaration//GEN-END:variables
}
