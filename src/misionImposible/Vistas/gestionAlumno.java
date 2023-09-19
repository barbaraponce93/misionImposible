
package misionImposible.Vistas;


import java.awt.event.KeyEvent;
import java.sql.Date;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import misionImposible.AccesoADatos.AlumnoData;
import misionImposible.entidades.Alumno;


public class gestionAlumno extends javax.swing.JInternalFrame {
    public int idUltimaBusqueda;
   
    public gestionAlumno() {
        initComponents();       
        activar_o_Desactivar_CamposYBotonesAlumno(false);
        botonNuevo.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtApellidoAlumno = new javax.swing.JTextField();
        jtDniAlumno = new javax.swing.JTextField();
        jtNombreAlumno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxEstado = new javax.swing.JCheckBox();
        botonBuscar = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jdFechaNacimientoAlumno = new com.toedter.calendar.JDateChooser();

        setResizable(true);
        setPreferredSize(new java.awt.Dimension(390, 400));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Alumnos");

        jLabel3.setText("Documento");

        jLabel4.setText("Apellido");

        jLabel5.setText("Nombre");

        jLabel6.setText("Fecha Nacimiento ");

        jtApellidoAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoAlumnoKeyTyped(evt);
            }
        });

        jtDniAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniAlumnoKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtDniAlumnoKeyPressed(evt);
            }
        });

        jtNombreAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreAlumnoKeyTyped(evt);
            }
        });

        jLabel2.setText("Estado");

        jCheckBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxEstadoActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(botonEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(botonGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(botonSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtDniAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(jtApellidoAlumno))
                                .addGap(18, 18, 18)
                                .addComponent(botonBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(80, 80, 80)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxEstado)
                                    .addComponent(jtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdFechaNacimientoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDniAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBoxEstado))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdFechaNacimientoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botonEliminar)
                    .addComponent(botonGuardar)
                    .addComponent(botonSalir))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//------------------------------------------------------------------------------------------------------------------
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed

        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed
//------------------------------------------------------------------------------------------------------------------
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // Botón buscar alumno por dni
       
        AlumnoData alu = new AlumnoData();
        Alumno alumno = new Alumno();
        alumno = null;
        int dni;
       
        if (jtDniAlumno.getText().isEmpty()){  // si el campo esta vacío
            
            activar_o_Desactivar_CamposYBotonesAlumno(false);
            limpiarCamposGestionAlumno();
            JOptionPane.showMessageDialog(this,"Ingresar número DNI ");
            botonNuevo.setEnabled(true);
            
        }else{
            
            dni = Integer.parseInt(jtDniAlumno.getText());
            alumno = alu.buscarAlumnoPorDni(dni);
            
            if (alumno != null){// encontro y lleno el alumno con el que encontro en la base de datos               
                activar_o_Desactivar_CamposYBotonesAlumno(true);
                botonGuardar.setEnabled(false);               
                botonNuevo.setEnabled(false);
                idUltimaBusqueda = alumno.getIdAlumno();

                jtDniAlumno.setText(String.valueOf(dni));
                jtApellidoAlumno.setText(alumno.getApellido());
                jtNombreAlumno.setText(alumno.getNombre());
                jCheckBoxEstado.setSelected(alumno.isEstado());
                jCheckBoxEstado.setEnabled(false);
                jdFechaNacimientoAlumno.setDate(Date.valueOf(alumno.getfechaNacimiento()));  
                  
            }else{ //no encontro el alumno en la base de datos con el dni
                  limpiarCamposGestionAlumno();
                  activar_o_Desactivar_CamposYBotonesAlumno(false);
                  botonNuevo.setEnabled(true);
            }
        
        }
    }//GEN-LAST:event_botonBuscarActionPerformed
//------------------------------------------------------------------------------------------------------------------
    private void jtDniAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniAlumnoKeyTyped
     // restringe el tipo de dato que puede ingresar y muestra un msj cuando
     // el puntero del mouse se acerca al campo
     // limitar el ingreso de numeros igual al de la base de datos para que no genere un error   
     // El tipo de dato int es un entero de 32 bits complemento a dos.
     // Su valor mínimo es -2,147,483,648 y el máximo 2,147,483,647 (inclusive)
     
      char c = evt.getKeyChar();
       
        if (c < '0' || c > '9'){ 
            jtDniAlumno.setToolTipText("Ingresar solo números");            
            evt.consume(); 
        }
        if (jtDniAlumno.getText().length() >= 9){
            evt.consume();
        }
    }//GEN-LAST:event_jtDniAlumnoKeyTyped
//-----------------------------------------------------------------------------------
    private void jCheckBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxEstadoActionPerformed
        
        botonGuardar.setEnabled(true);
        botonEliminar.setEnabled(false);
    }//GEN-LAST:event_jCheckBoxEstadoActionPerformed
//-----------------------------------------------------------------------------------
    private void jtNombreAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreAlumnoKeyTyped
    // restringe el campo para que se ingresen solamente letras (mayusculas y minusculas )
    // y el espacio...
    
        char c = evt.getKeyChar();
        
        if (!(Character.isLetter(c)||c==' ')||jtNombreAlumno.getText().length() >=20){
        evt.consume();
        jtNombreAlumno.setToolTipText("Ingresar solo letras, no más de 20 caracteres "); 
    }
        botonGuardar.setEnabled(true);
        botonEliminar.setEnabled(false);
    }//GEN-LAST:event_jtNombreAlumnoKeyTyped
//-----------------------------------------------------------------------------------
    private void jtApellidoAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoAlumnoKeyTyped
     // restringe el campo para que se ingresen solamente letras (mayusculas y minusculas )
    // y el espacio...
    
        char c = evt.getKeyChar();
       
        if (!(Character.isLetter(c)||c==' ')||jtApellidoAlumno.getText().length() >=20){
            evt.consume();
            jtNombreAlumno.setToolTipText("Ingresar solo letras, no más de 20 caracteres "); 
        }
        botonGuardar.setEnabled(true);
        botonEliminar.setEnabled(false);
    }//GEN-LAST:event_jtApellidoAlumnoKeyTyped
//-----------------------------------------------------------------------------------
    private void jtDniAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniAlumnoKeyPressed
       
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
        
            botonBuscar.requestFocus();     
        }       
        if (!botonNuevo.isEnabled() && (!botonGuardar.isEnabled()) && (botonEliminar.isEnabled())){     
            
            botonGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_jtDniAlumnoKeyPressed

//------------------------------------------------------------------------------------------------------------------
    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
             
        int respuesta =JOptionPane.showConfirmDialog(null,
                "Desea guardar un nuevo Alumno ","Guardar Alumno",JOptionPane.OK_CANCEL_OPTION);
       
        if (respuesta == 0){
          
            if (jtDniAlumno.getText().isEmpty() || 
               jtNombreAlumno.getText().isEmpty() || 
               jtApellidoAlumno.getText().isEmpty() || 
               jdFechaNacimientoAlumno.getDate() == null){
                
                JOptionPane.showMessageDialog(null, "Hay campos sin completar");
                
            }else if (botonBuscar.isEnabled()){ 
             // si el boton buscar esta activo tiene que modificar con un update sino es un alumno nuevo solamente lo 
             // ingresa   
               AlumnoData alu = new AlumnoData();
               Alumno alumno = new Alumno();
               
               alumno = alu.buscarAlumno(idUltimaBusqueda);
               
               alumno.setDni(Integer.parseInt(jtDniAlumno.getText()));
               alumno.setApellido(jtApellidoAlumno.getText());
               alumno.setNombre(jtNombreAlumno.getText());
               alumno.setfechaNacimiento(jdFechaNacimientoAlumno.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());                      
    //         alumno.setEstado(jCheckBoxEstado.isSelected());
                
               alu.modificarAlumno(alumno);
               
               limpiarCamposGestionAlumno();
               activar_o_Desactivar_CamposYBotonesAlumno(false);
               botonNuevo.setEnabled(true);
            
            }else{ 
              
               AlumnoData alu = new AlumnoData();
               Alumno alumno = new Alumno();
               alumno.setDni(Integer.parseInt(jtDniAlumno.getText()));
               alumno.setApellido(jtApellidoAlumno.getText());
               alumno.setNombre(jtNombreAlumno.getText());
               alumno.setfechaNacimiento(jdFechaNacimientoAlumno.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());                      
               alumno.setEstado(true);
               
               alu.guardarAlumno(alumno);
               JOptionPane.showMessageDialog(null, "Se agrego un nuevo alumno");
               limpiarCamposGestionAlumno();
               activar_o_Desactivar_CamposYBotonesAlumno(false);
               botonNuevo.setEnabled(true);

            }
        }  
    }//GEN-LAST:event_botonGuardarActionPerformed
//------------------------------------------------------------------------------------------------------------------
    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
       
        int respuesta =JOptionPane.showConfirmDialog(null,
                "Desea agregar un nuevo Alumno","Nuevo Alumno",JOptionPane.OK_OPTION);

        if (respuesta == 0){
            limpiarCamposGestionAlumno();
            activar_o_Desactivar_CamposYBotonesAlumno(true);
            jCheckBoxEstado.setSelected(true);
            jCheckBoxEstado.setEnabled(false);
            botonBuscar.setEnabled(false);
            botonEliminar.setEnabled(false);
            botonNuevo.setEnabled(false);
        }
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
     int respuesta =JOptionPane.showConfirmDialog(null,
                "Desea eliminar este Alumno","Eliminar Alumno",JOptionPane.OK_OPTION);

        if (respuesta == 0){
            
            AlumnoData alu = new AlumnoData();
            alu.eliminarAlumno(idUltimaBusqueda);
            
            limpiarCamposGestionAlumno();
            activar_o_Desactivar_CamposYBotonesAlumno(true);
            botonNuevo.setEnabled(true);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void jdFechaNacimientoAlumnoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaNacimientoAlumnoPropertyChange
     
//        if ("date".equals(evt.getPropertyName())) {

//        if ((jdFechaNacimientoAlumno != null)) {
//            // Habilitar botones relacionados con la acción
//            botonGuardar.setEnabled(false);
//            botonEliminar.setEnabled(true);
//
//        }else if ("date".equals(evt.getPropertyName())){
//            botonGuardar.setEnabled(true);
//            botonEliminar.setEnabled(false);
//        }
//    }
    }//GEN-LAST:event_jdFechaNacimientoAlumnoPropertyChange
   
//------------------------------------------------------------------------------------------------------------------
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JCheckBox jCheckBoxEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JDateChooser jdFechaNacimientoAlumno;
    private javax.swing.JTextField jtApellidoAlumno;
    private javax.swing.JTextField jtDniAlumno;
    private javax.swing.JTextField jtNombreAlumno;
    // End of variables declaration//GEN-END:variables
//------------------------------------------------------------------------------------------------------------------
public void limpiarCamposGestionAlumno(){
    
    jtDniAlumno.setText("");
    jtApellidoAlumno.setText("");
    jtNombreAlumno.setText("");
    jCheckBoxEstado.setSelected(false);
    jdFechaNacimientoAlumno.setDate(null);
}
//------------------------------------------------------------------------------------------------------------------
public void activar_o_Desactivar_CamposYBotonesAlumno(boolean a){
 
    botonNuevo.setEnabled(a);
    botonEliminar.setEnabled(a);
    botonGuardar.setEnabled(a);
    jtApellidoAlumno.setEnabled(a);
    jtNombreAlumno.setEnabled(a);
    jCheckBoxEstado.setEnabled(a);
    jdFechaNacimientoAlumno.setEnabled(a);
}
//------------------------------------------------------------------------------------------------------------------
}//fin Class
