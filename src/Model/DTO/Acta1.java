/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DTO;

import Model.DAO.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lissette
 */
public class Acta1 extends Conexion{
    private int idActa1;
    private String observaciones;
    private String tareas;
    private ResultSet rs;

    public Acta1(int idActa1, String observaciones, String tareas) {
        this.idActa1 = idActa1;
        this.observaciones = observaciones;
        this.tareas = tareas;
    }
    
    public Acta1() {
        this.idActa1 = 0;
        this.observaciones = "";
        this.tareas = "";
    }

    public int getIdActa1() {
        return idActa1;
    }

    public void setIdActa1(int idActa1) {
        this.idActa1 = idActa1;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }
}
