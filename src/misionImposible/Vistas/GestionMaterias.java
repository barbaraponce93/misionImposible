package misionImposible.Vistas;

import javax.swing.JOptionPane;
import misionImposible.AccesoADatos.MateriaData;
import misionImposible.entidades.Materia;

/**
 *
 * @author Lenovo 320
 */
public class GestionMaterias extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionMaterias
     */
    public GestionMaterias() {
        initComponents();
    }
    //variable para interpretar si el btn guardar es para crear o actualizar
    private boolean operacion = false; 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        tfCodigo = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfAño = new javax.swing.JTextField();
        rbEstado = new javax.swing.JCheckBox();

        setPreferredSize(new java.awt.Dimension(450, 470));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel5.setText("Estado");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Materias");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel2.setText("Código");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setText("Año");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbEstado)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(32, 32, 32)
                        .addComponent(btnEliminar)
                        .addGap(34, 34, 34)
                        .addComponent(btnGuardar)
                        .addGap(38, 38, 38)
                        .addComponent(btnSalir)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5))
                    .addComponent(rbEstado))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int respuesta =JOptionPane.showConfirmDialog(null,
            "Desea eliminar esta materia","Eliminar materia",JOptionPane.OK_OPTION);
        
        if (respuesta == 0){
            int id = Integer.parseInt(tfCodigo.getText());
            MateriaData a = new MateriaData(); // creo objeto
            a.eliminarMateria(id); //accedo a metodo y paso parametro
            limpiarCampos();
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
            
            if("".equals(tfCodigo.getText()) ){ //si el campo codigo es vacio envio mensaje
                JOptionPane.showMessageDialog(null, "Debe ingresar un id");
            }
            
            MateriaData a = new MateriaData(); //instancio nuevo objeto para acceder a los metodos
            int id = Integer.parseInt(tfCodigo.getText()); //obtengo el id ingresado para poder hacer la busqueda
            Materia materiaEncontrada =a.buscarMateria(id); //instancio una materia para acceder a get/set
            
            if(materiaEncontrada != null){
                //obtengo los datos de la materia encontrada en la bd
                boolean estado = materiaEncontrada.isActivo(); // creo variable bool para guardar el estado de la materia
                tfNombre.setText(materiaEncontrada.getNombre());
                tfAño.setText(Integer.toString(materiaEncontrada.getAnioMateria()));
                if(estado){ //verifico si el estado de la materia es activo o no (tonto pq no puede buscar materia eliminada)
                    rbEstado.setSelected(true);
                }else{
                    rbEstado.setSelected(false);
                }
            }
            else {
                limpiarCampos();
            }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
            
            //preparo los campos para agregar una nueva materia
            JOptionPane.showMessageDialog(null, "Estas por crear una materia");
            limpiarCampos();
            rbEstado.setEnabled(true);
            tfNombre.setEnabled(true);
            tfAño.setEnabled(true);
            tfCodigo.setEnabled(false);
            operacion = true; // al hacer click activa operacion en true para crear materia
            
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        //verifico si operacion, si es true es porque se le agrego al hacer click en el boton nuevo
        if(operacion){
            JOptionPane.showMessageDialog(null, "Estas por crear una materia");
            tfCodigo.setEnabled(false); //deshabilito boton de codigo porque al id lo crea la bd.
            //obtengo datos ingresados
            String nombreMateria = tfNombre.getText();
            boolean estadoAño = rbEstado.isSelected();
            int añoMateria = Integer.parseInt(tfAño.getText());
            
            //creo objetos de las clases para acceder a metodos
            MateriaData mat = new MateriaData();
            Materia materia = new Materia();
            materia.setAnioMateria(añoMateria);
            materia.setActivo(estadoAño);
            materia.setNombre(nombreMateria);
            
            mat.guardarMateria(materia); //guardo materia en la db
            JOptionPane.showMessageDialog(null, "Materia agregada");
            limpiarCampos();
            tfCodigo.setEnabled(true);
        }else{ //si no se le dio un valor y por defecto es false, entra a actualizar la materia que se buscó
            JOptionPane.showMessageDialog(null, "Estas por actualizar una materia");
            MateriaData mat = new MateriaData();
            Materia materia = new Materia();
            
            materia.setNombre(tfNombre.getText());
            materia.setAnioMateria(Integer.parseInt(tfAño.getText()));
            materia.setActivo(rbEstado.isSelected());
            materia.setIdMateria(Integer.parseInt(tfCodigo.getText())) ;
            
            mat.modificarMateria(materia);
            JOptionPane.showMessageDialog(null, "Materia actualizada");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public  void limpiarCampos(){
        rbEstado.setEnabled(false);
        tfAño.setText("");
        tfCodigo.setText("");
        tfNombre.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox rbEstado;
    private javax.swing.JTextField tfAño;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}
