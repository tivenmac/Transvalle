/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.GestiondeRutas;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

/**
 *
 * @author ESTIBENSON MAESTRE
 */
public class GestionRutas extends javax.swing.JFrame {

    Object[] opcionesEliminarRuta = {"Si, Eliminar Ruta","No, Cancelar"};
    /**
     * Creates new form GestionRutas
     */
    public GestionRutas() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRutaPrincipal = new javax.swing.JTable();
        btnRutaIrAgregar = new javax.swing.JButton();
        btnRutaSalir = new javax.swing.JButton();
        btnRutaIrAConsultarRuta = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnRutaEliminar = new javax.swing.JButton();

        setTitle("Gestión de Rutas");

        tablaRutaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID. Ruta", "Nombre", "Planilla control", "Capacidad", "descripción", "Descripción Retorno", "Descripción salida", "Frecuencia", "gabela", "Longitud", "Tiempo Recorrido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaRutaPrincipal);

        jScrollPane2.setViewportView(jScrollPane1);

        btnRutaIrAgregar.setText("Agregar Ruta");
        btnRutaIrAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaIrAgregarActionPerformed(evt);
            }
        });

        btnRutaSalir.setText("Salir");
        btnRutaSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaSalirActionPerformed(evt);
            }
        });

        btnRutaIrAConsultarRuta.setText("Consultar Rutas");
        btnRutaIrAConsultarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaIrAConsultarRutaActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar ");

        jLabel1.setText("Insertar valor a Buscar:");

        jRadioButton1.setText("Vial");

        jRadioButton2.setText("Ruta");

        btnRutaEliminar.setText("Eliminar Ruta");
        btnRutaEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutaEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRutaIrAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRutaIrAConsultarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(btnRutaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                        .addComponent(btnRutaSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jRadioButton2)
                        .addGap(59, 59, 59)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRutaIrAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRutaSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRutaIrAConsultarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRutaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRutaIrAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutaIrAgregarActionPerformed
        GestionRutas rutas = new GestionRutas();
        rutas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRutaIrAgregarActionPerformed

    private void btnRutaIrAConsultarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutaIrAConsultarRutaActionPerformed
        
    }//GEN-LAST:event_btnRutaIrAConsultarRutaActionPerformed

    private void btnRutaEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutaEliminarActionPerformed
        int n = JOptionPane.showOptionDialog(this, "Seguro desea eliminar la Ruta?", "Eliminar Ruta", JOptionPane.YES_NO_CANCEL_OPTION, WIDTH, null,opcionesEliminarRuta, opcionesEliminarRuta[1]);
        if (n==0) {
            // eliminar conductor
            JOptionPane.showMessageDialog(this, "Ruta eliminada exitosamente");
        }
    }//GEN-LAST:event_btnRutaEliminarActionPerformed

    private void btnRutaSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutaSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnRutaSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRutaEliminar;
    private javax.swing.JButton btnRutaIrAConsultarRuta;
    private javax.swing.JButton btnRutaIrAgregar;
    private javax.swing.JButton btnRutaSalir;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaRutaPrincipal;
    // End of variables declaration//GEN-END:variables
}
