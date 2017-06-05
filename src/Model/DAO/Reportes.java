/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DTO.Usuario;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author Camilo-PC
 */
public class Reportes extends Conexion{
    
    private ResultSet rs;
    
    public String ReporteGeneral(int sede_id, int carrera_id){
        String reporte = "";
        
        try {
            CallableStatement cst;
            cst = con.prepareCall("{call reporte_general_jefe_carrera(?,?,?,?,?)}");
            
            cst.setInt(1, sede_id);
            cst.setInt(2, carrera_id);
            
            cst.registerOutParameter(3, java.sql.Types.INTEGER);//cantidad en curso
            cst.registerOutParameter(4, java.sql.Types.INTEGER);//cantidad en pendiente
            cst.registerOutParameter(5, java.sql.Types.INTEGER);//cantidad finalizada
            
            cst.execute();
            
            int cantidad_en_curso = cst.getInt(3);
            int cantidad_en_pendiente = cst.getInt(4);
            int cantidad_finalizada = cst.getInt(5);
            
            reporte = "Cantidad en curso: "+cantidad_en_curso+"\nCantidad Pendientes: "+cantidad_en_pendiente+"\nCantidad Finalizada: "+cantidad_finalizada;
            return reporte;
            
        } catch (Exception e) {
            System.out.println("entro al catch de Reporte General " + e.getMessage());
            return "";
        }
    }
    
    public ArrayList<Usuario> ReporteEspecifico(int sede_id, int carrera_id, int estado){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        try {
            
            String sql = "SELECT USUARIO.RUT,USUARIO.DV_USUARIO,USUARIO.NOMBRES,USUARIO.APELLIDO1,USUARIO.APELLIDO2\n" +
                            "  FROM PRACTICA JOIN USUARIO\n" +
                            "  ON USUARIO.PRACTICA_IDPRACTICA = PRACTICA.IDPRACTICA\n" +
                            "  WHERE USUARIO.SEDE_IDSEDE = '"+sede_id+"' AND\n" +
                            "  USUARIO.CARRERA_IDCARRERA = '"+carrera_id+"' AND PRACTICA.ESTADO = '"+estado+"' AND USUARIO.ROLES_IDROL = 4";

            rs = stm.executeQuery(sql);
            
            while (rs.next()) {                
                Usuario user = new Usuario();
                user.setRut(rs.getInt("RUT"));
                user.setDv(rs.getString("DV_USUARIO"));
                user.setNombres(rs.getString("NOMBRES"));
                user.setApellido1(rs.getString("APELLIDO1"));
                user.setApellido2(rs.getString("APELLIDO2"));
                usuarios.add(user);
            }
            
            
            return usuarios;
        } catch (Exception e) {
            System.out.println("entro al catch de Reporte Específico " + e.getMessage());
            return usuarios;
        }
    
    }
    
}
