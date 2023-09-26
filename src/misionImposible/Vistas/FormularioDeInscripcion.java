

package misionImposible.Vistas;

import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import misionImposible.AccesoADatos.AlumnoData;
import misionImposible.AccesoADatos.Conexion;
import misionImposible.AccesoADatos.InscripcionData;
import misionImposible.AccesoADatos.MateriaData;
import misionImposible.entidades.Alumno;
import misionImposible.entidades.Inscripcion;
import misionImposible.entidades.Materia;


public class FormularioDeInscripcion extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modeloTabla=new DefaultTableModel();
    private ButtonGroup buttonGroup = new ButtonGroup();// un grupo de botones de radio solo uno de ellos puede estar seleccionado a la vez.
    InscripcionData iData=new InscripcionData();
    
    public FormularioDeInscripcion() {
        initComponents();
        
         cargarComboBox();
         armarCabecera();
         buttonGroup.add(jRmateriasInscriptas);
         buttonGroup.add(jRMatNoInscriptas);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorioInscripciones = new javax.swing.JPanel();
        jBsalir = new javax.swing.JButton();
        jBAnularInscripcion = new javax.swing.JButton();
        jBInscribir = new javax.swing.JButton();
        jRMatNoInscriptas = new javax.swing.JRadioButton();
        jRmateriasInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        ListaAlumnosComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(450, 470));

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBAnularInscripcion.setText("Anular Inscripcion");
        jBAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularInscripcionActionPerformed(evt);
            }
        });

        jBInscribir.setText("Inscribir");
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jRMatNoInscriptas.setText("Materias no Inscriptas");
        jRMatNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMatNoInscriptasActionPerformed(evt);
            }
        });

        jRmateriasInscriptas.setText("Materias Inscriptas");
        jRmateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRmateriasInscriptasActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTabla);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");

        ListaAlumnosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaAlumnosComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione un alumno:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Formulario de Inscripción");

        javax.swing.GroupLayout escritorioInscripcionesLayout = new javax.swing.GroupLayout(escritorioInscripciones);
        escritorioInscripciones.setLayout(escritorioInscripcionesLayout);
        escritorioInscripcionesLayout.setHorizontalGroup(
            escritorioInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioInscripcionesLayout.createSequentialGroup()
                .addGroup(escritorioInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioInscripcionesLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel3))
                    .addGroup(escritorioInscripcionesLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioInscripcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(escritorioInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioInscripcionesLayout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addGroup(escritorioInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioInscripcionesLayout.createSequentialGroup()
                                .addGroup(escritorioInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(escritorioInscripcionesLayout.createSequentialGroup()
                                        .addComponent(jRmateriasInscriptas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRMatNoInscriptas))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(escritorioInscripcionesLayout.createSequentialGroup()
                                        .addComponent(jBInscribir)
                                        .addGap(44, 44, 44)
                                        .addComponent(jBAnularInscripcion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBsalir)))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioInscripcionesLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(ListaAlumnosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))))
        );
        escritorioInscripcionesLayout.setVerticalGroup(
            escritorioInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioInscripcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(escritorioInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListaAlumnosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(escritorioInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRMatNoInscriptas)
                    .addComponent(jRmateriasInscriptas))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(escritorioInscripcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalir)
                    .addComponent(jBAnularInscripcion)
                    .addComponent(jBInscribir))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(681, 681, 681)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorioInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(escritorioInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(497, 497, 497))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListaAlumnosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaAlumnosComboBoxActionPerformed
            
          limpiarTabla(); // Limpia la tabla al seleccionar otro alumno
           buttonGroup.clearSelection(); // quita la seleccion de los botones radio

    }//GEN-LAST:event_ListaAlumnosComboBoxActionPerformed
   
    private void jRmateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRmateriasInscriptasActionPerformed
        jBInscribir.setEnabled(false);//anula el boton inscribir
        jBAnularInscripcion.setEnabled(true);//activa anular inscripcion

      
        Alumno alumnoSeleccionado = (Alumno) ListaAlumnosComboBox.getSelectedItem();//obtengo el alumno seleccionado

        limpiarTabla();//

        for (Materia materia : iData.obtenerMateriasCursadas(alumnoSeleccionado.getIdAlumno())) {// traemos las materias en las que el alumno seleccionado esta inscripto
            cargarDatos(materia);// le decimos la tabla que cargue los datos de las materias

        }


    }//GEN-LAST:event_jRmateriasInscriptasActionPerformed

    private void jRMatNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMatNoInscriptasActionPerformed
       jBAnularInscripcion.setEnabled(false);
       jBInscribir.setEnabled(true);
       
           
            Alumno alumnoSeleccionado = (Alumno) ListaAlumnosComboBox.getSelectedItem();//obtengo el alumno seleccionado

              limpiarTabla();
            for (Materia materia: iData.obtenerMateriaNOCursadas(alumnoSeleccionado.getIdAlumno())) {// traemos las materias en las que el alumno seleccionado NO esta inscripto
                cargarDatos(materia);// le decimos la tabla que cargue los datos de las materias
            }
                

    }//GEN-LAST:event_jRMatNoInscriptasActionPerformed

    private void jBAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularInscripcionActionPerformed
    
        
        int filaSeleccionada=jTabla.getSelectedRow();// traigo la fila seleccionada
        int idMateria=(Integer)jTabla.getValueAt(filaSeleccionada, 0);//getValue extrae el dato de la columna que necesitamos (en este caso 0 es la posicion del id)y lo extrae un Objeto por eso se debe castear
        
        
          Alumno alumnoSeleccionado = (Alumno) ListaAlumnosComboBox.getSelectedItem();//obtengo el alumno seleccionado
         
          int idAlumno=(Integer)alumnoSeleccionado.getIdAlumno();//obtengo id alumno
           
        
         iData.borrarInscripcionMateriaAlumno(idAlumno, idMateria);//creo la inscripcion sin pasar la nota
       
       actualizarTablaMateriasInscriptas(alumnoSeleccionado);//despues de anular la ins actualiza la tabla de las materias inscriptas actuales
        
    }//GEN-LAST:event_jBAnularInscripcionActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
       
        Alumno alumnoSeleccionado = (Alumno) ListaAlumnosComboBox.getSelectedItem();//obtengo el alumno seleccionado
        
        int filaSeleccionada = jTabla.getSelectedRow();// traigo la fila seleccionada
     int idMateria = (Integer) jTabla.getValueAt(filaSeleccionada, 0);

        Materia materiaSeleccionada = new Materia(idMateria);
        Inscripcion insc = new Inscripcion(alumnoSeleccionado, materiaSeleccionada);

        iData.guardarIscripcion(insc);
        actualizarTablaMateriasNoInscriptas(alumnoSeleccionado);// despues de inscribir actualiza la tabla de las materias no inscriptas
       

    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
       dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> ListaAlumnosComboBox;
    private javax.swing.JPanel escritorioInscripciones;
    private javax.swing.JButton jBAnularInscripcion;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRMatNoInscriptas;
    private javax.swing.JRadioButton jRmateriasInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
   
    
    private void cargarComboBox() {

        AlumnoData alu = new AlumnoData();
        
        for (Alumno alumno :alu.listarAlumnos()) {
            ListaAlumnosComboBox.addItem(alumno);
        }

    }

    private void armarCabecera() {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Año");
        jTabla.setModel(modeloTabla);
    }

    private void cargarDatos(Materia materia) {// a partir delbuton radio seleccionado mostrara estos datos de las materias en la tabla
        modeloTabla.addRow(new Object[]{
            materia.getIdMateria(),
            materia.getNombre(), 
            materia.getAnioMateria()
        });
    }

    private void limpiarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) jTabla.getModel();
        modeloTabla.setRowCount(0);
    }
    // estos metodos son para actualizar las tablas una vez hecha la inscipcion o anulada la inscripcion
    // tal vez se pudo hacer en un solo metodo, pero no lo logre.
    private void actualizarTablaMateriasInscriptas(Alumno alumno) {
        limpiarTabla();
        
      Alumno alumnoSeleccionado = (Alumno) ListaAlumnosComboBox.getSelectedItem();
          for(Materia mate:iData.obtenerMateriasCursadas(alumnoSeleccionado.getIdAlumno()) ) {
              cargarDatos(mate);
              
          }
                   
    }
        private void actualizarTablaMateriasNoInscriptas(Alumno alumno) {
             limpiarTabla();
       
      Alumno alumnoSeleccionado = (Alumno) ListaAlumnosComboBox.getSelectedItem();
          for(Materia mate:iData.obtenerMateriaNOCursadas(alumnoSeleccionado.getIdAlumno()) ) {
              cargarDatos(mate);
              
          }
            
            
            
        }
}//----fin clase



