
package misionImposible.Vistas;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import misionImposible.AccesoADatos.AlumnoData;
import misionImposible.AccesoADatos.InscripcionData;
import misionImposible.entidades.Alumno;
import misionImposible.entidades.Inscripcion;



public class cargaDeNotas extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel();
public List<Alumno> alumno = new ArrayList<>();
public List<Inscripcion> insc = new ArrayList<>();
private int idAlumno;
   
public  cargaDeNotas() {
    
        initComponents();
        llenarCB();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaCargaNotas = new javax.swing.JTable();
        jbotonGuardar = new javax.swing.JButton();
        jbotonSalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(450, 470));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Seleccione un Alumno : ");

        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jTablaCargaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaCargaNotas);
        if (jTablaCargaNotas.getColumnModel().getColumnCount() > 0) {
            jTablaCargaNotas.getColumnModel().getColumn(0).setResizable(false);
            jTablaCargaNotas.getColumnModel().getColumn(1).setResizable(false);
        }

        jbotonGuardar.setText("Guardar");
        jbotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonGuardarActionPerformed(evt);
            }
        });

        jbotonSalir.setText("Salir");
        jbotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbotonGuardar)
                .addGap(119, 119, 119)
                .addComponent(jbotonSalir)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbotonGuardar)
                    .addComponent(jbotonSalir))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonSalirActionPerformed
        
        dispose();
    }//GEN-LAST:event_jbotonSalirActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
         /* boton de evento del combo box. Captura la seleccion del item, extrae la 
         primera parte de la cadena, que es el dni del alumno. 
         Busca el alumno con el dni en la lista y cuando lo encuentra guarda el id del alumno
         en una variable de instancia. Ese dato va a servir en otro metodo...
         Luego muestra los datos en la tabla
        */
        String seleccion = (String) jcbAlumno.getSelectedItem();
        String[] aux = seleccion.split(",");
        modelo.setRowCount(0);

        if (!seleccion.equals("  -- Seleccionar Item -- ")) {
            // encontrar el id del alumno
            for (Alumno alu : this.alumno) {

                if (Integer.parseInt(aux[0]) == alu.getDni()) {
                    idAlumno = alu.getIdAlumno();
                    break;
                }
            }
            // obtener la lista de materias a las que esta inscripto el alumno
            insc = null;
            muestraCargadeNota_en_Tabla();
        }
    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jbotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbotonGuardarActionPerformed
        
        int nroFilas = jTablaCargaNotas.getRowCount();
        int seleccion = jTablaCargaNotas.getSelectedRow();
        double nota=0;
        
        if ((nroFilas > 0) && (seleccion != -1)) {

            int respuesta = JOptionPane.showConfirmDialog(null,
                    "Desea Modificar la nota existente ", "Guardar Nota", JOptionPane.OK_CANCEL_OPTION);
            
            if (respuesta == 0) {
                nota =validarNuevaNota();

                InscripcionData i = new InscripcionData();
                int idMateria = (Integer) modelo.getValueAt(seleccion, 0);
                i.actualizarNota(idAlumno, idMateria, nota);
                muestraCargadeNota_en_Tabla();
            }
        } else if (nroFilas == 0) {
            JOptionPane.showMessageDialog(null, "No se puede Guardar, la tabla no contiene elementos");
        } else {
            JOptionPane.showMessageDialog(null, "Debe selecionar una opcion de la tabla para poder modificar la nota");
        }                  
    }//GEN-LAST:event_jbotonGuardarActionPerformed
//--------------------------------------------------------------------------------------------- 
    private void muestraCargadeNota_en_Tabla(){
        
        InscripcionData i = new InscripcionData();
        insc = i.obtenerInscripcionesPorAlumno(idAlumno);
        modelo.setRowCount(0);

        for (Inscripcion inscricpion : insc) {
            modelo.addRow(new Object[]{inscricpion.getMateria().getIdMateria(),
                inscricpion.getMateria().getNombre(), inscricpion.getNota()});
        }
    }
//---------------------------------------------------------------------------------------------
    private double validarNuevaNota(){
        
        double nota = 0;
        boolean aux = true;

        do {
            try {
                nota = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Ingrese la nueva nota", "Modificar Nota", JOptionPane.QUESTION_MESSAGE));

                if ((nota >= 0.0) && (nota <= 10.0)) {
                    aux = false;
                } else {
                    JOptionPane.showMessageDialog(null, "La nota ingresada no puede ser menor que 0 ni mayor que 10");
                }

            } catch (NumberFormatException | NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese una nota válida");
            }
        } while (aux);
        nota = Math.round(nota * Math.pow(10,2)) / Math.pow(10,2);
        return nota;
    }
//------------------------------------------------------------------------------
    private void armarCabecera() {

        modelo.addColumn("Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        jTablaCargaNotas.setModel(modelo);
    }
//------------------------------------------------------------------------------
    private void llenarCB() {
        //Cargar el combo box con los items
        AlumnoData a = new AlumnoData();
        alumno = null;
        
        alumno = a.listarAlumnos();
        jcbAlumno.removeAllItems();
        jcbAlumno.addItem("  -- Seleccionar Item -- ");
        
        for (Alumno aux:this.alumno){
        
            jcbAlumno.addItem(aux.getDni()+", "+aux.getApellido()+" ,"+aux.getNombre());       
        }  
    }
//------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaCargaNotas;
    private javax.swing.JButton jbotonGuardar;
    private javax.swing.JButton jbotonSalir;
    private javax.swing.JComboBox<String> jcbAlumno;
    // End of variables declaration//GEN-END:variables
//------------------------------------------------------------------------------

}//fin class
