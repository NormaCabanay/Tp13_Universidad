
package tp13_universidad;

import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Tp13_Universidad {

    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String URL = "jdbc:mariadb://localhost:3308/trabajo_practico13";
            String usuario = "root";
            String password = "";
            Connection con = DriverManager.getConnection(URL,usuario,password);

//    A)  INGRESAR 3 ALUMNOs  
//        1)
//            String sql="insert into alumno (dni,apellido,nombre,fechaDeNacimiento,estado)"
//                    +"values(22548754,'Lopez','Juan','2000-02-14',true)";
//           PreparedStatement ps= con.prepareStatement(sql);
//           
//           int filas= ps.executeUpdate();
//           if(filas>0){
//           JOptionPane.showMessageDialog(null,"Alumno agregado");}
//       2)
//            String sql="insert into alumno (dni,apellido,nombre,fechaDeNacimiento,estado)"
//                    +"values(22456879,'Guitierrez','Roberto','1860-08-24',true)";
//           PreparedStatement ps= con.prepareStatement(sql);
//            int filas= ps.executeUpdate();
//          if(filas>0){
//           JOptionPane.showMessageDialog(null,"Alumno agregado");}
//       3)
//
//                 String sql="insert into alumno (dni,apellido,nombre,fechaDeNacimiento,estado)"
//                   +"values(56988421,'Fonseca','Andrea','1863-12-05',true)";
//          PreparedStatement ps= con.prepareStatement(sql);
//           
//           int filas= ps.executeUpdate();
//           if(filas>0){
//           JOptionPane.showMessageDialog(null,"Alumno agregado");}
//---------------------------------------------------------------------------------------------------------
     //INSERTAR 4 MATERIAS
//            String sql = "INSERT INTO materia(nombre,año,estado)" + "VALUES('Matematica',2,true)";
//            PreparedStatement ps = con.prepareStatement(sql); // debemos incrementar o cambiar nuestra variable ps si queremos agregar varios
//            int fila = ps.executeUpdate(); // DEBEMOS INCREMENTAR - cambiar el nombre de mi variable fila si queremos agregar vario
//            System.out.println("Materia agregada"+ fila);
//            JOptionPane.showMessageDialog(null, "materia agregada");
//        
//            String sql1 = "INSERT INTO materia(nombre,año,estado)" + "VALUES('EDA',3,true)";
//            PreparedStatement ps1 = con.prepareStatement(sql1);
//            int fila1 = ps1.executeUpdate();
//             System.out.println("Materia agregada"+ fila1);
//            JOptionPane.showMessageDialog(null, "materia agregada");
//   
//            String sql2 = "INSERT INTO materia(nombre,año,estado)" + "VALUES('Ingles',1,true)";
//            PreparedStatement ps2= con.prepareStatement(sql2);
//            int fila2 = ps2.executeUpdate();
//             System.out.println("Materia agregada"+ fila2);
//            JOptionPane.showMessageDialog (null,"materia agregada");
//
//           String sql3 = "INSERT INTO materia(nombre,año,estado)" + "VALUES('Laboratorio',2,true)";
//           PreparedStatement ps3 = con.prepareStatement(sql3);
//           int fila3 = ps3.executeUpdate();
//            System.out.println("Materia agregada"+ fila3);
//           JOptionPane.showMessageDialog (null,"materia agregada");

//----------------------------------------------------------------------------------------
// ALUMNOS INSCRIPTOS EN DOS MATERIAS
//           
//           String sql="INSERT INTO inscripcion (nota,idAlumno,idMateria)"
//                    + "VALUES(8,1,1)";
//           PreparedStatement ps= con.prepareStatement(sql);
//           int filas= ps.executeUpdate();
//           if(filas>0){
//           JOptionPane.showMessageDialog(null,"Alumno inscripto");}
//           String sql1="INSERT INTO inscripcion (nota,idAlumno,idMateria)"
//                    + "VALUES(8,1,3)";
//           PreparedStatement ps1= con.prepareStatement(sql1);
//           int filas1= ps1.executeUpdate();
//           if(filas1>0){
//           JOptionPane.showMessageDialog(null,"Alumno inscripto");}
//           
//           String sql2="INSERT INTO inscripcion (nota,idAlumno,idMateria)"
//                    + "VALUES(10,6,5)";
//           PreparedStatement ps2= con.prepareStatement(sql2);
//           int filas2= ps2.executeUpdate();
//           if(filas2>0){
//           JOptionPane.showMessageDialog(null,"Alumno inscripto");}
//           
//           String sql3="INSERT INTO inscripcion (nota,idAlumno,idMateria)"
//                    + "VALUES(9,6,3)";
//           PreparedStatement ps3= con.prepareStatement(sql3);
//           int filas3= ps3.executeUpdate();
//           if(filas3>0){
//           JOptionPane.showMessageDialog(null,"Alumno inscripto");}
//           
//           String sql4="INSERT INTO inscripcion (nota,idAlumno,idMateria)"
//                    + "VALUES(10,7,4)";
//           PreparedStatement ps4= con.prepareStatement(sql4);
//           int filas4= ps4.executeUpdate();
//           if(filas4>0){
//           JOptionPane.showMessageDialog(null,"Alumno inscripto");}
//           
//           String sql5="INSERT INTO inscripcion (nota,idAlumno,idMateria)"
//                    + "VALUES(9,7,5)";
//           PreparedStatement ps5= con.prepareStatement(sql5);
//           int filas5= ps5.executeUpdate();
//           if(filas5>0){
//           JOptionPane.showMessageDialog(null,"Alumno inscripto");}
//           
//             

//----------------------------------------------------------------------------------------
//D)LISTAR DATOS DE ALIMNOS CON CALIFICACIONES SUPERIORES A OCHO
// REVISARRRRRRR

// String sql="SELECT * FROM `alumno` INNER JOIN inscripcion WHERE inscripcion.nota>8";
//        PreparedStatement ps=con.prepareStatement(sql);
//        ResultSet rs=ps.executeQuery();
//        while(rs.next()){
//        int id=rs.getInt("idAlumno");
//      int dni=rs.getInt("dni");
//       String apellido=rs.getString("apellido");
//      String nombre= rs.getString("nombre");
//       boolean estado=rs.getBoolean("estado");
//       System.out.println("-----------------------");
//       System.out.println("Dni"+dni);
//       System.out.println("apellido"+apellido);

//
//            String sql = "SELECT DISTINCT alumno.*,materia.nombre FROM alumno " + "JOIN inscripcion ON (alumno.idAlumno = inscripcion.idAlumno)" +
//                    "JOIN materia on (materia.idMateria = inscripcion.idMateria)"
//                    + "WHERE inscripcion.nota > 8";
//            
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//               
//                int id = rs.getInt("idAlumno");
//                int dni = rs.getInt("dni");
//                String apellido = rs.getString("apellido");
//                String nombre = rs.getString("nombre");
//                LocalDate fechaNac=rs.getDate("fechaNac").toLocalDate();
//                boolean estado = rs.getBoolean("estado");
//                System.out.println("-----------------------");
//                System.out.println("Nombre :" + nombre);
//                System.out.println("Apellido :" + apellido);
//                System.out.println("Dni :" + dni);
//                System.out.println("Fecha : " + fechaNac.toString());
//                System.out.println("Estado : " + estado);
//                
//            }   
//------------------------------------------------------------------------------
// C DESINSCRIBIR UN ALUMNO DE UNA MATERIA


//String sql= "insert into inscripcion (nota,idAlumno,idMateria) values(9,1,1)";
//PreparedStatement ps= con.prepareStatement(sql);
//int filas= ps.executeUpdate();
//if(filas>0) {
  //  JOptionPane.showMessageDialog(null,"nota agregada");
//}
       
       
      
          

//     OBTENER LOS DATOS DE LOS ALUMNOS ACTIVOS

//        String sql="select * from alumno where estado=true";
//        PreparedStatement ps=con.prepareStatement(sql);
//        ResultSet rs=ps.executeQuery();
//        while(rs.next()){
//        int id=rs.getInt("idAlumno");
//        int dni=rs.getInt("dni");
//        String apellido=rs.getString("apellido");
//        String nombre= rs.getString("nombre");
//        LocalDate fechN=rs.getDate("fechaDeNacimiento").toLocalDate();
//        boolean estado=rs.getBoolean("estado");
//            System.out.println("-----------------------");
//            System.out.println("Dni"+dni);
//            System.out.println("apellido"+apellido);
//            System.out.println("fecha"+fechN.toString());
//        
//        
 //       }
        
        String sql= " DELETE FROM inscripcion WHERE nota = 8";
              PreparedStatement ps= con.prepareStatement(sql);
           int filas= ps.executeUpdate();
           if(filas>0){
           JOptionPane.showMessageDialog(null,"Alumno Desaprobado");}
//        
        }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error de carga de base de datos " + ex.getMessage());
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexion" + ex.getMessage());
        }
    }
   }
        

     
