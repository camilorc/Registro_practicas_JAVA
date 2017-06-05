/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DTO.Rol;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Denisse
 */
public class UsuarioDAO {

    private Conexion conexion = new Conexion();
    private java.sql.Connection con = conexion.con;
    private Statement stm = conexion.stm;

    public boolean Create(int rut, String dv, String password, String nombres, String apellido1, String apellido2, String nacimiento, String direccion, int telefono, String mail, Rol rol) {
        boolean salida = false;
        try {
            if (con != null) {
                String sql = "INSERT INTO USUARIO VALUES('" + rut + "','" + dv + "','" + password + "','" + nombres + "','" + apellido1
                        + "','" + apellido2 + "','" + nacimiento + "','" + direccion + "','"
                        + telefono + "','" + mail + "',1 ,'" + rol.getIdRol() + "', null)";
                System.out.println(sql);
                PreparedStatement ps = con.prepareStatement(sql);
                System.out.println(ps);
                ps.executeUpdate();
                System.out.println("2");
                salida = true;
                return salida;
            } else {
                JOptionPane.showMessageDialog(null, "Conexion erronea", "No creo Usuario", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            if (e.getMessage().toLowerCase().endsWith("PK) violated")) {
                JOptionPane.showMessageDialog(null, "Rut ya existe", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
            return salida;
        }
        return salida;
    }
}
