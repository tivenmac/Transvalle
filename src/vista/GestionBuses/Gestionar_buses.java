/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.GestionBuses;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bus;

/**
 *
 * @author Estibenson
 */
public class Gestionar_buses extends javax.swing.JFrame {
    
    Object[] opcionesEliminarBus = {"Si, Eliminar Bus","No, Cancelar"};
    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction tx;
    List<Bus> buses;

    /**
     * Creates new form Gestionar_buses
     */
    public Gestionar_buses() {
        emf = Persistence.createEntityManagerFactory("TransvallePU");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        initComponents();
        setLocationRelativeTo(null);
        
        buses = em.createNamedQuery("Bus.findAll").getResultList();

        Object[] columnNames = {"Vial", "Placa", "Modelo", "Clase", "Marca","Capacidad","No. Motor","No. Chasis","Fecha de Matricula","Observaciones","Estado","Clase de servicio"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames);
        for (Bus  bus: buses) {
            Object[] o = new Object[12];
            o[0] = bus.getVial();
            o[1] = bus.getPlaca();
            o[2] = bus.getModelo();
            o[3] = bus.getClase();
            o[4] = bus.getMarca();
            o[5] = bus.getCapacidad();
            o[6] = bus.getNumeroMotor();
            o[7] = bus.getNumeroChasis();
            o[8] = bus.getFechaMatricula();
            o[9] = bus.getObservaciones();
            o[10] = bus.getEstado();
            o[11] = bus.getClaseServicio();         
            model.addRow(o);
        }
        tabBusesListaDeBuses.setModel(model);
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
        jButton1 = new javax.swing.JButton();

        setTitle("Gestionar Buses");

        btnGestBusIrARegistrarBus.setBackground(new java.awt.Color(0, 204, 255));
        btnGestBusIrARegistrarBus.setForeground(new java.awt.Color(255, 255, 255));
        btnGestBusIrARegistrarBus.setText("Registar Bus");
        btnGestBusIrARegistrarBus.setBorder(null);
        btnGestBusIrARegistrarBus.setBorderPainted(false);
        btnGestBusIrARegistrarBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestBusIrARegistrarBus.setFocusPainted(false);
        btnGestBusIrARegistrarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestBusIrARegistrarBusActionPerformed(evt);
            }
        });

        btnGestBusSalir.setBackground(new java.awt.Color(0, 204, 255));
        btnGestBusSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnGestBusSalir.setText("Salir");
        btnGestBusSalir.setBorder(null);
        btnGestBusSalir.setBorderPainted(false);
        btnGestBusSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestBusSalir.setFocusPainted(false);
        btnGestBusSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestBusSalirActionPerformed(evt);
            }
        });

        btnGestBusIrAEditarBus.setBackground(new java.awt.Color(0, 204, 255));
        btnGestBusIrAEditarBus.setForeground(new java.awt.Color(255, 255, 255));
        btnGestBusIrAEditarBus.setText("Editar Bus");
        btnGestBusIrAEditarBus.setBorder(null);
        btnGestBusIrAEditarBus.setBorderPainted(false);
        btnGestBusIrAEditarBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestBusIrAEditarBus.setFocusPainted(false);

        jLabel1.setText("Digite Busqueda:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton4.setText("Buscar");

        jLabel2.setText("Consultar por:");

        ConsultaBus_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Placa", "Vial" }));

        btnGestionBusesIrAVerDocumentos.setBackground(new java.awt.Color(0, 204, 255));
        btnGestionBusesIrAVerDocumentos.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionBusesIrAVerDocumentos.setText("Ver documentos");
        btnGestionBusesIrAVerDocumentos.setBorder(null);
        btnGestionBusesIrAVerDocumentos.setBorderPainted(false);
        btnGestionBusesIrAVerDocumentos.setFocusPainted(false);
        btnGestionBusesIrAVerDocumentos.setName("btnGestionBusesIrAVerDocumentos"); // NOI18N
        btnGestionBusesIrAVerDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionBusesIrAVerDocumentosActionPerformed(evt);
            }
        });

        tabBusesListaDeBuses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Vial", "Placal", "Modelo", "Clase", "Marca", "Capacidad", "No.Motor", "No.Chasis", "FechaMatricula", "observaciones", "Estado", "Clase de servicio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabBusesListaDeBuses.setRowHeight(17);
        tabBusesListaDeBuses.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabBusesListaDeBuses);
        if (tabBusesListaDeBuses.getColumnModel().getColumnCount() > 0) {
            tabBusesListaDeBuses.getColumnModel().getColumn(0).setPreferredWidth(80);
            tabBusesListaDeBuses.getColumnModel().getColumn(1).setPreferredWidth(120);
            tabBusesListaDeBuses.getColumnModel().getColumn(3).setPreferredWidth(130);
            tabBusesListaDeBuses.getColumnModel().getColumn(11).setPreferredWidth(130);
        }

        jScrollPane2.setViewportView(jScrollPane1);

        btnGestBusIrAEliminarBus.setBackground(new java.awt.Color(0, 204, 255));
        btnGestBusIrAEliminarBus.setForeground(new java.awt.Color(255, 255, 255));
        btnGestBusIrAEliminarBus.setText("Eliminar Bus");
        btnGestBusIrAEliminarBus.setBorder(null);
        btnGestBusIrAEliminarBus.setBorderPainted(false);
        btnGestBusIrAEliminarBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestBusIrAEliminarBus.setFocusPainted(false);
        btnGestBusIrAEliminarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestBusIrAEliminarBusActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Imprimir Bus");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);

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
                        .addGap(31, 31, 31)
                        .addComponent(btnGestBusIrAEliminarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                        .addComponent(btnGestBusIrARegistrarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnGestBusIrAEditarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnGestBusSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
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
                    .addComponent(btnGestionBusesIrAVerDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestBusIrARegistrarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestBusIrAEditarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestBusSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestBusIrAEliminarBus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

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
        Registro_de_Buses registro = new Registro_de_Buses(emf, em, tx);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabBusesListaDeBuses;
    // End of variables declaration//GEN-END:variables
}
