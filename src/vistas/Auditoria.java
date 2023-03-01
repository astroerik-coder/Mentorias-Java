/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import Utilidades.Utilidades;

/**
 *
 * @author Usuario
 */
public class Auditoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form Auditoria
     */
    public Auditoria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        title = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListar = new javax.swing.JTable();
        btnListarUsuarios1 = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Auditoria");
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setPreferredSize(new java.awt.Dimension(800, 700));

        bg.setBackground(new java.awt.Color(57, 57, 57));
        bg.setMaximumSize(new java.awt.Dimension(800, 600));
        bg.setMinimumSize(new java.awt.Dimension(800, 600));
        bg.setName(""); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(800, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiar.setBackground(new java.awt.Color(18, 154, 118));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        bg.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 140, 30));

        title.setBackground(new java.awt.Color(18, 154, 118));
        title.setForeground(new java.awt.Color(18, 154, 118));
        title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/audit.png"))); // NOI18N
        title.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Auditoria");
        title.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 250, 40));

        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 800, 80));

        tblListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblListar);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 780, 340));

        btnListarUsuarios1.setBackground(new java.awt.Color(18, 154, 118));
        btnListarUsuarios1.setForeground(new java.awt.Color(255, 255, 255));
        btnListarUsuarios1.setText("Actualizar");
        btnListarUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuarios1ActionPerformed(evt);
            }
        });
        bg.add(btnListarUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Utilidades u= new Utilidades();
        u.limpiartabla(tblListar);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnListarUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuarios1ActionPerformed
        Gestion.GestionAuditoria ga= new Gestion.GestionAuditoria();
        ga.MostrarAuditoria(tblListar);
    }//GEN-LAST:event_btnListarUsuarios1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListarUsuarios1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListar;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
