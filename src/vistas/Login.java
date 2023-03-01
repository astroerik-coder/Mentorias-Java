package vistas;

import Gestion.GestionMentorias;
import Gestion.GestionUsuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

     GestionUsuario gu = new GestionUsuario();
     GestionMentorias gm=new GestionMentorias();
    int nv = 0;

    public Login() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        this.ocultar.setVisible(false);
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/IconoMentorias.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        FondoFarmacia = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        btnIngrasar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        VER = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mentorías");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo3.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 370, 520));

        FondoFarmacia.setBackground(new java.awt.Color(57, 57, 57));
        FondoFarmacia.setForeground(new java.awt.Color(57, 57, 57));
        FondoFarmacia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 154, 118));
        jLabel3.setText("USUARIO:");
        FondoFarmacia.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(18, 154, 118));
        jLabel4.setText("PASSWORD:");
        FondoFarmacia.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 30));

        txtLogin.setText("admin");
        txtLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtLoginMousePressed(evt);
            }
        });
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        FondoFarmacia.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 180, 30));

        btnIngrasar.setBackground(new java.awt.Color(18, 154, 118));
        btnIngrasar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngrasar.setText("Ingresar");
        btnIngrasar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngrasarActionPerformed(evt);
            }
        });
        FondoFarmacia.add(btnIngrasar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 136, 40));
        FondoFarmacia.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(18, 154, 118));
        jLabel5.setText("INICIA SESIÓN");
        jLabel5.setToolTipText("");
        FondoFarmacia.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 190, -1));

        jLabel6.setFont(new java.awt.Font("Wide Latin", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(18, 154, 118));
        jLabel6.setText("MENTORÍAS");
        jLabel6.setToolTipText("");
        FondoFarmacia.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 290, 60));

        txtContraseña.setForeground(new java.awt.Color(204, 204, 204));
        txtContraseña.setText("admin");
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        FondoFarmacia.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 180, 30));

        VER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ver.png"))); // NOI18N
        VER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VERMouseClicked(evt);
            }
        });
        FondoFarmacia.add(VER, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ocultar.png"))); // NOI18N
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });
        FondoFarmacia.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BOOK.png"))); // NOI18N
        FondoFarmacia.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 90));

        getContentPane().add(FondoFarmacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLoginMousePressed
        if (txtLogin.getText().equals("Ingrese su Usuario")) {
            txtLogin.setText("admin");
            txtLogin.setForeground(Color.black);
        }
        if (String.valueOf(txtContraseña.getPassword()).isEmpty()) {
            txtContraseña.setText("admin");
            txtContraseña.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txtLoginMousePressed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnIngrasarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngrasarActionPerformed
        // TODO add your handling code here:
       


        if (gu.verificarUsuario(txtLogin.getText(), txtContraseña.getText()) == true) {
            /**
             * JOptionPane.showMessageDialog(null, "-> Si Pertenece a Mentorias <-");
             */
            String userDb= txtLogin.getText();
                        
            Menu pri = new Menu();
            Login lg= new Login();
            pri.obtenerUser(userDb);
            
            String permisos = gu.getrolBin(txtLogin.getText(), txtContraseña.getText());
            System.out.println("Usuario: "+txtLogin.getText());
            System.out.println("rol definido: ");
            System.out.println(permisos);

            String permisosDiv[] = permisos.split("");
            int length = permisosDiv.length;
            System.out.println("tamaño array: " + length);
            //System.out.println(permisosDiv[4]);
            for (int i = 0; i < length; i++) {
                //System.out.println("array pos "+i+" : "+permisosDiv[i]);
            }

            if (!"0".equals(permisosDiv[0])) {
                if ("1".equals(permisosDiv[0])) {

                    System.out.println("-----------------------------");
                    System.out.println("1.-pantalla  Usuario habilitada");
                }

            } else {
                System.out.println("-----------------------------");
                System.out.println("pantalla Usuario NO habilitada");
                pri.mnuUsuarios.setVisible(false);
            }

            //habilitar pantalla Contenidos
            if (!"0".equals(permisosDiv[1])) {
                if ("1".equals(permisosDiv[1])) {

                    System.out.println("-----------------------------");
                    System.out.println("pantalla Contenidos habilitada");
                }

            } else {
                System.out.println("-----------------------------");
                System.out.println("pantalla Contenidos NO habilitada");
                pri.mnuContenidos.setVisible(false);
            }

            //habilitar pantalla Emprendedor
            if (!"0".equals(permisosDiv[2])) {
                if ("1".equals(permisosDiv[2])) {
                    System.out.println("-----------------------------");
                    System.out.println("pantalla Emprendedor habilitada");
                }

            } else {
                System.out.println("-----------------------------");
                System.out.println("pantalla Emprendedor NO habilitada");
                pri.mnuEmprendedor.setVisible(false);
            }

            //habilitar pantalla Encargado
            if (!"0".equals(permisosDiv[3])) {
                if ("1".equals(permisosDiv[3])) {
                    System.out.println("-----------------------------");
                    System.out.println("pantalla  Encargado habilitada");
                }
            } else {

                System.out.println("-----------------------------");
                System.out.println("pantalla  Encargado NO habilitada");
                pri.mnuEncargado.setVisible(false);
            }

            //habilitar pantalla Produto
            if (!"0".equals(permisosDiv[4])) {
                if ("1".equals(permisosDiv[4])) {
                    System.out.println("-----------------------------");
                    System.out.println("pantalla Produto habilitada");
                }
            } else {

                System.out.println("-----------------------------");
                System.out.println("pantalla Produto NO habilitada");
                pri.mnuProductos.setVisible(false);
            }
            //habilitar pantalla Mentorias
            if (!"0".equals(permisosDiv[5])) {
                if ("1".equals(permisosDiv[5])) {
                    System.out.println("-----------------------------");
                    System.out.println("pantalla Mentorias habilitada");
                }
            } else {
                System.out.println("-----------------------------");
                System.out.println("pantalla Mentorias NO habilitada");
                pri.mnuMentorias.setVisible(false);
            }
            //habilitar pantalla Auditoria
            if (!"0".equals(permisosDiv[6])) {
                if ("1".equals(permisosDiv[6])) {
                    System.out.println("-----------------------------");
                    System.out.println("pantalla de Auditoria habilitada");
                }
            } else {
                System.out.println("-----------------------------");
                System.out.println("pantalla de Auditoria NO habilitada");
                pri.mnuAuditoria.setVisible(false);
            }
            this.hide();
            pri.setVisible(true);

        } else {
            
            JOptionPane.showMessageDialog(null, "NO Pertenece a Mentorias ");
            //System.exit(0);//para que se cierre el sistema
            nv++;
            if (nv == 3)//le doy 3 veces la oprtunidad de loguearse
            {
                System.exit(0);
            }
        }

    }//GEN-LAST:event_btnIngrasarActionPerformed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        if (String.valueOf(txtContraseña.getPassword()).equals("********")) {
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
        }
        if (txtLogin.getText().isEmpty()) {
            txtLogin.setText("Ingrese su Usuario");
            txtLogin.setForeground(Color.gray);
        }

    }//GEN-LAST:event_txtContraseñaMousePressed

    private void VERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VERMouseClicked
        VER.setVisible(false);
        ocultar.setVisible(true);
        txtContraseña.setEchoChar((char) 0);
    }//GEN-LAST:event_VERMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        VER.setVisible(true);
        ocultar.setVisible(false);
        txtContraseña.setEchoChar('*');

    }//GEN-LAST:event_ocultarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoFarmacia;
    private javax.swing.JLabel VER;
    private javax.swing.JButton btnIngrasar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel ocultar;
    private javax.swing.JPasswordField txtContraseña;
    public static javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
