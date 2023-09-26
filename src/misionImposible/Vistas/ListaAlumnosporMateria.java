/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misionImposible.Vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import misionImposible.AccesoADatos.MateriaData;
import misionImposible.entidades.Materia;
import misionImposible.AccesoADatos.Conexion;
import misionImposible.AccesoADatos.InscripcionData;
import misionImposible.entidades.Alumno;

/**
 *
 * @author 54911
 */
public class ListaAlumnosporMateria extends javax.swing.JInternalFrame {
private DefaultTableModel modelo=new DefaultTableModel();
    /**
     * Creates new form ListaAlumnosporMateria
     */
    public ListaAlumnosporMateria() {
        initComponents();
        armarCabecera();
        cargarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlumnos = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(450, 470));

        jLabel1.setText("Seleccione una materia");

        jcbMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMateriasActionPerformed(evt);
            }
        });

        jtAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtAlumnos);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Listado de Alumnos por Materia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbSalir)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMateriasActionPerformed
        Materia selectedItem = (Materia) jcbMaterias.getSelectedItem();
        InscripcionData iData = new InscripcionData();
            
            limpiarTabla();
            for (Alumno alumno: iData.obtenerAlumnosXMateria(selectedItem.getIdMateria())) {
                cargarDatos(alumno);
    } 
    }//GEN-LAST:event_jcbMateriasActionPerformed
    
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
            dispose();
    }//GEN-LAST:event_jbSalirActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Materia> jcbMaterias;
    private javax.swing.JTable jtAlumnos;
    // End of variables declaration//GEN-END:variables

private void armarCabecera(){
    modelo.addColumn("idAlumno");
    modelo.addColumn("DNI");
    modelo.addColumn("Apellido");
    modelo.addColumn("Nombre");
    jtAlumnos.setModel(modelo);
}

private void cargarCombo(){
   
    MateriaData mate = new MateriaData();// la creo para buscar el metodo ( validar) ver como limpio el combo box al inicio
    ArrayList<Materia> listaMaterias = (ArrayList<Materia>) mate.listarMaterias();
    
 //   jcbMaterias.removeAllItems();
    
   
    for (Materia materia : listaMaterias) {
       jcbMaterias.addItem(materia);
       }
}

private void limpiarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) jtAlumnos.getModel();
        modeloTabla.setRowCount(0);
    }

private void cargarDatos(Alumno alumno) {
        modelo.addRow(new Object[]{
            alumno.getIdAlumno(),
            alumno.getDni(),
            alumno.getApellido(),
            alumno.getNombre()});
    }
}
