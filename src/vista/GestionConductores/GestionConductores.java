/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.GestionConductores;

import static java.awt.image.ImageObserver.WIDTH;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bus;
import model.Persona;

/**
 *
 * @author Estibenson
 */
public class GestionConductores extends javax.swing.JFrame {

    private EntityManagerFactory emf;
    private EntityManager em;
    private EntityTransaction tx;
    List<Persona> lista;
    DefaultTableModel model;
    List<Bus> buses;

    Object[] opcionesEliminarCond = {"Si, Eliminar Conductor", "No, Cancelar"};

    /**
     * Creates new form GestionConductores
     */
    public GestionConductores() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("TransvallePU");
            em = emf.createEntityManager();
            tx = em.getTransaction();
        }

        initComponents();
        this.setLocationRelativeTo(null);

        lista = em.createNamedQuery("Persona.findAll").getResultList();
        buses = em.createNamedQuery("Bus.findAll").getResultList();    // consultar en la base de datos todos los buses y crear lista con los mismos

        Object[] columnNames = {"No. Documento", "Nombre", "Apellidos", "Direccion", "Fecha de Nacimiento"};
        model = new DefaultTableModel(new Object[0][0], columnNames);
        for (Persona persona : lista) {
            Object[] o = new Object[5];
            o[0] = persona.getCedula();
            o[1] = persona.getNombre();
            o[2] = persona.getApellido();
            o[3] = persona.getDirección();
            o[4] = persona.getFechaNacimiento();
            model.addRow(o);
        }
        tablaConductores.setModel(model);

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
        botonesBusqueda = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConductores = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        radNombre = new javax.swing.JRadioButton();
        radApellido = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btnCondSalir = new javax.swing.JButton();
        btnCondEditar = new javax.swing.JButton();
        btnCondEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnCondIrARegNuevo1 = new javax.swing.JButton();
        btnVerTodos = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setTitle("Gestión de Conductores");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaConductores.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaConductores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaConductores);

        jScrollPane2.setViewportView(jScrollPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 880, 230));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 172, 40));

        jLabel2.setText("Buscar valor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 20));

        botonesBusqueda.add(radNombre);
        radNombre.setSelected(true);
        radNombre.setText("Nombre");
        radNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNombreActionPerformed(evt);
            }
        });
        getContentPane().add(radNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        botonesBusqueda.add(radApellido);
        radApellido.setText("Apellido");
        getContentPane().add(radApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabel3.setText("Busqueda por:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 51, 105, 24));

        btnCondSalir.setBackground(new java.awt.Color(0, 204, 255));
        btnCondSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnCondSalir.setText("Salir");
        btnCondSalir.setBorder(null);
        btnCondSalir.setBorderPainted(false);
        btnCondSalir.setFocusPainted(false);
        btnCondSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCondSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnCondSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 120, 40));

        btnCondEditar.setBackground(new java.awt.Color(0, 204, 255));
        btnCondEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnCondEditar.setText("Editar");
        btnCondEditar.setBorder(null);
        btnCondEditar.setBorderPainted(false);
        btnCondEditar.setFocusPainted(false);
        btnCondEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCondEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCondEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 130, 40));

        btnCondEliminar.setBackground(new java.awt.Color(0, 204, 255));
        btnCondEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnCondEliminar.setText("Eliminar");
        btnCondEliminar.setBorder(null);
        btnCondEliminar.setBorderPainted(false);
        btnCondEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCondEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCondEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 120, 40));

        btnBuscar.setBackground(new java.awt.Color(0, 204, 255));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 130, 40));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Asignar Bus");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 130, 40));

        btnCondIrARegNuevo1.setBackground(new java.awt.Color(0, 204, 255));
        btnCondIrARegNuevo1.setForeground(new java.awt.Color(255, 255, 255));
        btnCondIrARegNuevo1.setText("Registrar");
        btnCondIrARegNuevo1.setBorder(null);
        btnCondIrARegNuevo1.setBorderPainted(false);
        btnCondIrARegNuevo1.setFocusPainted(false);
        btnCondIrARegNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCondIrARegNuevo1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCondIrARegNuevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 130, 40));

        btnVerTodos.setBackground(new java.awt.Color(0, 204, 255));
        btnVerTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerTodos.setText("Ver todos");
        btnVerTodos.setBorder(null);
        btnVerTodos.setBorderPainted(false);
        btnVerTodos.setFocusPainted(false);
        btnVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodosActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radNombreActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar el campo con un nombre o apellido para buscar el conductor.", "Falta nombre o apellido", JOptionPane.ERROR_MESSAGE);

        } else if (radApellido.isSelected()) {
            String apellido = txtBuscar.getText();
            TypedQuery a = em.createNamedQuery("Persona.findByApellido", Persona.class);
            a.setParameter("apellido", apellido);

            lista = a.getResultList();

            if (lista.isEmpty()) {

                JOptionPane.showMessageDialog(this, "No existe el conductor.", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                model.setRowCount(0);
                for (Persona persona : lista) {
                    Object[] o = new Object[5];
                    o[0] = persona.getCedula();
                    o[1] = persona.getNombre();
                    o[2] = persona.getApellido();
                    o[3] = persona.getDirección();
                    o[4] = persona.getFechaNacimiento();

                    model.addRow(o);
                }
            }
        } else if (radNombre.isSelected()) {
            String nombre = txtBuscar.getText();
            TypedQuery a = em.createNamedQuery("Persona.findByNombre", Persona.class);
            a.setParameter("nombre", nombre);

            lista = a.getResultList();

            if (lista.isEmpty()) {

                JOptionPane.showMessageDialog(this, "No existe el conductor.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                model.setRowCount(0);
                for (Persona persona : lista) {
                    Object[] o = new Object[5];
                    o[0] = persona.getCedula();
                    o[1] = persona.getNombre();
                    o[2] = persona.getApellido();
                    o[3] = persona.getDirección();
                    o[4] = persona.getFechaNacimiento();

                    model.addRow(o);
                }

            }
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCondSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCondSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCondSalirActionPerformed

    private void btnCondEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCondEliminarActionPerformed
        int row = tablaConductores.getSelectedRow();
        if (row != -1) {    //fila seleccionada
            Persona p = lista.get(row);
            int n = JOptionPane.showOptionDialog(this, "Seguro desea eliminar el Conductor?", "Eliminar Conductor", JOptionPane.YES_NO_CANCEL_OPTION, WIDTH, null, opcionesEliminarCond, opcionesEliminarCond[1]);
            if (n == 0) {
                // eliminar conductor           
                tx.begin();
                em.remove(em.merge(p));
                tx.commit();
                JOptionPane.showMessageDialog(this, "Conductor eliminado exitosamente");
            }
        } else { // no se selecciono ninguna fila
            JOptionPane.showMessageDialog(this, "Debe Seleccionar un conductor para editar.", "Ningun conductor seleccionado", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnCondEliminarActionPerformed

    private void btnCondEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCondEditarActionPerformed
        int row = tablaConductores.getSelectedRow();
        if (row != -1) {    //fila seleccionada
            Persona p = lista.get(row);
            RegistrarConductor registrar = new RegistrarConductor(emf, em, tx, p);
            registrar.setVisible(true);
            this.setVisible(false);
        } else { // no se selecciono ninguna fila
            JOptionPane.showMessageDialog(this, "Debe Seleccionar un conductor para editar.", "Ningun conductor seleccionado", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnCondEditarActionPerformed

    private void btnCondIrARegNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCondIrARegNuevo1ActionPerformed
        RegistrarConductor registrar = new RegistrarConductor(emf, em, tx);  // ir a registrar conductor
        registrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCondIrARegNuevo1ActionPerformed

    private void btnVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodosActionPerformed
        lista = em.createNamedQuery("Persona.findAll").getResultList();

        Object[] columnNames = {"No. Documento", "Nombre", "Apellidos", "Direccion", "Fecha de Nacimiento"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columnNames);
        for (Persona persona : lista) {
            Object[] o = new Object[5];
            o[0] = persona.getCedula();
            o[1] = persona.getNombre();
            o[2] = persona.getApellido();
            o[3] = persona.getDirección();
            o[4] = persona.getFechaNacimiento();
            model.addRow(o);
        }
        tablaConductores.setModel(model);
    }//GEN-LAST:event_btnVerTodosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Asignar bus
        int row = tablaConductores.getSelectedRow();
        if (row != -1) {    //fila seleccionada
            String[] viales = new String[buses.size()]; // array con todos los viales
            for (int i = 0; i < buses.size(); i++) {
                viales[i] = buses.get(i).getVial();
            }
            Persona p = lista.get(row);

            String vial = (String) JOptionPane.showInputDialog(this,
                    "Asignar a " + p.getNombre() + "C.C. " + p.getCedula(),
                    "Asignar bus",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    viales,
                    viales[0]);

            //Bus busAsignado = new Bus();
            TypedQuery consultaBus = em.createNamedQuery("Bus.findByVial", Bus.class);
            consultaBus.setParameter("vial", vial);

            List<Bus> listaConsulta = consultaBus.getResultList();
            for (Bus busAsignado : listaConsulta) {
                //busAsignado.setPersona(p);
                p.setBusidBus(busAsignado);
                tx.begin();
                em.merge(p);
                tx.commit();
                System.err.println(busAsignado.getIdBus());
                JOptionPane.showMessageDialog(this, "Bus asignado exitosamente");
            }

        } else { // no se selecciono ninguna fila
            JOptionPane.showMessageDialog(this, "Debe Seleccionar un conductor para asignar bus.", "Ningun conductor seleccionado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botonesBusqueda;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCondEditar;
    private javax.swing.JButton btnCondEliminar;
    private javax.swing.JButton btnCondIrARegNuevo1;
    private javax.swing.JButton btnCondSalir;
    private javax.swing.JButton btnVerTodos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radApellido;
    private javax.swing.JRadioButton radNombre;
    private javax.swing.JTable tablaConductores;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
