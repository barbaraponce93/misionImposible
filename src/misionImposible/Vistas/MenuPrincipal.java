/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misionImposible.Vistas;


import misionImposible.Vistas.FormularioDeInscripcion;
import misionImposible.Vistas.ListaAlumnosporMateria;





public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);//deja al centro el frame
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMFomularioAlumno = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMMateria = new javax.swing.JMenu();
        jMFormularioMateria = new javax.swing.JMenuItem();
        jMAdministracion = new javax.swing.JMenu();
        jMInscripciones = new javax.swing.JMenuItem();
        jMNotas = new javax.swing.JMenuItem();
        jMAlumnosPorMateria = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setTitle("Gestión \"Universidad\"");

        escritorio.setPreferredSize(new java.awt.Dimension(700, 600));
        escritorio.setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misionImposible/Vistas/images/logo-ulp.png"))); // NOI18N
        escritorio.add(jLabel1);
        jLabel1.setBounds(150, 70, 290, 240);

        jMFomularioAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misionImposible/Vistas/images/graduated.jpg"))); // NOI18N
        jMFomularioAlumno.setText("Alumno");

        jMenuItem1.setText("Formulario de Alumno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMFomularioAlumno.add(jMenuItem1);

        jMenuBar1.add(jMFomularioAlumno);

        jMMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misionImposible/Vistas/images/stack-of-books (1).png"))); // NOI18N
        jMMateria.setText("Materia");

        jMFormularioMateria.setText("Formulario de Materia");
        jMFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormularioMateriaActionPerformed(evt);
            }
        });
        jMMateria.add(jMFormularioMateria);

        jMenuBar1.add(jMMateria);

        jMAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misionImposible/Vistas/images/leader (1).png"))); // NOI18N
        jMAdministracion.setText("Administracion");

        jMInscripciones.setText("Manejo de inscripciones");
        jMInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInscripcionesActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMInscripciones);

        jMNotas.setText("Manipulación de notas");
        jMNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMNotasActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMNotas);

        jMenuBar1.add(jMAdministracion);

        jMAlumnosPorMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misionImposible/Vistas/images/consulting (1).png"))); // NOI18N
        jMAlumnosPorMateria.setText("Consultas");
        jMAlumnosPorMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlumnosPorMateriaActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Alumnos por Materia");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMAlumnosPorMateria.add(jMenuItem5);

        jMenuBar1.add(jMAlumnosPorMateria);

        jMSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misionImposible/Vistas/images/logout (1).png"))); // NOI18N
        jMSalir.setText("Salir");
        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
        
    
    
    
    private void jMInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInscripcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioDeInscripcion formI = new FormularioDeInscripcion();
        formI.setVisible(true);
        escritorio.add(formI);//agrega la ventana al escri
        escritorio.moveToFront(formI);//trae al frente la ventana
    }//GEN-LAST:event_jMInscripcionesActionPerformed

    
        
       
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        escritorio.removeAll();
        escritorio.repaint();
        gestionAlumno ventanaAlumno = new gestionAlumno();
        ventanaAlumno.setVisible(true);   
        escritorio.add(ventanaAlumno);
        escritorio.moveToFront(ventanaAlumno);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMAlumnosPorMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlumnosPorMateriaActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jMAlumnosPorMateriaActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ListaAlumnosporMateria lista=new ListaAlumnosporMateria();
        lista.setVisible(true);
        escritorio.add(lista);
        escritorio.moveToFront(lista);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormularioMateriaActionPerformed
      
        
        escritorio.removeAll();
        escritorio.repaint();
        GestionMaterias lista=new GestionMaterias();
        lista.setVisible(true);
        escritorio.add(lista);
        escritorio.moveToFront(lista);
        
    }//GEN-LAST:event_jMFormularioMateriaActionPerformed

    private void jMNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMNotasActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        cargaDeNotas lista=new cargaDeNotas();
        lista.setVisible(true);
        escritorio.add(lista);
        escritorio.moveToFront(lista);
    }//GEN-LAST:event_jMNotasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMAdministracion;
    private javax.swing.JMenu jMAlumnosPorMateria;
    private javax.swing.JMenu jMFomularioAlumno;
    private javax.swing.JMenuItem jMFormularioMateria;
    private javax.swing.JMenuItem jMInscripciones;
    private javax.swing.JMenu jMMateria;
    private javax.swing.JMenuItem jMNotas;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
