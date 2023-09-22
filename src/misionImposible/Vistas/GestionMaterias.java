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

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Materias");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Código");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Año");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel2)
                        .addGap(290, 290, 290)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(btnNuevo)
                            .addComponent(jLabel5))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbEstado)
                            .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnEliminar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGuardar)
                                    .addGap(50, 50, 50)
                                    .addComponent(btnSalir))
                                .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addComponent(rbEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addGap(59, 59, 59))
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

        try {

            MateriaData a = new MateriaData(); //instancio nuevo objeto para acceder a los metodos
            int id = Integer.parseInt(tfCodigo.getText());
            Materia materiaEncontrada =a.buscarMateria(id); //instancio una materia para acceder a get/set
            if(materiaEncontrada != null){
                tfNombre.setText(materiaEncontrada.getNombre());
                tfAño.setText(Integer.toString(materiaEncontrada.getAnioMateria()));

                btnGuardar.setEnabled(false);
                btnNuevo.setEnabled(false);
            }
            else {
                limpiarCampos();
            }

        } catch (Exception ex ){
            JOptionPane.showMessageDialog(null,"error" );
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        try{
            int respuesta =JOptionPane.showConfirmDialog(null,
            "Desea agregar una materia?","Eliminar materia",JOptionPane.OK_OPTION);
            if (respuesta == 0){
                tfCodigo.setEnabled(false); //deshabilito boton de codigo 
                JOptionPane.showMessageDialog(null, "Ingrese nombre, año y estado"); //mensaje de los campos a llenar
                
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
            } 
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en el metodo btnNuevo");
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try{
            
            
            
        } catch (Exception ex){
            
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

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
