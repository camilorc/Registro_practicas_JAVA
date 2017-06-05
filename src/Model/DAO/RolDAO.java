/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DTO.Rol;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Denisse
 */
public class RolDAO {
    
    private Conexion conexion = new Conexion();
    private java.sql.Connection con = conexion.con;
    private Statement stm = conexion.stm;

    public ArrayList<Rol> BuscarTodasLosRol() {
        try {
            String sql = "Select * FROM ROLES";

            ResultSet rs = stm.executeQuery(sql);

            ArrayList<Rol> rol = new ArrayList<>();
            while (rs.next()) {
                Rol rolito = new Rol(rs.getInt("IDROL"), rs.getString("NOMBRE_ROL"));
                rol.add(rolito);
            }
            return rol;

        } catch (Exception e) {
            System.out.println("entro al catch del ROLES de Buscar Todas los ROLES" + e.getMessage());
            return null;
        }
    }
    
    public Rol BuscarRol(String nombreRol) {
        try {
            System.out.println("rol");
            String sql = "Select * FROM ROLES where Nombre_ROL='" + nombreRol + "'";
            ResultSet rs = stm.executeQuery(sql);
            Rol rol = null;
            while (rs.next()) {
                rol = new Rol(rs.getInt("IDROL"), rs.getString("NOMBRE_ROL"));
            }
            return rol;
        } catch (Exception e) {
            System.out.println("entro al catch del rol de Buscar" + e.getMessage());
            return null;
        }
    }
    
}