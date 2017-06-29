/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DTO;

import Model.DAO.Conexion;
import java.sql.CallableStatement;

/**
 *
 * @author Camilo-PC
 */
public class DetallePracticaAlumno extends Conexion {
        private int Rut;
        private String Dv ;
        private String Nombres ;
        private String Apellido1 ;
        private String Apellido2; 
        private String Email; 
        private int Fono ;
        private String NombreCarrera ;
        private String NombreCentro ;
        private String EmailCentro ;
        private String FechaInicio ;
        private String FechaTermino ;
        private String TipoPractica ;
        private String DireccionCentro; 
        private float Nota3 ;
        private float NotaFinal ;
        private float NotaPersonal ;
        private float NotaProfesional;
        
    public DetallePracticaAlumno() {
        
    }

    public DetallePracticaAlumno(int Rut, String Dv, String Nombres, String Apellido1, String Apellido2, String Email, int Fono, String NombreCarrera, String NombreCentro, String EmailCentro, String FechaInicio, String FechaTermino, String TipoPractica, String DireccionCentro, float Nota3, float NotaFinal, float NotaPersonal, float NotaProfesional) {
        this.Rut = Rut;
        this.Dv = Dv;
        this.Nombres = Nombres;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Email = Email;
        this.Fono = Fono;
        this.NombreCarrera = NombreCarrera;
        this.NombreCentro = NombreCentro;
        this.EmailCentro = EmailCentro;
        this.FechaInicio = FechaInicio;
        this.FechaTermino = FechaTermino;
        this.TipoPractica = TipoPractica;
        this.DireccionCentro = DireccionCentro;
        this.Nota3 = Nota3;
        this.NotaFinal = NotaFinal;
        this.NotaPersonal = NotaPersonal;
        this.NotaProfesional = NotaProfesional;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getFono() {
        return Fono;
    }

    public void setFono(int Fono) {
        this.Fono = Fono;
    }

    public String getNombreCarrera() {
        return NombreCarrera;
    }

    public void setNombreCarrera(String NombreCarrera) {
        this.NombreCarrera = NombreCarrera;
    }

    public String getNombreCentro() {
        return NombreCentro;
    }

    public void setNombreCentro(String NombreCentro) {
        this.NombreCentro = NombreCentro;
    }

    public String getEmailCentro() {
        return EmailCentro;
    }

    public void setEmailCentro(String EmailCentro) {
        this.EmailCentro = EmailCentro;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaTermino() {
        return FechaTermino;
    }

    public void setFechaTermino(String FechaTermino) {
        this.FechaTermino = FechaTermino;
    }

    public String getTipoPractica() {
        return TipoPractica;
    }

    public void setTipoPractica(String TipoPractica) {
        this.TipoPractica = TipoPractica;
    }

    public String getDireccionCentro() {
        return DireccionCentro;
    }

    public void setDireccionCentro(String DireccionCentro) {
        this.DireccionCentro = DireccionCentro;
    }

    public float getNota3() {
        return Nota3;
    }

    public void setNota3(float Nota3) {
        this.Nota3 = Nota3;
    }

    public float getNotaFinal() {
        return NotaFinal;
    }

    public void setNotaFinal(float NotaFinal) {
        this.NotaFinal = NotaFinal;
    }

    public float getNotaPersonal() {
        return NotaPersonal;
    }

    public void setNotaPersonal(float NotaPersonal) {
        this.NotaPersonal = NotaPersonal;
    }

    public float getNotaProfesional() {
        return NotaProfesional;
    }

    public void setNotaProfesional(float NotaProfesional) {
        this.NotaProfesional = NotaProfesional;
    }
    
    
    public boolean obtenerDatos(int rut_alumno){
        try {
            
            
            if(con!=null){
                System.out.println("Se conecto");
                CallableStatement cst;
                cst = con.prepareCall("{call detalle_practica_alumno(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                cst.setInt(1, rut_alumno);
                cst.registerOutParameter(2, java.sql.Types.VARCHAR);//DV
                cst.registerOutParameter(3, java.sql.Types.VARCHAR);//nombres
                cst.registerOutParameter(4, java.sql.Types.VARCHAR);//apellido1
                cst.registerOutParameter(5, java.sql.Types.VARCHAR);//apellido2
                cst.registerOutParameter(6, java.sql.Types.VARCHAR);//email
                cst.registerOutParameter(7, java.sql.Types.INTEGER);//telefono
                cst.registerOutParameter(8, java.sql.Types.VARCHAR);//carrera nombre
                cst.registerOutParameter(9, java.sql.Types.VARCHAR);//nombre centro
                cst.registerOutParameter(10, java.sql.Types.VARCHAR);//email centro
                cst.registerOutParameter(11, java.sql.Types.DATE);//fecha inicio
                cst.registerOutParameter(12, java.sql.Types.DATE);//fecha termino
                cst.registerOutParameter(13, java.sql.Types.VARCHAR);//tipo practica
                cst.registerOutParameter(14, java.sql.Types.VARCHAR);//direccion centro
                cst.registerOutParameter(15, java.sql.Types.INTEGER);//nota 3
                cst.registerOutParameter(16, java.sql.Types.INTEGER);//nota final
                cst.registerOutParameter(17, java.sql.Types.INTEGER);//promedio personal
                cst.registerOutParameter(18, java.sql.Types.INTEGER);//promedio profesional
                cst.execute();
                
                
                //asiganmos valores al objeto
                this.Rut = rut_alumno;
                this.Dv = cst.getString(2);
                this.Nombres = cst.getString(3);
                this.Apellido1 = cst.getString(4);
                this.Apellido2 = cst.getString(5);
                this.Email = cst.getString(6);
                this.Fono = cst.getInt(7);
                this.NombreCarrera = cst.getString(8);
                this.NombreCentro = cst.getString(9);
                this.EmailCentro = cst.getString(10);
                this.FechaInicio = cst.getString(11);
                this.FechaTermino = cst.getString(12);
                this.TipoPractica = cst.getString(13);
                this.DireccionCentro = cst.getString(14);
                this.Nota3 = cst.getInt(15);
                this.NotaFinal = cst.getInt(16);
                this.NotaPersonal = cst.getInt(17);
                this.NotaProfesional = cst.getInt(18);
                
                
                
            }
            return true;
        } catch (Exception e) {
            System.out.println("entro al catch de obtener datos"+e.getMessage());
            return false;

        }
    }
    
    
}

