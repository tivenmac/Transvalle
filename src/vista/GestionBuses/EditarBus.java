/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.GestionBuses;

/**
 *
 * @author oscar
 */
public class EditarBus extends javax.swing.JFrame {

    /**
     * Creates new form EditarBus
     */
    public EditarBus() {
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

        jLabel11 = new javax.swing.JLabel();
        txtGestBusEdtBusClase = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGestBusEdtBusServicio = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtGestBusEdtBusFechaMatricula = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnGestBusEdtBusGuardar = new javax.swing.JButton();
        txtGestBusEdtBusPlaca = new javax.swing.JTextField();
        txtGestBusEdtBusVidaUtil = new javax.swing.JTextField();
        txtGestBusEdtBusEstado = new javax.swing.JTextField();
        txtGestBusEdtBusMarca = new javax.swing.JTextField();
        txtGestBusEdtBusChasis = new javax.swing.JTextField();
        txtGestBusEdtBusMotor = new javax.swing.JTextField();
        txtGestBusEdtBusCapacidad = new javax.swing.JTextField();
        txtGestBusEdtBusVial = new javax.swing.JTextField();
        txtGestBusRegEdtPlanillaControl = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("FechaMatricula:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 192, -1, -1));

        txtGestBusEdtBusClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Microbus", "Bus" }));
        getContentPane().add(txtGestBusEdtBusClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 47, -1, -1));

        jLabel1.setText("Placa:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, -1, -1));

        jLabel12.setText("Clase:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 52, -1, -1));

        jLabel13.setText("Clase de Servicio:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jLabel2.setText("Vial:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 10, -1, -1));

        txtGestBusEdtBusServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preferencial", "Estandar" }));
        getContentPane().add(txtGestBusEdtBusServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 84, -1));

        jLabel3.setText("Marca:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 94, -1, -1));
        getContentPane().add(txtGestBusEdtBusFechaMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 178, -1, -1));

        jLabel4.setText("Capacidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jLabel5.setText("No.Chasis:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 139, -1, -1));

        jLabel6.setText("Planilla Control:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 241, -1, -1));

        jLabel7.setText("No.Motor:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 139, -1, -1));

        jLabel8.setText("Estado:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 241, -1, -1));

        jLabel10.setText("Vida Util:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 186, -1, -1));

        btnGestBusEdtBusGuardar.setText("Guardar Cambios");
        btnGestBusEdtBusGuardar.setName("RegistrarBusBtn"); // NOI18N
        btnGestBusEdtBusGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestBusEdtBusGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGestBusEdtBusGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 160, 42));
        getContentPane().add(txtGestBusEdtBusPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 6, 92, -1));
        getContentPane().add(txtGestBusEdtBusVidaUtil, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 182, 92, -1));
        getContentPane().add(txtGestBusEdtBusEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 237, 92, -1));
        getContentPane().add(txtGestBusEdtBusMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 90, 92, -1));
        getContentPane().add(txtGestBusEdtBusChasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 135, 92, -1));
        getContentPane().add(txtGestBusEdtBusMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 135, 92, -1));
        getContentPane().add(txtGestBusEdtBusCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 92, -1));

        txtGestBusEdtBusVial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGestBusEdtBusVialActionPerformed(evt);
            }
        });
        getContentPane().add(txtGestBusEdtBusVial, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 6, 92, -1));
        getContentPane().add(txtGestBusRegEdtPlanillaControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 237, 92, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGestBusEdtBusVialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGestBusEdtBusVialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGestBusEdtBusVialActionPerformed

    private void btnGestBusEdtBusGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestBusEdtBusGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestBusEdtBusGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarBus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestBusEdtBusGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtGestBusEdtBusCapacidad;
    private javax.swing.JTextField txtGestBusEdtBusChasis;
    private javax.swing.JComboBox<String> txtGestBusEdtBusClase;
    private javax.swing.JTextField txtGestBusEdtBusEstado;
    private com.toedter.calendar.JDateChooser txtGestBusEdtBusFechaMatricula;
    private javax.swing.JTextField txtGestBusEdtBusMarca;
    private javax.swing.JTextField txtGestBusEdtBusMotor;
    private javax.swing.JTextField txtGestBusEdtBusPlaca;
    private javax.swing.JComboBox<String> txtGestBusEdtBusServicio;
    private javax.swing.JTextField txtGestBusEdtBusVial;
    private javax.swing.JTextField txtGestBusEdtBusVidaUtil;
    private javax.swing.JTextField txtGestBusRegEdtPlanillaControl;
    // End of variables declaration//GEN-END:variables
}
