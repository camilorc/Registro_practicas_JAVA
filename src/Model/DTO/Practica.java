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
    private int rutDocente;

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
        this.rutDocente = 0;
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

    public int getRutDocente() {
        return rutDocente;
    }

    public void setRutDocente(int rutDocente) {
        this.rutDocente = rutDocente;
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
    
    
    //Actualizar una práctica
    public boolean Update(int rut_alumno, int rut_docente,String fecha_inicio,String fecha_termino,String tipo_practica,int cantidad_horas,int idcentro,String nombre_centro,String username, String pass,String email_centro,int id_practica){
        try {
                CallableStatement cst;
                cst = con.prepareCall("{call update_practica(?,?,?,?,?,?,?,?,?,?,?,?)}");
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
                cst.setInt(12, id_practica);
                cst.execute();
                      
            return true;
        } catch (Exception e) {
            System.out.println("entro al catch de update práctica "+e.getMessage());
            return false;
        }
    
    
    }
    
    //elimnar una práctica
    public boolean Delete(int rut_alumno, int id_practica){
        try {
            CallableStatement cst;
            cst = con.prepareCall("{call eliminar_practica(?,?)}");
            cst.setInt(1, rut_alumno);
            cst.setInt(2, id_practica);
            cst.execute();
            
            return true;
        } catch (Exception e) {
            System.out.println("entro al catch de delete práctica "+e.getMessage());
            return false;
        }
    
    }
    
    
    //Método que devuelve los datos de una práctica en caso que ya tenga
    public void DatosPractica(int rut_alumno){
        
        try {
            
            //Usamos el Procedimiento almacenado
            CallableStatement cst;
            cst = con.prepareCall("{call datos_practica_java(?,?,?,?,?,?)}");
            
            // Parametro IN del procedimiento almacenado
            cst.setInt(1, rut_alumno);
            cst.registerOutParameter(2, java.sql.Types.VARCHAR);//tipo de horas
            cst.registerOutParameter(3, java.sql.Types.DATE);//Fecha inicio
            cst.registerOutParameter(4, java.sql.Types.DATE);//Fecha termino
            cst.registerOutParameter(5, java.sql.Types.INTEGER);//id centro practica
            cst.registerOutParameter(6, java.sql.Types.INTEGER);//rut docente
            
            cst.execute();
            String tipo_horas_practica = cst.getString(2);
            Date fecha_inicio = cst.getDate(3);
            Date fecha_termino = cst.getDate(4);
            int id_centro_practica = cst.getInt(5);
            int rut_docente = cst.getInt(6);
            
            //asiganmos valores al objeto
            this.setTipoHorasPractica(tipo_horas_practica);
            this.setFechaInicio(fecha_inicio.toString());
            this.setFechaTerimno(fecha_termino.toString());
            this.setIdCentroPractica(id_centro_practica);
            this.setRutDocente(rut_docente);
            
            
            
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        
    
    }
    
}
