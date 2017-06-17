/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DTO;

import Model.DAO.Conexion;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author Lissette
 */
public class Practica extends Conexion{
    private int idPractica; 
    private String tipoHorasPractica; 
    private int cantHoras; 
    private String fechaTerimno; 
    private String fechaInicio; 
    private boolean distancia; 
    private String donde; 
    private double notaFinal; 
    private int idCentroPractica; 
    private int idActa1; 
    private int idActa2;

    public Practica(int idPractica, String tipoHorasPractica, int cantHoras, String fechaTerimno, String fechaInicio, boolean distancia, String donde, double notaFinal, int idCentroPractica, int idActa1, int idActa2) {
        this.idPractica = idPractica;
        this.tipoHorasPractica = tipoHorasPractica;
        this.cantHoras = cantHoras;
        this.fechaTerimno = fechaTerimno;
        this.fechaInicio = fechaInicio;
        this.distancia = distancia;
        this.donde = donde;
        this.notaFinal = notaFinal;
        this.idCentroPractica = idCentroPractica;
        this.idActa1 = idActa1;
        this.idActa2 = idActa2;
    }

    public Practica() {
        this.idPractica = 0;
        this.tipoHorasPractica = "";
        this.cantHoras = 0;
        this.fechaTerimno = "";
        this.fechaInicio = "";
        this.distancia = true;
        this.donde = "";
        this.notaFinal = 0;
        this.idCentroPractica = 0;
        this.idActa1 = 0;
        this.idActa2 = 0;
    }

    public int getIdPractica() {
        return idPractica;
    }

    public void setIdPractica(int idPractica) {
        this.idPractica = idPractica;
    }

    public String getTipoHorasPractica() {
        return tipoHorasPractica;
    }

    public void setTipoHorasPractica(String tipoHorasPractica) {
        this.tipoHorasPractica = tipoHorasPractica;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public String getFechaTerimno() {
        return fechaTerimno;
    }

    public void setFechaTerimno(String fechaTerimno) {
        this.fechaTerimno = fechaTerimno;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public boolean isDistancia() {
        return distancia;
    }

    public void setDistancia(boolean distancia) {
        this.distancia = distancia;
    }

    public String getDonde() {
        return donde;
    }

    public void setDonde(String donde) {
        this.donde = donde;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public int getIdCentroPractica() {
        return idCentroPractica;
    }

    public void setIdCentroPractica(int idCentroPractica) {
        this.idCentroPractica = idCentroPractica;
    }

    public int getIdActa1() {
        return idActa1;
    }

    public void setIdActa1(int idActa1) {
        this.idActa1 = idActa1;
    }

    public int getIdActa2() {
        return idActa2;
    }

    public void setIdActa2(int idActa2) {
        this.idActa2 = idActa2;
    }
    
    
    public boolean Create(int rut_alumno, int rut_docente,String fecha_inicio,String fecha_termino,String tipo_practica,int cantidad_horas,int idcentro,String nombre_centro,String username, String pass,String email_centro){
        boolean salida = false;
        try {
            System.out.println("id centro: "+idcentro);
            if(con!=null){
                System.out.println("Se conecto");
                CallableStatement cst;
                cst = con.prepareCall("{call ingresar_practica(?,?,?,?,?,?,?,?,?,?,?)}");
                cst.setInt(1, rut_alumno);
                cst.setInt(2, rut_docente);
                cst.setString(3, fecha_inicio);
                cst.setString(4, fecha_termino);
                cst.setString(5, tipo_practica);
                cst.setInt(6, cantidad_horas);
                cst.setInt(7, idcentro);
                cst.setString(8, nombre_centro);
                cst.setString(9, username);
                cst.setString(10, pass);
                cst.setString(11, email_centro);
                
                cst.execute();
                salida=true;
                return salida;             
            }
        } catch (Exception e) {
            System.out.println("entro al catch de crear práctica "+e.getMessage());
            return salida;            
        }
        return salida;
    }
    
    
}
