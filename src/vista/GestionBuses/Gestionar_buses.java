/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.GestionBuses;

import javax.swing.JOptionPane;

/**
 *
 * @author Estibenson
 */
public class Gestionar_buses extends javax.swing.JFrame {
    
    Object[] opcionesEliminarBus = {"Si, Eliminar Bus","No, Cancelar"};

    /**
     * Creates new form Gestionar_buses
     */
    public Gestionar_buses() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGestBusIrARegistrarBus = new javax.swing.JButton();
        btnGestBusSalir = new javax.swing.JButton();
        btnGestBusIrAEditarBus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ConsultaBus_comboBox = new javax.swing.JComboBox<>();
        btnGestionBusesIrAVerDocumentos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabBusesListaDeBuses = new javax.swing.JTable();
        btnGestBusIrAEliminarBus = new javax.swing.JButton();

        setTitle("Gestionar Buses");

        btnGestBusIrARegistrarBus.setText("Registar Bus");
        btnGestBusIrARegistrarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestBusIrARegistrarBusActionPerformed(evt);
            }
        });

        btnGestBusSalir.setText("Salir");
        btnGestBusSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestBusSalirActionPerformed(evt);
            }
        });

        btnGestBusIrAEditarBus.setText("Editar Bus");

        jLabel1.setText("Digite Busqueda:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");

        jLabel2.setText("Consultar por:");

        ConsultaBus_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID_Propietario", "Placa", "Vial" }));

        btnGestionBusesIrAVerDocumentos.setText("Ver documentos");
        btnGestionBusesIrAVerDocumentos.setName("btnGestionBusesIrAVerDocumentos"); // NOI18N
        btnGestionBusesIrAVerDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionBusesIrAVerDocumentosActionPerformed(evt);
            }
        });

        tabBusesListaDeBuses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_Bus", "Vial", "PlanillaControl", "Capacidad", "Clase", "Clase de servicio", "Estado", "FechaMatricula", "VidaUtil", "Marca", "Modelo", "No.Chasis", "No.Motor", "placa", "vida util"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabBusesListaDeBuses.setColumnSelectionAllowed(true);
        tabBusesListaDeBuses.setRowHeight(17);
        tabBusesListaDeBuses.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabBusesListaDeBuses);
        tabBusesListaDeBuses.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabBusesListaDeBuses.getColumnModel().getColumnCount() > 0) {
            tabBusesListaDeBuses.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabBusesListaDeBuses.getColumnModel().getColumn(2).setPreferredWidth(120);
            tabBusesListaDeBuses.getColumnModel().getColumn(4).setPreferredWidth(130);
            tabBusesListaDeBuses.getColumnModel().getColumn(5).setPreferredWidth(130);
        }

        jScrollPane2.setViewportView(jScrollPane1);

        btnGestBusIrAEliminarBus.setText("Eliminar Bus");
        btnGestBusIrAEliminarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestBusIrAEliminarBusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ConsultaBus_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnGestionBusesIrAVerDocumentos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGestBusIrAEliminarBus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                        .addComponent(btnGestBusIrARegistrarBus)
                        .addGap(18, 18, 18)
                        .addComponent(btnGestBusIrAEditarBus)
                        .addGap(18, 18, 18)
                        .addComponent(btnGestBusSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ConsultaBus_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestionBusesIrAVerDocumentos)
                    .addComponent(btnGestBusIrARegistrarBus)
                    .addComponent(btnGestBusIrAEditarBus)
                    .addComponent(btnGestBusSalir)
                    .addComponent(btnGestBusIrAEliminarBus))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        btnGestBusIrARegistrarBus.getAccessibleContext().setAccessibleName("Registar Bus");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestBusSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestBusSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnGestBusSalirActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        String id =(String)tabBusesListaDeBuses.getValueAt(tabBusesListaDeBuses.getSelectedRow(), 0);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnGestBusIrARegistrarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestBusIrARegistrarBusActionPerformed
        Registro_de_Buses registro = new Registro_de_Buses();
        registro.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestBusIrARegistrarBusActionPerformed

    private void btnGestBusIrAEliminarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestBusIrAEliminarBusActionPerformed
        int n = JOptionPane.showOptionDialog(this, "Seguro desea eliminar el bus?", "eliminar bus", JOptionPane.YES_NO_CANCEL_OPTION, WIDTH, null, opcionesEliminarBus, opcionesEliminarBus[1]);
        if (n==0) {
            // eliminar bus
            JOptionPane.showMessageDialog(this, "Conductor eliminado exitosamente");
            
        } 
            
        
    }//GEN-LAST:event_btnGestBusIrAEliminarBusActionPerformed

    private void btnGestionBusesIrAVerDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionBusesIrAVerDocumentosActionPerformed
        // TODO add your handling code here:
        DocumentosBus documentos = new DocumentosBus();
        documentos.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnGestionBusesIrAVerDocumentosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ConsultaBus_comboBox;
    private javax.swing.JButton btnGestBusIrAEditarBus;
    private javax.swing.JButton btnGestBusIrAEliminarBus;
    private javax.swing.JButton btnGestBusIrARegistrarBus;
    private javax.swing.JButton btnGestBusSalir;
    private javax.swing.JButton btnGestionBusesIrAVerDocumentos;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabBusesListaDeBuses;
    // End of variables declaration//GEN-END:variables
}
