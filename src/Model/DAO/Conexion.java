/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import java.sql.*;

/**
 *
 * @author Camilo-PC
 */
public class Conexion {
    
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    public java.sql.Connection con;
    public Statement stm;
    
    public Conexion() {
  
        try {
            con = DriverManager.getConnection(URL,"proyecto","1234");
            stm = con.createStatement();
        } 
        catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}
