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
public class Escuela {

    private int idEscuela;
    private String nombreEscuela;
    private String directorCarrera;

    public Escuela() {
    }

    
    public Escuela(int idEscuela, String nombreEscuela, String directorCarrera) {
        this.idEscuela = idEscuela;
        this.nombreEscuela = nombreEscuela;
        this.directorCarrera = directorCarrera;
        
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

    public String getDirectorCarrera() {
        return directorCarrera;
    }

    public void setDirectorCarrera(String directorCarrera) {
        this.directorCarrera = directorCarrera;
    }

    
    @Override
    public String toString() {
        return "Escuela: "+ this.nombreEscuela.toUpperCase()+ "\nId: "+this.idEscuela
                +"\nDirector de Carrera: "+this.directorCarrera;
    }

}