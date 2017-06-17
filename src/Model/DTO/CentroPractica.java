/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DTO;

import Model.DAO.Conexion;
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
    private String email;
    private String username;
    private String pass;
    private ResultSet rs;

    public CentroPractica(int idCentroPractica, String nombreCentro, String direccionCentro, String departamentoCentro, String areaCentro, String email) {
        this.idCentroPractica = idCentroPractica;
        this.nombreCentro = nombreCentro;
        this.direccionCentro = direccionCentro;
        this.departamentoCentro = departamentoCentro;
        this.areaCentro = areaCentro;
        this.email = email;
    }

    public CentroPractica() {
        this.idCentroPractica = 0;
        this.nombreCentro = "";
        this.direccionCentro = "";
        this.departamentoCentro = "";
        this.areaCentro = "";
        this.email = "";
        this.username ="";
        this.pass ="";
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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
                centro.setEmail(rs.getString("EMAIL"));
                centro.setUsername(rs.getString("USERNAME"));
                centro.setPass(rs.getString("PASS"));
                centros.add(centro);
            }
            return centros;
            
            
        } catch (Exception e) {
            System.out.println("entro al catch de Buscar todos los centros" + e.getMessage());
            return null;
            
        }
    
    
    }
    
}
