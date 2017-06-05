/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DTO.Sede;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Denisse
 */
public class SedeDAO {

    private Conexion conexion = new Conexion();
    private java.sql.Connection con = conexion.con;
    private Statement stm = conexion.stm;

    public ArrayList<Sede> BuscarTodasLasSedes() {
        try {
            String sql = "Select * FROM SEDE";

            ResultSet rs = stm.executeQuery(sql);

            ArrayList<Sede> sede = new ArrayList<>();
            while (rs.next()) {
                Sede sedecita = new Sede(rs.getInt("IDSEDE"), rs.getString("NOMBRE_SEDE"), rs.getString("DIRECCION_SEDE"));
                sede.add(sedecita);
            }
            return sede;

        } catch (Exception e) {
            System.out.println("entro al catch del SEDE de Buscar Todas las Sedes" + e.getMessage());
            return null;
        }
    }

    public Sede BuscarSede(String nombreSede) {
        try {
            String sql = "Select * FROM SEDE where Nombre_Sede='" + nombreSede + "'";
            ResultSet rs = stm.executeQuery(sql);
            Sede sede = null;
            while (rs.next()) {
                sede = new Sede(rs.getInt("IDSEDE"), rs.getString("NOMBRE_SEDE"), rs.getString("DIRECCION_SEDE"));
            }
            return sede;

        } catch (Exception e) {
            System.out.println("entro al catch del SEDE de Buscar" + e.getMessage());
            return null;
        }
    }
    
    public Sede BuscarSede(int idSede) {
        try {
            String sql = "Select * FROM SEDE where IDSEDE='" + idSede + "'";

            ResultSet rs = stm.executeQuery(sql);

            Sede sede = null;
            while (rs.next()) {
                sede = new Sede(rs.getInt("IDSEDE"), rs.getString("NOMBRE_SEDE"), rs.getString("DIRECCION_SEDE"));
            }
            return sede;

        } catch (Exception e) {
            System.out.println("entro al catch del SEDE de Buscar" + e.getMessage());
            return null;
        }
    }

    public boolean Create(String nombre, String direccion) {
        boolean salida = false;
        try {
            if (con != null) {
                
                
//                String sql = "INSERT INTO SEDE VALUES(" + id + ",'" + nombre + "','" + direccion + "')";
//                System.out.println("1");
//                PreparedStatement ps = con.prepareStatement(sql);
//                System.out.println("2");
//                ps.executeUpdate();
//                salida = true;
//                return salida;
                
                CallableStatement cst;
                cst = con.prepareCall("{call crear_sede(?,?)}");
                cst.setString(1, nombre);
                cst.setString(2, direccion);
                
                cst.execute();
                
                return true;
                
            } else {
                JOptionPane.showMessageDialog(null, "Conexion erronea", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            if (e.getMessage().toLowerCase().endsWith("PK) violated")) {
                JOptionPane.showMessageDialog(null, "Llave ya existe", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
            System.out.println("entro al catch de la Sede " + e.getMessage());
            return salida;

        }
        return salida;
    }
    
    public boolean Delete(String nombre) {
        boolean op = false;
        try {
            if (nombre != null) {
                System.out.println("Se conecto");
                String sql = "DELETE FROM SEDE WHERE Nombre_Sede = '" + nombre +"'";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.executeUpdate();
                op = true;
                return op;
            } else {
                return op;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, null, "No se pudo eliminar" + e.getMessage(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean Update(int id, String nombre, String direccion) {
        boolean salida = false;
        try {
            if (con != null) {
                String sql = "UPDATE SEDE SET Nombre_Sede='" + nombre+ "',Direccion_Sede='" + direccion+ "' where IdSede=" +id;
                PreparedStatement ps = con.prepareStatement(sql);
                ps.executeUpdate();
                salida = true;
                return salida;
            }
        } catch (Exception e) {
            System.out.println("entro al catch del SEDE de update " + e.getMessage());
            return salida;
        }
        return salida;
    }
}