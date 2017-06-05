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
public class Carrera{
    private int idCarrera; 
    private String nombreCarrera;
    private int idEscuela; 
    private String nombreEscuela;

    public Carrera(){    
    }
    
    public Carrera(int idCarrera, String nombreCarrera, int idEscuela, String nombreEscuela) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
        this.idEscuela = idEscuela;
        this.nombreEscuela = nombreEscuela;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(int idEscuela) {
        this.idEscuela = idEscuela;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }
    
    public String toString(){
        return "CARRERA: " +this.nombreCarrera.toUpperCase()+ "\nESCUELA: "+ this.nombreEscuela;     
    }
            
}
