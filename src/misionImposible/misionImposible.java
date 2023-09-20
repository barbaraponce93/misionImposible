
package  misionImposible;

import java.sql.Connection;
import java.time.LocalDate;
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
        
      //  Connection con=Conexion.getConexion();                                          //prueba de conexion
        //-------------------------Pruebas Alumno Data------------------------------- 
          Alumno Bar = new Alumno(32, 38016030, "Ponce", "Barbaraa", LocalDate.of(1993, 12, 21), true);
        AlumnoData aluData = new AlumnoData();
        aluData.guardarAlumno(Bar);                                                       //prueba guardar alumno
        // aluData.modificarAlumno(Bar);                                                    //prueba modificar alumno
        //aluData.eliminarAlumno(32);                                                       //prueba eliminar alumno
//        Alumno encontrado = aluData.buscarAlumno(100);                                    //prueba buscar alummno
//        if (encontrado != null) {
//            System.out.println("Alumno encontrado: \n " + "Dni:" + encontrado.getDni() + " " + "Nombre: " + encontrado.getNombre() + " " + "Apellido: " + "" + encontrado.getApellido());
//        }
//        Alumno encontrado = aluData.buscarAlumnoPorDni(27456344);                          //prueba buscar alummno por dni
//
//        if (encontrado != null) {
//            System.out.println("Alumno encontrado: \n " + "Dni:" + encontrado.getDni() + " " + "Nombre: " + encontrado.getNombre() + " " + "Apellido: " + "" + encontrado.getApellido());
//        }
////
//        for(Alumno alu:aluData.listarAlumnos()){                                          //prueba lista alumnos
//            System.out.println(alu.getDni());
//            System.out.println(alu.getNombre());
//            System.out.println(alu.getApellido());
//            System.out.println("");
//        }
        //-------------------------Pruebas Materia Data-------------------------------   -
        MateriaData matData = new MateriaData();
         Materia materia = new Materia(6, "Ingles", 5, true);

        //   matData.guardarMateria(materia);                                                       //prueba guardar materia
//        Materia materiaBuscada = matData.buscarMateria(6);                                             //prueba busqueda materia por id
//        if (materiaBuscada != null) {
//            System.out.println("Id: " + materiaBuscada.getIdMateria() + " " + "Nombre: " + materiaBuscada.getNombre());
//        }
        //      matData.modificarMateria(materia);                                                   //prueba modficacion materia
        //       matData.eliminarMateria(6);                                                         //prueba eliminar materia, borrado logico
//        
//        for(Materia mate:matData.listarMaterias()){                                                 //prueba listar materias
//            System.out.println(mate.getIdMateria());
//            System.out.println(mate.getNombre());
//            System.out.println(" ");
//        }
//-------------------------Pruebas Incripcion Data------------------------------- 
        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        InscripcionData iData = new InscripcionData();

        Inscripcion inscripcion = new Inscripcion();
        Alumno sofi = ad.buscarAlumno(26);
        Materia ingles = md.buscarMateria(3);
        Inscripcion ins = new Inscripcion(6,sofi, ingles);//idA,idm,nota

        //  iData.guardarIscripcion(ins);                                               //Prueba guardar incripcion
        //  iData.borrarInscripcionMateriaAlumno(11, 1);
//     iData.borrarInscripcionMateriaAlumno(26, 5) ;                                   //Prueba borrar enscripcion por alumno
       //        iData.actualizarNota(26, 1, 10);                                              // Prueba Actualizar nota
//        for(Inscripcion inscri: iData.obtenerInscripciones() ){                        //prueba de lista de inscripciones
//        System.out.println("id: "+inscri.getIdInscripto());
//        System.out.println("Apellido: "+inscri.getAlumno().getApellido());
//       System.out.println("Materia: " + inscri.getMateria().getNombre());
//            System.out.println("");
  
//    for(Inscripcion inscri: iData.obtenerInscripcionesPorAlumno(26)){               //prueba listar incripciones por alumno
//        System.out.println("id: "+inscri.getIdInscripto());
//        System.out.println("Apellido: "+inscri.getAlumno().getApellido());
//       System.out.println("Materia: " + inscri.getMateria().getNombre()); 
//         System.out.println("");
//
//        for(Materia mate: iData.obtenerMateriasCursadas(26)){                        //prueba listar materia por alumno
//        System.out.println("id: "+mate.getIdMateria());
//        System.out.println("Nombre de la materia: "+mate.getNombre());
//            System.out.println("");
//   
//        }
//        
    //for(Materia mate: iData.obtenerMateriaNOCursadas(3)){                        //prueba listar materia NO cursadas por alumno
//            System.out.println("Materias con cursadas:");
//        System.out.println("id: "+mate.getIdMateria());
//        System.out.println("Nombre de la materia: "+mate.getNombre());
//            System.out.println("");
////        }
//            for (Alumno alu : iData.obtenerAlumnosXMateria(2)) {                        //prueba alumnos por materia 
//            System.out.println("id Alumno: " + alu.getIdAlumno());
//            System.out.println("dni: " + alu.getDni());
//            System.out.println("nombre: " + alu.getNombre());
//            System.out.println("Apellido: " + alu.getApellido());
//                System.out.println("");
//            }
    }

}//fin

    

