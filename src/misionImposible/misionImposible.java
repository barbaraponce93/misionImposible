
package  misionImposible;

import java.sql.Connection;
import javax.swing.JOptionPane;
import misionImposible.AccesoADatos.AlumnoData;
import misionImposible.AccesoADatos.Conexion;
import misionImposible.AccesoADatos.InscripcionData;
import misionImposible.AccesoADatos.MateriaData;
import misionImposible.entidades.Alumno;
import misionImposible.entidades.Inscripcion;
import misionImposible.entidades.Materia;


public class misionImposible {

    
    public static void main(String[] args) {
        
       Connection con=Conexion.getConexion();
       
       
       
        //--------------Pruebas Clase InscripcionData-----------------
        AlumnoData ad=new AlumnoData();
        MateriaData md=new MateriaData();
        InscripcionData iData=new InscripcionData();
        
        Inscripcion inscripcion=new Inscripcion();
        Alumno sofi=ad.buscarAlumno(26);
        Materia electricidadMag=md.buscarMateria(3);
       // Inscripcion ins=new Inscripcion(9,sofi,electricidadMag);
       
        
       //  iDataguardarIscripcion(ins);
      // iData.actualizarNota(21, 5, 5);
    //  iData.borrarInscripcionMateriaAlumno(11, 1);
    
//    for(Inscripcion inscri: iData.obtenerInscripciones() ){
//        System.out.println("id: "+inscri.getIdInscripto());
//        System.out.println("Apellido: "+inscri.getAlumno().getApellido());
//       System.out.println("Materia: " + inscri.getMateria().getNombre());


//    for(Inscripcion inscri: iData.obtenerInscripcionesPorAlumno(26)){
//        System.out.println("id: "+inscri.getIdInscripto());
//        System.out.println("Apellido: "+inscri.getAlumno().getApellido());
//       System.out.println("Materia: " + inscri.getMateria().getNombre()); 

//
//        for(Materia mate: iData.obtenerMateriasCursadas(26)){
//        System.out.println("id: "+mate.getIdMateria());
//        System.out.println("Nombre de la materia: "+mate.getNombre());
//   
//        }
//        
//        for(Materia mate: iData.obtenerMateriaNOCursadas(26)){
//        System.out.println("id: "+mate.getIdMateria());
//        System.out.println("Nombre de la materia: "+mate.getNombre());
//        }
        
            for (Alumno alu : iData.obtenerAlumnosXMateria(5)) {
            System.out.println("id Alumno: " + alu.getIdAlumno());
            System.out.println("dni: " + alu.getDni());
            System.out.println("nombre: " + alu.getNombre());
            System.out.println("Apellido: " + alu.getApellido());
                System.out.println("");
            }
     
    
    }
}//---fin
    
    
      
       
      
    
    

