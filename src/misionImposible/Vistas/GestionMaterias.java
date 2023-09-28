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
        //pongo en falso los campos que por defecto vendran apagados
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(false);
        tfNombre.setEnabled(false);
        tfAño.setEnabled(false);
    }
    //variable se usará para interpretar si el btn guardar es para crear o actualizar
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
        btnRefresh = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(450, 470));

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Materias");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

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

        jLabel3.setText("Nombre");

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Año");

        tfAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAñoActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misionImposible/Vistas/images/refresh.jpg"))); // NOI18N
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnNuevo)
                .addGap(32, 32, 32)
                .addComponent(btnEliminar)
                .addGap(34, 34, 34)
                .addComponent(btnGuardar)
                .addGap(38, 38, 38)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(rbEstado)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(rbEstado)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(null,
                "Desea eliminar esta materia", "Eliminar materia", JOptionPane.OK_OPTION);

        if (respuesta == 0) {
            int id = Integer.parseInt(tfCodigo.getText());
            MateriaData a = new MateriaData(); // creo objeto
            a.eliminarMateria(id); //accedo a metodo y paso parametro
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Debes buscar la materia para eliminar");//este esta al dope
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {

            if ("".equals(tfCodigo.getText())) { //si el campo codigo es vacio envio mensaje
                JOptionPane.showMessageDialog(null, "Debe ingresar un id");
                return; //return para terminar la funcion y no arroje mas mensajes
            }
            //activo campos y botones cuando encuentre un materia
            btnNuevo.setEnabled(false);
            btnGuardar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnGuardar.setEnabled(true);//
            tfNombre.setEnabled(true);
            tfAño.setEnabled(true);
            
            MateriaData a = new MateriaData(); //instancio nuevo objeto para acceder a los metodos
            int id = Integer.parseInt(tfCodigo.getText()); //obtengo el id ingresado para poder hacer la busqueda
            Materia materiaEncontrada = a.buscarMateria(id); //instancio una materia para acceder a get/set

            if (materiaEncontrada != null) {
                //obtengo los datos de la materia encontrada en la bd
                boolean estado = materiaEncontrada.isActivo(); // creo variable bool para guardar el estado de la materia
                tfNombre.setText(materiaEncontrada.getNombre());
                tfAño.setText(Integer.toString(materiaEncontrada.getAnioMateria()));
                if (estado) { //verifico si el estado de la materia es activo o no (tonto pq no puede buscar materia eliminada)
                    rbEstado.setSelected(true);
                } else {
                    rbEstado.setSelected(false);
                }
                
            } else {
                limpiarCampos();
            }
        } catch (NumberFormatException ex) { //entra al catch en caso de que intente buscar la materia con caracteres
            JOptionPane.showMessageDialog(null, "Solo puedes ingresar enteros");
            limpiarCampos();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        //preparo los campos para agregar una nueva materia
        JOptionPane.showMessageDialog(null, "Estas por crear una materia"); //mensaje para el usuario
        limpiarCampos();
        rbEstado.setEnabled(true);
        tfNombre.setEnabled(true);
        tfAño.setEnabled(true);
        tfCodigo.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnGuardar.setEnabled(true);
        operacion = true; // al hacer click en nuevo activa operacion en true (o sea va a crear una materia)

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        //verifico si operacion, si es true es porque se le agrego al hacer click en el boton nuevo
        if (operacion) {
            try {
                btnGuardar.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Estas por crear una materia");
                tfCodigo.setEnabled(false); //deshabilito boton de codigo porque al id lo crea la bd.
                //verifico si el campo nombre está vacio.
                if(tfNombre.getText().equals("") || tfAño.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(null, "Debes completar todos los campos");
                    limpiarCampos();
                    return; //return para terminar la operación.
                }
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
                limpiarCampos();
                tfCodigo.setEnabled(true);
            } catch (NumberFormatException ex) { //entra al catch si intento crear un id con caracteres
                JOptionPane.showMessageDialog(null, "Solo puedes agregar por enteros");
                limpiarCampos();
            }
        } else { //si no se le dio un valor y por defecto es false, entra a actualizar la materia que se buscó
            MateriaData mat = new MateriaData();
            Materia materia = new Materia();
            
            //paso parametros modificados
            materia.setNombre(tfNombre.getText());
            materia.setAnioMateria(Integer.parseInt(tfAño.getText()));
            materia.setActivo(rbEstado.isSelected());
            materia.setIdMateria(Integer.parseInt(tfCodigo.getText()));
            
            //modifico usando el metodo
            mat.modificarMateria(materia);
            limpiarCampos();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tfAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAñoActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        tfCodigo.setText("");
        tfNombre.setText("");
        tfAño.setText("");
        
        tfCodigo.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnNuevo.setEnabled(true);
        
        rbEstado.setSelected(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(false);
        tfNombre.setEnabled(false);
        tfAño.setEnabled(false);
        rbEstado.setEnabled(false);
    }//GEN-LAST:event_btnRefreshActionPerformed

    public void limpiarCampos() {
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
    private javax.swing.JButton btnRefresh;
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
