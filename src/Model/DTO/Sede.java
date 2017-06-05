/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DTO;

/**
 *
 * @author Denisse
 */
public class Sede {

    private int idSede;
    private String nombreSede;
    private String direccionSede;

    public Sede(int idSede, String nombreSede, String direccionSede) {
        this.idSede = idSede;
        this.nombreSede = nombreSede;
        this.direccionSede = direccionSede;
    }
    
    public Sede(){
        
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccionSede() {
        return direccionSede;
    }

    public void setDireccionSede(String direccionSede) {
        this.direccionSede = direccionSede;
    }
    
    @Override
    public String toString() {
        return this.nombreSede.toUpperCase();
                
    }
}
