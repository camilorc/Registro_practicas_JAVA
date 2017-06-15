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
 * @author Camilo-PC
 */
public class ListaAlumnos extends Conexion{
    //private Statement stm ;
    private ResultSet rs;
    
    private int rut;
    private String dv;
    private String nombres;
    private String apellido1;
    private String apellido2;
    private String nombre_docente;
    private int estado;
    private String estado_detalle;

    public ListaAlumnos(int rut, String dv, String nombres, String apellido1, String apellido2, String nombre_docente, int estado) {
        this.rut = rut;
        this.dv = dv;
        this.nombres = nombres;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre_docente = nombre_docente;
        this.estado = estado;
    }

    
    
    
    public ListaAlumnos() {
      
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre_docente() {
        return nombre_docente;
    }

    public void setNombre_docente(String nombre_docente) {
        this.nombre_docente = nombre_docente;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getEstado_detalle() {
        return estado_detalle;
    }

    public void setEstado_detalle(String estado_detalle) {
        this.estado_detalle = estado_detalle;
    }
    
    
    
    
    //Lista de alumnos asignados a un DOCENTE
    public ArrayList<ListaAlumnos> listarAsignaciones(){
        ArrayList<ListaAlumnos> alumnos = new ArrayList<>();
        try {
            
            String sql ="SELECT Usuario.RUT, Usuario.DV_USUARIO, Usuario.NOMBRES, Usuario.APELLIDO1, Usuario.APELLIDO2,DOCENTE_PRACTICA.RUT_DOCENTE, DOCENTE_PRACTICA.ESTADO_DOCENTE FROM Usuario JOIN DOCENTE_PRACTICA ON Usuario.RUT = DOCENTE_PRACTICA.RUT_ALUMNO";
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                ListaAlumnos user = new ListaAlumnos();
                user.setRut(rs.getInt("RUT"));
                user.setDv(rs.getString("DV_USUARIO"));
                user.setNombres(rs.getString("NOMBRES"));
                user.setApellido1(rs.getString("APELLIDO1"));
                user.setApellido2(rs.getString("APELLIDO2"));
                user.setNombre_docente(docenteRetorna(rs.getInt("RUT_DOCENTE")).getNombres());
                user.setEstado(rs.getInt("ESTADO_DOCENTE"));
                
                switch (user.getEstado()) {
                    case 0:
                        user.setEstado_detalle("Pendiente");
                        break;
                    case 1:
                        user.setEstado_detalle("Aceptado");
                        break;
                    case 2:
                        user.setEstado_detalle("Rechazado");
                        break;
                    default:
                        throw new AssertionError();
                }
                
                
                
                alumnos.add(user);
            }
            
            
        } catch (Exception e) {
            
            System.out.println("entro al catch de listarAsignaciones" + e.getMessage());
            
        }
    
        return alumnos;
    
    
    }
    
    //Retortarmos el Objeto Usuario Docente según sea el caso
    public Usuario docenteRetorna(int rut_docente){
        Usuario docente = new Usuario();
        docente.setRut(rut_docente);
        docente.BuscarRut();
        
        return docente;
    
    }
    
    
    
    
    
    
    
    
    
}
