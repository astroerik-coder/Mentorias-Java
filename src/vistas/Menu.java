package vistas;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu extends javax.swing.JFrame {

    Fecha time = new Fecha();

    public Menu() {
        initComponents();
        Inicio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mnuUsuarios = new javax.swing.JMenuItem();
        mnuContenidos = new javax.swing.JMenuItem();
        mnuEmprendedor = new javax.swing.JMenuItem();
        mnuEncargado = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        mnucompras = new javax.swing.JMenu();
        mnuProductos = new javax.swing.JMenuItem();
        mnuMentorias = new javax.swing.JMenuItem();
        mnuAuditoria = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mentorías");
        setMinimumSize(new java.awt.Dimension(1024, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content1.setBackground(new java.awt.Color(18, 154, 118));
        content1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bgc.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 57, 57));
        jLabel2.setText("Bienvenido a Mentorias");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 57, 57));

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(57, 57, 57));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblUser.setForeground(new java.awt.Color(57, 57, 57));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 57, 57));
        jLabel4.setText("Fecha: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 57, 57));
        jLabel5.setText("Hola:");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(57, 57, 57));

        content1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        content1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        content1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        content1.setLayer(lblFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        content1.setLayer(lblUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        content1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        content1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        content1.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout content1Layout = new javax.swing.GroupLayout(content1);
        content1.setLayout(content1Layout);
        content1Layout.setHorizontalGroup(
            content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(105, 105, 105)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jLabel3)
                .addGap(423, 423, 423)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2045, Short.MAX_VALUE)
        );
        content1Layout.setVerticalGroup(
            content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content1Layout.createSequentialGroup()
                .addGroup(content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(content1Layout.createSequentialGroup()
                        .addGroup(content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(content1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(content1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 900));

        menuBar.setBackground(new java.awt.Color(57, 57, 57));
        menuBar.setMaximumSize(new java.awt.Dimension(1024, 750));
        menuBar.setMinimumSize(new java.awt.Dimension(1024, 750));
        menuBar.setPreferredSize(new java.awt.Dimension(178, 97));

        fileMenu.setBackground(new java.awt.Color(102, 255, 255));
        fileMenu.setForeground(new java.awt.Color(18, 154, 118));
        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/General.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("GENERAL");

        mnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuUsuarios.setBackground(new java.awt.Color(57, 57, 57));
        mnuUsuarios.setForeground(new java.awt.Color(18, 154, 118));
        mnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        mnuUsuarios.setMnemonic('o');
        mnuUsuarios.setText("Usuarios");
        mnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuariosActionPerformed(evt);
            }
        });
        fileMenu.add(mnuUsuarios);

        mnuContenidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuContenidos.setBackground(new java.awt.Color(57, 57, 57));
        mnuContenidos.setForeground(new java.awt.Color(18, 154, 118));
        mnuContenidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/content-32.png"))); // NOI18N
        mnuContenidos.setMnemonic('s');
        mnuContenidos.setText("Contenidos");
        mnuContenidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuContenidosActionPerformed(evt);
            }
        });
        fileMenu.add(mnuContenidos);

        mnuEmprendedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuEmprendedor.setBackground(new java.awt.Color(57, 57, 57));
        mnuEmprendedor.setForeground(new java.awt.Color(18, 154, 118));
        mnuEmprendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrepreneur-32.png"))); // NOI18N
        mnuEmprendedor.setMnemonic('a');
        mnuEmprendedor.setText("Emprendedor");
        mnuEmprendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEmprendedorActionPerformed(evt);
            }
        });
        fileMenu.add(mnuEmprendedor);

        mnuEncargado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuEncargado.setBackground(new java.awt.Color(57, 57, 57));
        mnuEncargado.setForeground(new java.awt.Color(18, 154, 118));
        mnuEncargado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/encargado-32.png"))); // NOI18N
        mnuEncargado.setText("Encargado");
        mnuEncargado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnuEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEncargadoActionPerformed(evt);
            }
        });
        fileMenu.add(mnuEncargado);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setBackground(new java.awt.Color(57, 57, 57));
        exitMenuItem.setForeground(new java.awt.Color(18, 154, 118));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit ->");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        mnucompras.setBackground(new java.awt.Color(57, 57, 57));
        mnucompras.setForeground(new java.awt.Color(18, 154, 118));
        mnucompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administracion.png"))); // NOI18N
        mnucompras.setMnemonic('e');
        mnucompras.setText("PRINCIPAL");

        mnuProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuProductos.setBackground(new java.awt.Color(57, 57, 57));
        mnuProductos.setForeground(new java.awt.Color(18, 154, 118));
        mnuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/product-32.png"))); // NOI18N
        mnuProductos.setMnemonic('t');
        mnuProductos.setText("Productos");
        mnuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProductosActionPerformed(evt);
            }
        });
        mnucompras.add(mnuProductos);

        mnuMentorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuMentorias.setBackground(new java.awt.Color(57, 57, 57));
        mnuMentorias.setForeground(new java.awt.Color(18, 154, 118));
        mnuMentorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mentorias.png"))); // NOI18N
        mnuMentorias.setText("Mentorías");
        mnuMentorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMentoriasActionPerformed(evt);
            }
        });
        mnucompras.add(mnuMentorias);

        mnuAuditoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        mnuAuditoria.setBackground(new java.awt.Color(57, 57, 57));
        mnuAuditoria.setForeground(new java.awt.Color(18, 154, 118));
        mnuAuditoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/auditory-32.png"))); // NOI18N
        mnuAuditoria.setText("Auditoria");
        mnuAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAuditoriaActionPerformed(evt);
            }
        });
        mnucompras.add(mnuAuditoria);

        menuBar.add(mnucompras);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String dato;

    public void obtenerUser(String dato) {
        this.dato = dato;
        lblUsuario.setText(dato);
    }

    private void mostrarTiempo() {
        lblFecha.setText(time.fechaCompleta);
    }

    private void Inicio() {
        mostrarTiempo();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/IconoMentorias.png")).getImage());
    }

    private void mnuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProductosActionPerformed
        try {
            // TODO add your handling code here:
            Producto prod = new Producto();
            content1.add(prod);
            prod.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuProductosActionPerformed

    private void mnuMentoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMentoriasActionPerformed
        Mentorias men = null;
        try {
            men = new Mentorias();
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        content1.add(men);
        men.setVisible(true);
    }//GEN-LAST:event_mnuMentoriasActionPerformed

    private void mnuAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAuditoriaActionPerformed
        Auditoria au = new Auditoria();
        content1.add(au);
        au.setVisible(true);

    }//GEN-LAST:event_mnuAuditoriaActionPerformed

    private void mnuEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEncargadoActionPerformed
        // TODO add your handling code here:
        Encargado enc = new Encargado();
        content1.add(enc);
        enc.setVisible(true);
    }//GEN-LAST:event_mnuEncargadoActionPerformed

    private void mnuEmprendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEmprendedorActionPerformed
        // TODO add your handling code here:
        Emprendedor emp = new Emprendedor();
        content1.add(emp);
        emp.setVisible(true);
    }//GEN-LAST:event_mnuEmprendedorActionPerformed

    private void mnuContenidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuContenidosActionPerformed
        // TODO add your handling code here:
        Contenidos con = new Contenidos();
        content1.add(con);
        con.setVisible(true);
    }//GEN-LAST:event_mnuContenidosActionPerformed

    private void mnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuariosActionPerformed
        // TODO add your handling code here:
        Usuarios ifrm = new Usuarios();
        content1.add(ifrm);
        ifrm.show();
    }//GEN-LAST:event_mnuUsuariosActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed

        Login inicioSesion = new Login();
        this.hide();
        inicioSesion.setVisible(true);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane content1;
    private javax.swing.JMenuItem exitMenuItem;
    public static javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblUser;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JMenuItem mnuAuditoria;
    public static javax.swing.JMenuItem mnuContenidos;
    public static javax.swing.JMenuItem mnuEmprendedor;
    public static javax.swing.JMenuItem mnuEncargado;
    public static javax.swing.JMenuItem mnuMentorias;
    public static javax.swing.JMenuItem mnuProductos;
    public static javax.swing.JMenuItem mnuUsuarios;
    public static javax.swing.JMenu mnucompras;
    // End of variables declaration//GEN-END:variables
}
