/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lissette
 */
public class PracticaDAO {
    private Conexion conexion = new Conexion();
    private java.sql.Connection con = conexion.con;
    private Statement stm = conexion.stm;
    
    public boolean Create(int idPractica, String tipoHorasPractica, int cantHoras, String fechaTerimno, String fechaInicio, boolean distancia, String donde, double notaFinal, int idCentroPractica, int idActa1, int idActa2) {
        boolean salida = false;
        try {
            if (con != null) {
                String sql = "INSERT INTO PRACTICA VALUES(" + idPractica  + ",'" + tipoHorasPractica + ",'" + cantHoras + ",'" + fechaTerimno + ",'" + fechaInicio + ",'" + distancia + ",'" + donde + ",'" + notaFinal + ",'" + idCentroPractica + ",'" + idActa1 + ",'" + idActa2 + ")";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.executeUpdate();
                salida = true;
                return salida;
            } else {
                JOptionPane.showMessageDialog(null, "Conexion erronea", "Atencion", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            if (e.getMessage().toLowerCase().endsWith("PK) violated")){
                JOptionPane.showMessageDialog(null, "Llave ya existe", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
            System.out.println("entro al catch de la Practica " + e.getMessage());
            return salida;

        }
        return salida;
    }
}
