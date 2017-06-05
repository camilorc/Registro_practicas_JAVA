/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DTO.Escuela;
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
public class EscuelaDAO {
    
    private Conexion conexion = new Conexion();
    private java.sql.Connection con = conexion.con;
    private Statement stm = conexion.stm;
    
    public boolean Create(String escuela,String director) {
        boolean salida = false;
        try {
            if (con != null) {
//                String sql = "INSERT INTO ESCUELA VALUES(" + id + ",'" + escuela+ "','" + director+ "')";
//                PreparedStatement ps = con.prepareStatement(sql);
//                ps.executeUpdate();
//                salida = true;
//                return salida;
                
                CallableStatement cst;
                cst = con.prepareCall("{call crear_escuela(?,?)}");
                cst.setString(1, escuela);
                cst.setString(2, director);
                cst.execute();
                return true;
                
            } else {
                JOptionPane.showMessageDialog(null, "Conexion erronea", "Atencion", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            if (e.getMessage().toLowerCase().endsWith("PK) violated")){
                JOptionPane.showMessageDialog(null, "Llave ya existe", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
            System.out.println("entro al catch de la Carrera " + e.getMessage());
            return salida;

        }
        return salida;
    }
    
    public boolean Update(int id, String director,String nombre) {
        boolean salida = false;
        try {
            if (con != null) {
                String sql = "UPDATE ESCUELA SET Director_Carrera='" + director+ "',Nombre_Escuela='" + nombre 
                        + "'" +" where IdEscuela=" +id;
                PreparedStatement ps = con.prepareStatement(sql);
                ps.executeUpdate();
                salida = true;
                return salida;
            }
        } catch (Exception e) {
            System.out.println("entro al catch del Escuela de update " + e.getMessage());
            return salida;
        }
        return salida;
    }

    public ArrayList<Escuela> Buscar(String nombre) {
        try {
            String sql = "Select * FROM ESCUELA WHERE regexp_like(nombre_escuela, '^"+nombre+"$', 'i')";
            ResultSet rs = stm.executeQuery(sql);

            ArrayList<Escuela> escuela = new ArrayList<>();
            while (rs.next()) {
                int idSede = rs.getInt("IDSEDE");
                SedeDAO sede = new SedeDAO();
                Sede sedecita = sede.BuscarSede(idSede);
                Escuela esc = new Escuela (rs.getInt("IDESCUELA"), rs.getString("NOMBRE_ESCUELA"), rs.getString("DIRECTOR_CARRERA"));
                escuela.add(esc);
            }
            return escuela;

        } catch (SQLException e) {
            System.out.println("entro al catch de Escuela de Buscar " + e.getMessage());
            return null;
        }
    }
    
    public ArrayList<Escuela> BuscarTodasLasEscuelas() {
        try {
            String sql = "Select * FROM ESCUELA";
            System.out.println(sql);
            ResultSet rs = stm.executeQuery(sql);
            
            ArrayList<Escuela> escuela = new ArrayList<>();
            while (rs.next()) {
                Escuela esc = new Escuela (rs.getInt("IDESCUELA"), rs.getString("NOMBRE_ESCUELA"), rs.getString("DIRECTOR_CARRERA"));
                escuela.add(esc);
            }
            return escuela;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "entro al catch del BuscarTodasLasEscuelas " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public Escuela BuscarPorNombreDeEscuela(String nombre) {
        try {
            String sql = "Select * FROM ESCUELA where Nombre_Escuela='"+nombre+"'";
            ResultSet rs = stm.executeQuery(sql);

            Escuela scuela = null;
            while (rs.next()) {
                scuela = new Escuela (rs.getInt("IDESCUELA"), rs.getString("DIRECTOR_CARRERA"), rs.getString("NOMBRE_ESCUELA"));
            }
            return scuela;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "entro al catch del buscar escuela por nombre " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean Delete(String nombre) {
        boolean op = false;
        try {
            if (nombre != null) {
                System.out.println("Se conecto");
                String sql = "DELETE FROM ESCUELA WHERE Nombre_Escuela ='" + nombre +"'";
                System.out.println("sql");
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
    
    public int BuscarIdEscuela(String nombre) {
        try {
            String sql = "Select idescuela FROM ESCUELA where Nombre_Escuela='"+nombre+"'";
            ResultSet rs = stm.executeQuery(sql);

            Escuela scuela = null;
            while (rs.next()) {
                scuela = new Escuela (rs.getInt("IDESCUELA"), rs.getString("DIRECTOR_CARRERA"), rs.getString("NOMBRE_ESCUELA"));
            }
            return scuela.getIdEscuela();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "entro al catch del buscar int escuela  " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
}
