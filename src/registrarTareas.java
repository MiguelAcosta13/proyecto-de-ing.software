/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class registrarTareas extends javax.swing.JFrame {

    /**
     * Creates new form registrarTareas
     */
    public registrarTareas() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.txtParticipantes.removeAllItems();
        this.txtproyecto.removeAllItems();
        this.txtprioridad.removeAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_proyecto = new javax.swing.JLabel();
        txtproyecto = new javax.swing.JComboBox<>();
        lbl_participante = new javax.swing.JLabel();
        txtParticipantes = new javax.swing.JComboBox<>();
        lbl_nombreTarea = new javax.swing.JLabel();
        txtnombretarea = new javax.swing.JTextField();
        lbl_objetivo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobjetivo = new javax.swing.JTextArea();
        lbl_fechaInicio = new javax.swing.JLabel();
        txtfechainicio = new com.toedter.calendar.JDateChooser();
        lbl_fechatermino = new javax.swing.JLabel();
        txtfechatermino = new com.toedter.calendar.JDateChooser();
        lbl_prioridad = new javax.swing.JLabel();
        txtprioridad = new javax.swing.JComboBox<>();
        btnregistrar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        back10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_proyecto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_proyecto.setForeground(new java.awt.Color(240, 240, 240));
        lbl_proyecto.setText("PROYECTO:");
        getContentPane().add(lbl_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        txtproyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(txtproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 110, -1));

        lbl_participante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_participante.setForeground(new java.awt.Color(240, 240, 240));
        lbl_participante.setText("PARTICIPANTES: ");
        getContentPane().add(lbl_participante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        txtParticipantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(txtParticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 110, -1));

        lbl_nombreTarea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nombreTarea.setForeground(new java.awt.Color(240, 240, 240));
        lbl_nombreTarea.setText("NOMBRE DE LA TAREA:");
        getContentPane().add(lbl_nombreTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));
        getContentPane().add(txtnombretarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 200, -1));

        lbl_objetivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_objetivo.setForeground(new java.awt.Color(240, 240, 240));
        lbl_objetivo.setText("OBJETIVO:");
        getContentPane().add(lbl_objetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        txtobjetivo.setColumns(20);
        txtobjetivo.setRows(5);
        jScrollPane1.setViewportView(txtobjetivo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 200, -1));

        lbl_fechaInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fechaInicio.setForeground(new java.awt.Color(240, 240, 240));
        lbl_fechaInicio.setText("FECHA DE INICIO:");
        getContentPane().add(lbl_fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        txtfechainicio.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(txtfechainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 200, -1));

        lbl_fechatermino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fechatermino.setForeground(new java.awt.Color(240, 240, 240));
        lbl_fechatermino.setText("FECHA DE TERMINO:");
        getContentPane().add(lbl_fechatermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        txtfechatermino.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(txtfechatermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 200, -1));

        lbl_prioridad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_prioridad.setForeground(new java.awt.Color(240, 240, 240));
        lbl_prioridad.setText("PRIORIDAD:");
        getContentPane().add(lbl_prioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        txtprioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(txtprioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 120, -1));

        btnregistrar.setText("REGISTRAR");
        getContentPane().add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 150, 50));

        btnregresar.setText("REGRESAR");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 150, 50));

        back10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/3a245d83eef7a69961c7f19540e972c1.jpg"))); // NOI18N
        getContentPane().add(back10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        // TODO add your handling code here:
        Menu men= new Menu();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnregresarActionPerformed

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
            java.util.logging.Logger.getLogger(registrarTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarTareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back10;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fechaInicio;
    private javax.swing.JLabel lbl_fechatermino;
    private javax.swing.JLabel lbl_nombreTarea;
    private javax.swing.JLabel lbl_objetivo;
    private javax.swing.JLabel lbl_participante;
    private javax.swing.JLabel lbl_prioridad;
    private javax.swing.JLabel lbl_proyecto;
    private javax.swing.JComboBox<String> txtParticipantes;
    private com.toedter.calendar.JDateChooser txtfechainicio;
    private com.toedter.calendar.JDateChooser txtfechatermino;
    private javax.swing.JTextField txtnombretarea;
    private javax.swing.JTextArea txtobjetivo;
    private javax.swing.JComboBox<String> txtprioridad;
    private javax.swing.JComboBox<String> txtproyecto;
    // End of variables declaration//GEN-END:variables
}
