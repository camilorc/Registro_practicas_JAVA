/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Lissette
 */
public class Acta1DAO {
    private Conexion conexion = new Conexion();
    private java.sql.Connection con = conexion.con;
    private Statement stm = conexion.stm;
    
        public boolean Create(int idActa1, String observaciones, String tareas){
        boolean salida = false;
        try {
            
            if(con!=null){
                System.out.println("Se conecto");
                String sql="INSERT INTO ACTA1 VALUES(seq_idpractica.nextval,'"+observaciones+"','"+tareas+"')";
                PreparedStatement ps = con.prepareStatement(sql);
                System.out.println(toString());
                ps.executeUpdate();
                salida=true;
                return salida;
             
            }
          
        } catch (Exception e) {
            System.out.println("entro al catch de la acta1 "+e.getMessage());
            return salida;
            
        }
        return salida;
    }
}
