/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.GestionConductores;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

/**
 *
 * @author Estibenson
 */
public class GestionConductores extends javax.swing.JFrame {

    Object[] opcionesEliminarCond = {"Si, Eliminar Conductor","No, Cancelar"};
    /**
     * Creates new form GestionConductores
     */
    public GestionConductores() {
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

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btnCondSalir = new javax.swing.JButton();
        btnCondEditar = new javax.swing.JButton();
        btnCondVerTodos = new javax.swing.JButton();
        btnCondEliminar = new javax.swing.JButton();
        btnCondIrARegNuevo = new javax.swing.JButton();
        btnCondBuscar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setTitle("Gestión de Conductores");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No. documento", "Nombre", "Apellido", "Dirección", "FechaNacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 880, 230));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 172, 40));

        jLabel2.setText("Buscar valor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 20));

        jRadioButton1.setText("Nombre");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jRadioButton2.setText("Apellido");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabel3.setText("Busqueda por:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 51, 105, 24));

        btnCondSalir.setText("Salir");
        btnCondSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCondSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnCondSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, 140, 50));

        btnCondEditar.setText("Editar");
        getContentPane().add(btnCondEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 140, 50));

        btnCondVerTodos.setText("Ver todos");
        btnCondVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCondVerTodosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCondVerTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 140, 50));

        btnCondEliminar.setText("Eliminar");
        btnCondEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCondEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCondEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 140, 50));

        btnCondIrARegNuevo.setText("Registrar");
        btnCondIrARegNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCondIrARegNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCondIrARegNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 140, 50));

        btnCondBuscar1.setText("Buscar");
        btnCondBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCondBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCondBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 140, 50));

        jButton2.setText("Asignar Bus");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 140, 50));

        jButton3.setText("Detalles conductor");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 120, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btnCondBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCondBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCondBuscar1ActionPerformed

    private void btnCondVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCondVerTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCondVerTodosActionPerformed

    private void btnCondIrARegNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCondIrARegNuevoActionPerformed

        RegistrarConductor registrar = new RegistrarConductor();
        registrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCondIrARegNuevoActionPerformed

    private void btnCondSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCondSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCondSalirActionPerformed

    private void btnCondEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCondEliminarActionPerformed
        int n = JOptionPane.showOptionDialog(this, "Seguro desea eliminar el Conductor?", "Eliminar Conductor", JOptionPane.YES_NO_CANCEL_OPTION, WIDTH, null,opcionesEliminarCond, opcionesEliminarCond[1]);
        if (n==0) {
            // eliminar conductor
            JOptionPane.showMessageDialog(this, "Conductor eliminado exitosamente");
        }
    }//GEN-LAST:event_btnCondEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCondBuscar1;
    private javax.swing.JButton btnCondEditar;
    private javax.swing.JButton btnCondEliminar;
    private javax.swing.JButton btnCondIrARegNuevo;
    private javax.swing.JButton btnCondSalir;
    private javax.swing.JButton btnCondVerTodos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
