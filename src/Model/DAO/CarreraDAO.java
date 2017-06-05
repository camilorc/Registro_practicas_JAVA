/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DTO.Carrera;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lissette
 */
public class CarreraDAO {
   private Conexion conexion = new Conexion();
    private java.sql.Connection con = conexion.con;
    private Statement stm = conexion.stm;
    
    public boolean Create(String carrera, int idEscuela, String nombreEscuela) {
        boolean salida = false;
        try {
            if (con != null) {
//                String sql = "INSERT INTO CARRERA VALUES(" + id + ",'" + carrera + "'," + idEscuela + ",'" + nombreEscuela + "')";
//                PreparedStatement ps = con.prepareStatement(sql);
//                ps.executeUpdate();
//                salida = true;
//                return salida;        

                CallableStatement cst;
                cst = con.prepareCall("{call crear_carrera(?,?,?)}");
                cst.setString(1, carrera);
                cst.setInt(2, idEscuela);
                cst.setString(3, nombreEscuela);
                System.out.println(cst);
                cst.execute();
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Conexion erronea", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            if (e.getMessage().toLowerCase().endsWith("PK) violated")) {
                JOptionPane.showMessageDialog(null, "Llave ya existe", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
            System.out.println("entro al catch de la Carrera " + e.getMessage());
            return salida;
        }
        return salida;
    }
    
    public ArrayList<Carrera> BuscarTodasLasCarreras() {
        try {
            String sql = "Select * FROM CARRERA";

            ResultSet rs = stm.executeQuery(sql);

            ArrayList<Carrera> carreras = new ArrayList<>();
            while (rs.next()) {
                Carrera carrerita = new Carrera(rs.getInt("IDCARRERA"), rs.getString("NOMBRE_CARRERA"),rs.getInt("ESCUELA_IDESCUELA") ,rs.getString("ESCUELA_NOMBRE_ESCUELA"));
                carreras.add(carrerita);
            }
            return carreras;

        } catch (Exception e) {
            System.out.println("entro al catch del Carrera de Buscar Todas las Carreras" + e.getMessage());
            return null;
        }
    }

//    public boolean Update(int id, String director, String nombre, Sede sede) {
//        boolean salida = false;
//        try {
//            if (con != null) {
//                String sql = "UPDATE ESCUELA SET Director_Carrera='" + director + "',Nombre_Escuela='" + nombre
//                        + "',IdSede='" + sede.getIdSede() + "' where IdEscuela=" + id;
//                PreparedStatement ps = con.prepareStatement(sql);
//                ps.executeUpdate();
//                salida = true;
//                return salida;
//            }
//        } catch (Exception e) {
//            System.out.println("entro al catch del Escuela de update " + e.getMessage());
//            return salida;
//        }
//        return salida;
//    }

//    public ArrayList<Escuela> Buscar(String nombre) {
//        try {
//            String sql = "Select * FROM ESCUELA WHERE regexp_like(nombre_escuela, '^" + nombre + "$', 'i')";
//            ResultSet rs = stm.executeQuery(sql);
//
//            ArrayList<Escuela> escuela = new ArrayList<>();
//            while (rs.next()) {
//                int idSede = rs.getInt("IDSEDE");
//                SedeDAO sede = new SedeDAO();
//                Sede sedecita = sede.BuscarSede(idSede);
//                Escuela esc = new Escuela(rs.getInt("IDESCUELA"), rs.getString("NOMBRE_ESCUELA"), rs.getString("DIRECTOR_CARRERA"), sedecita);
//                escuela.add(esc);
//            }
//            return escuela;
//
//        } catch (SQLException e) {
//            System.out.println("entro al catch de Escuela de Buscar " + e.getMessage());
//            return null;
//        }
//    }

//    public ArrayList<Carrera> BuscarTodasLasCarreras() {
//        try {
//            String sql = "Select * FROM CARRERA";
//            System.out.println(sql);
//            ResultSet rs = stm.executeQuery(sql);
//
//            ArrayList<Carrera> escuela = new ArrayList<>();
//            while (rs.next()) {
//                Carrera esc = new Carrera(rs.getInt("idcarrera"), rs.getString("nombre_carrera"), rs.getInt("escuela_idescuela"), rs.getString("escuela_nombre_escuela"));
//                escuela.add(esc);
//            }
//            return escuela;
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "entro al catch del BuscarTodasLasCarreras " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
//            return null;
//        }
//    }

    public Carrera BuscarPorNombreDeCarrera(String nombre) {
        try {
            String sql = "Select * FROM CARRERA where nombre_carrera='" + nombre + "'";
            ResultSet rs = stm.executeQuery(sql);

            Carrera car = null;
            while (rs.next()) {
                car = new Carrera(rs.getInt("idcarrera"), rs.getString("nombre_carrera"), rs.getInt("escuela_idescuela"), rs.getString("escuela_nombre_escuela"));
            }
            return car;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "entro al catch del buscar carrera por nombre " + e.getMessage(), "Alerta", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public boolean Delete(String nombre) {
        boolean op = false;
        try {
            if (nombre != null) {
                System.out.println("Se conecto");
                String sql = "DELETE FROM CARRERA WHERE  nombre_carrera='" + nombre + "'";
                System.out.println("sql");
                PreparedStatement ps = con.prepareStatement(sql);
                ps.executeUpdate();
                op = true;
                return op;
            } else {
                return op;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, null, "No se pudo eliminar CARRERA" + e.getMessage(), JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
     public ArrayList<Carrera> Buscar(String nombre) {
        try {
            String sql = "Select * FROM CARRERA WHERE regexp_like(nombre_carrera, '^"+nombre+"$', 'i')";
            ResultSet rs = stm.executeQuery(sql);

            ArrayList<Carrera> escuela = new ArrayList<>();
            while (rs.next()) {
                Carrera esc = new Carrera(rs.getInt("idcarrera"), rs.getString("nombre_carrera"), rs.getInt("escuela_idescuela"),
                        rs.getString("escuela_nombre_escuela"));
                escuela.add(esc);
            }
            return escuela;
        } catch (SQLException e) {
            System.out.println("entro al catch de Carrera de Buscar " + e.getMessage());
            return null;
        }
    }

    public boolean Update(int idCarrera, String carrera, int id, String escuela) {
        boolean salida = false;
        try {
            if (con != null) {
                String sql = "UPDATE CARRERA SET nombre_carrera='" + 
                        carrera+ "',escuela_idescuela=" + id +",escuela_nombre_escuela ='"+escuela
                        + "'"+ " where idcarrera=" +idCarrera;
                PreparedStatement ps = con.prepareStatement(sql);
                ps.executeUpdate();
                salida = true;
                return salida;
                
     
            }
        } catch (Exception e) {
            System.out.println("entro al catch del Carrera de update " + e.getMessage());
            return salida;
        }
        return salida;
    }
}
