/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registropracticas;

import Model.DAO.Acta1DAO;
import Model.DAO.Conexion;
import Model.DTO.Usuario;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Camilo-PC
 */
public class RegistroPracticas extends Conexion{

    /**
     * @param args the command line arguments
     * @return 
     */
    public String Create(){
        String salida = "No funciono";
        int idrol = 3;
        String nom_rol = "Docente";
        try {
            
            if(con!=null){
                
                Usuario docente = new Usuario();
                //Obtenemos atributos del formulario
                int rut = 19562876;
                String dv = "5";
                String pass = "65478+9";
                String nombres = "Alonso";
                String apellido1 = "Alonso";
                String apellido2 = "Alonso";
                String fecha_nacimiento = "10/96/1986";
                String direccion = "Alonso";
                int telefono = 8569325;
                String email = "Alonso@gmail.com";
                int id_carrera = 1;
                int id_rol = 3;
                //int id_practica = 0;
                
                
                String sql = "INSERT INTO USUARIO VALUES('"+rut+"','"+dv+"','"+pass+"','"+nombres+"','"+apellido1+"','"+apellido2+"','"+fecha_nacimiento+"','"+direccion+"','"+telefono+"','"+email+"','"+id_carrera+"','"+id_rol+"',NULL)";
                
                //String sql="INSERT INTO ROLES VALUES ('"+idrol+"','"+nom_rol+"')";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.executeUpdate();
                
                salida = "Si funciono";
                return salida;
             
            }
            
           } catch (Exception e) {
               System.out.println("entro al catch "+e.getMessage());
            return salida;
            
         }
        return salida;
    
    }
    
    public static void main(String[] args) throws SQLException {
        Conexion con = new Conexion();
        
        CallableStatement cst;
        //cst = con.con.prepareCall("{call crear_sede(?,?)}");
        //System.out.println("Paso cst");
        //cst.setString(1, "Republica");
        //cst.setString(2, "Metro republica");
        //System.out.println("Antes del execute");
        //cst.execute();
        //System.out.println("Completado");
        
        cst = con.con.prepareCall("{call crear_usuario(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        cst.setInt(1, 1688889);
                cst.setString(2, "k");
                cst.setString(3, "123abc");
                cst.setString(4, "PRUEBAPROC");
                cst.setString(5, "PRUEBAPROC");
                cst.setString(6, "PRUEBAPROC");
                cst.setString(7, "PRUEBAPROC");
                cst.setString(8, "PRUEBAPROC");
                cst.setInt(9, 1234567);
                cst.setString(10, "PRUEBAPROC@email.com");
                cst.setInt(11, 1);
                cst.setInt(12, 2);
                cst.setInt(13, 0);
        cst.execute();
        System.err.println("Completado");
        
        
        
    }
    
}
