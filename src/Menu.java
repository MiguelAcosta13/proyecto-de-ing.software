/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_tablaparti = new javax.swing.JButton();
        btn_tablaAdmin = new javax.swing.JButton();
        btn_registrarproyecto = new javax.swing.JButton();
        btn_tablaproyecto = new javax.swing.JButton();
        btn_registrarTareas = new javax.swing.JButton();
        btn_cerrarS = new javax.swing.JButton();
        lbl_back7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_tablaparti.setText("VER PARTICIPANTES");
        btn_tablaparti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tablapartiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tablaparti, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, -1));

        btn_tablaAdmin.setText("VER ADMINISTRADORES");
        btn_tablaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tablaAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tablaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, -1));

        btn_registrarproyecto.setText("REGISTRAR PROYECTO");
        btn_registrarproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarproyectoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrarproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 23, 210, 50));

        btn_tablaproyecto.setText("VER PROYECTOS");
        btn_tablaproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tablaproyectoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tablaproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, -1));

        btn_registrarTareas.setText("REGISTRAR TAREAS");
        btn_registrarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarTareasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrarTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 230, 50));

        btn_cerrarS.setText("CERRAR SESION");
        btn_cerrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarSActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cerrarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 160, 60));

        lbl_back7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/3a245d83eef7a69961c7f19540e972c1.jpg"))); // NOI18N
        getContentPane().add(lbl_back7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tablapartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tablapartiActionPerformed
        // TODO add your handling code here:
        ver_participantes ver = new ver_participantes();
        ver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_tablapartiActionPerformed

    private void btn_tablaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tablaAdminActionPerformed
        // TODO add your handling code here:
         ver_admin ver1 = new ver_admin();
        ver1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_tablaAdminActionPerformed

    private void btn_registrarproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarproyectoActionPerformed
        // TODO add your handling code here:
        registrar_proyecto regis = new registrar_proyecto();
        regis.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_registrarproyectoActionPerformed

    private void btn_cerrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarSActionPerformed
        // TODO add your handling code here:
        ventana2 ven1= new ventana2();
        ven1.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_cerrarSActionPerformed

    private void btn_tablaproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tablaproyectoActionPerformed
        // TODO add your handling code here:
        ver_proyectos ver= new ver_proyectos();
        ver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_tablaproyectoActionPerformed

    private void btn_registrarTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarTareasActionPerformed
        // TODO add your handling code here:
        registrarTareas re1 = new registrarTareas();
        re1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_registrarTareasActionPerformed

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
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrarS;
    private javax.swing.JButton btn_registrarTareas;
    private javax.swing.JButton btn_registrarproyecto;
    private javax.swing.JButton btn_tablaAdmin;
    private javax.swing.JButton btn_tablaparti;
    private javax.swing.JButton btn_tablaproyecto;
    private javax.swing.JLabel lbl_back7;
    // End of variables declaration//GEN-END:variables
}
