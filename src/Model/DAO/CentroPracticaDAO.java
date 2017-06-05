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
public class CentroPracticaDAO {
    private Conexion conexion = new Conexion();
    private java.sql.Connection con = conexion.con;
    private Statement stm = conexion.stm;
    
    public boolean Create(int idCentroPractica, String nombreCentro, String direccionCentro, String departamentoCentro, String areaCentro){
        boolean salida = false;
        try {
            
            if(con!=null){
                System.out.println("Se conecto");
                String sql="INSERT INTO CENTRO_PRACTICA VALUES('"+idCentroPractica+"','"+nombreCentro+"','"+direccionCentro+"','"+departamentoCentro+"','"+areaCentro+"')";
                PreparedStatement ps = con.prepareStatement(sql);
                System.out.println(toString());
                ps.executeUpdate();
                salida=true;
                return salida;
             
            }
          
        } catch (Exception e) {
            System.out.println("entro al catch del Centro de practica "+e.getMessage());
            return salida;
            
        }
        return salida;
    } 
}
