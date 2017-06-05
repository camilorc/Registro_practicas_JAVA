/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DTO;

import Model.DAO.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Lissette
 */
public class CentroPractica extends Conexion{
    private int idCentroPractica; 
    private String nombreCentro; 
    private String direccionCentro; 
    private String departamentoCentro; 
    private String areaCentro;
    private ResultSet rs;

    public CentroPractica(int idCentroPractica, String nombreCentro, String direccionCentro, String departamentoCentro, String areaCentro) {
        this.idCentroPractica = idCentroPractica;
        this.nombreCentro = nombreCentro;
        this.direccionCentro = direccionCentro;
        this.departamentoCentro = departamentoCentro;
        this.areaCentro = areaCentro;
    }

    public CentroPractica() {
        this.idCentroPractica = 0;
        this.nombreCentro = "";
        this.direccionCentro = "";
        this.departamentoCentro = "";
        this.areaCentro = "";
    }

    public int getIdCentroPractica() {
        return idCentroPractica;
    }

    public void setIdCentroPractica(int idCentroPractica) {
        this.idCentroPractica = idCentroPractica;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getDireccionCentro() {
        return direccionCentro;
    }

    public void setDireccionCentro(String direccionCentro) {
        this.direccionCentro = direccionCentro;
    }

    public String getDepartamentoCentro() {
        return departamentoCentro;
    }

    public void setDepartamentoCentro(String departamentoCentro) {
        this.departamentoCentro = departamentoCentro;
    }

    public String getAreaCentro() {
        return areaCentro;
    }

    public void setAreaCentro(String areaCentro) {
        this.areaCentro = areaCentro;
    }

    @Override
    public String toString() {
        return this.nombreCentro;
    }
    
    //Array de Centros de práctica
    public ArrayList<CentroPractica> BuscarTodosCentros(){
        try {
            String sql ="SELECT * FROM CENTRO_PRACTICA";
            rs = stm.executeQuery(sql);
            
            ArrayList<CentroPractica>  centros= new ArrayList<>();
            while (rs.next()) {
                CentroPractica centro = new CentroPractica();
                centro.setIdCentroPractica(rs.getInt("IDCENTROPRACTICA"));
                centro.setNombreCentro(rs.getString("NOMBRE_CENTRO"));
                centro.setDireccionCentro(rs.getString("DIRECCION_CENTRO"));
                centro.setDepartamentoCentro(rs.getString("DEPARTAMENTO_CENTRO"));
                centro.setAreaCentro(rs.getString("AREA_CENTRO"));
                centros.add(centro);
            }
            return centros;
            
            
        } catch (Exception e) {
            System.out.println("entro al catch de Buscar todos los centros" + e.getMessage());
            return null;
            
        }
    
    
    }
    
}
