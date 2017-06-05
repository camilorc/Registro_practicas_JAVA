/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DTO;

import Model.DAO.Conexion;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo-PC
 */
public class Usuario extends Conexion{
    
    //private Statement stm ;
    private ResultSet rs;
    
    private int rut;
    private String dv;
    private String pass;
    private String nombres;
    private String apellido1;
    private String apellido2;
    private String fecha_nacimiento;
    private String direccion;
    private int telefono;
    private String email;
    private int id_sede;
    private String nombre_sede;
    private int id_rol;
    private int id_practica;
    private int id_carrera;
    private String nombre_carrera;

       //Sin asignar práctica
    public Usuario(int rut, String dv, String pass, String nombres, String apellido1, String apellido2, String fecha_nacimiento, String direccion, int telefono, String email, int id_carrera, int id_rol) {
        this.rut = rut;
        this.dv = dv;
        this.pass = pass;
        this.nombres = nombres;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fecha_nacimiento = fecha_nacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.id_carrera = id_carrera;
        this.id_rol = id_rol;
    }

    public Usuario() {
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public int getId_practica() {
        return id_practica;
    }

    public void setId_practica(int id_practica) {
        this.id_practica = id_practica;
    }

    
     public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public String getNombre_sede() {
        return nombre_sede;
    }

    public void setNombre_sede(String nombre_sede) {
        this.nombre_sede = nombre_sede;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }
    
    @Override
    public String toString() {
        return this.nombres+" "+this.apellido1;
    }
    
    public boolean Create(){
        boolean salida = false;
        try {
            if (con != null) {
                System.out.println("entro a conexion");
                CallableStatement cst;
                cst = con.prepareCall("{call crear_usuario(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                
                cst.setInt(1, getRut());
                cst.setString(2, getDv());
                cst.setString(3, getPass());
                cst.setString(4, getNombres());
                cst.setString(5, getApellido1());
                cst.setString(6, getApellido2());
                cst.setString(7, getFecha_nacimiento());
                cst.setString(8, getDireccion());
                cst.setInt(9, getTelefono());
                cst.setString(10, getEmail());
                cst.setInt(11, getId_sede());
                cst.setString(12, getNombre_sede());
                cst.setInt(13, getId_rol());
                cst.setInt(14, getId_practica());
                cst.setInt(15, getId_carrera());
                cst.setString(16, getNombre_carrera());
                               
                
                //Ejecutamos el procedimiento almacenado
                cst.execute();
         
                salida = true;
                return salida;
            } else {
                JOptionPane.showMessageDialog(null, "Conexion erronea", "No creo Usuario", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            if (e.getMessage().toLowerCase().endsWith("PK) violated")) {
                JOptionPane.showMessageDialog(null, "Rut ya existe", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
            System.out.println("ENTRO AL CATCH "+e.getMessage());
            return salida;
        }
        return salida;

    }
    
    public boolean Update() {
        boolean salida = false;
        try {

            if (con != null) {

                CallableStatement cst;
                cst = con.prepareCall("{call editar_usuario(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                
                cst.setInt(1, getRut());
                cst.setString(2, getDv());
                cst.setString(3, getPass());
                cst.setString(4, getNombres());
                cst.setString(5, getApellido1());
                cst.setString(6, getApellido2());
                cst.setString(7, getFecha_nacimiento());
                cst.setString(8, getDireccion());
                cst.setInt(9, getTelefono());
                cst.setString(10, getEmail());
                cst.setInt(11, getId_sede());
                cst.setString(12, getNombre_sede());
                cst.setInt(13, getId_rol());
                cst.setInt(14, getId_practica());
                cst.setInt(15, getId_carrera());
                cst.setString(16, getNombre_carrera());
                
                
                
                //Ejecutamos el procedimiento almacenado
                cst.execute();
                salida = true;
                return salida;

            }

        } catch (Exception e) {
            System.out.println("entro al catch del DOCENTE de update " + e.getMessage());
            return salida;

        }
        return salida;
    }
    
    public boolean Buscar(int rol) {

        //Buscamos al USUARIO en la BD
        try {
            
            CallableStatement cst;
            cst = con.prepareCall("{call buscar_usuario(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            
            // Parametro IN del procedimiento almacenado
            cst.setInt(1, getRut());
            cst.setString(2,getDv());
            cst.setInt(3, rol);
            System.out.println("Paso los parametros IN");
            // Definimos los tipos de los parametros de salida del procedimiento almacenado
            
            cst.registerOutParameter(4, java.sql.Types.VARCHAR);//contrasenna
            cst.registerOutParameter(5, java.sql.Types.VARCHAR);//nombres
            cst.registerOutParameter(6, java.sql.Types.VARCHAR);//apellido1
            cst.registerOutParameter(7, java.sql.Types.VARCHAR);//apellido2
            cst.registerOutParameter(8, java.sql.Types.VARCHAR);//fecha_nacimineto
            cst.registerOutParameter(9, java.sql.Types.VARCHAR);//direccion
            cst.registerOutParameter(10, java.sql.Types.INTEGER);//telefono
            cst.registerOutParameter(11, java.sql.Types.VARCHAR);//email
            cst.registerOutParameter(12, java.sql.Types.INTEGER);//sede_id
            cst.registerOutParameter(13, java.sql.Types.VARCHAR);//sede_nombre
            cst.registerOutParameter(14, java.sql.Types.INTEGER);//practica_id
            cst.registerOutParameter(15, java.sql.Types.INTEGER);//carrera_id
            cst.registerOutParameter(16, java.sql.Types.VARCHAR);//carrera_nombre
            System.out.println("Paso los parametros UUT");
            // Ejecuta el procedimiento almacenado
            cst.execute();
            System.out.println("Paso execute");
            // Se obtienen la salida del procedimineto almacenado
            int practica_id;
            String pass = cst.getString(4);
            String nombres = cst.getString(5);
            String apellido1 = cst.getString(6);
            String apellido2 = cst.getString(7);
            String fecha_nacimiento = cst.getString(8);
            String direccion = cst.getString(9);
            int telefono = Integer.parseInt(cst.getString(10));
            String email = cst.getString(11);
            int sede_id = Integer.parseInt(cst.getString(12));
            String sede_nombre = cst.getString(13);
            
            if(cst.getString(14) == null){
                practica_id =0;
            }else{
                practica_id = Integer.parseInt(cst.getString(14));
            }
            int carrera_id = Integer.parseInt(cst.getString(15));
            String carrera_nombre = cst.getString(16);
            
            //Asignamos valores al objeto Usuario
            this.setRut(getRut());
            this.setDv(getDv());
            this.setPass(pass);
            this.setNombres(nombres);
            this.setApellido1(apellido1);
            this.setApellido2(apellido2);
            this.setFecha_nacimiento(fecha_nacimiento);
            this.setDireccion(direccion);
            this.setTelefono(telefono);
            this.setEmail(email);
            this.setId_sede(sede_id);
            this.setNombre_sede(sede_nombre);
            this.setId_rol(rol);
            this.setId_practica(practica_id);
            this.setId_carrera(carrera_id);
            this.setNombre_carrera(carrera_nombre);
                       
            return true;
            //return docente;

        } catch (Exception e) {
            System.out.println("entro al catch de de Buscar " + e.getMessage());
            return false;
        }

    }

    public boolean Delete() {
        try {
            //Para identificar que tipo es, en caso de ser ALUMNO no se puede eliminar
            if (this.id_rol != 4) {

                String sql = "DELETE FROM USUARIO WHERE RUT = '" + this.rut + "'";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.executeUpdate();

                return true;
            } else {
                System.out.println("Es un Alumno, no se puede eliminar");
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error en Eliminar " + e.getMessage());
            return false;
        }

    }

    //metodo para iniciar sesión
    public boolean IniciarSesion() {
        try {

            String sql = "Select * FROM USUARIO WHERE RUT = '" + this.rut + "' AND CONTRASEÑA = '" + this.pass + "' AND DV_USUARIO= '" + this.getDv() + "'";
            System.out.println("pASO EL SQL"+sql);
            System.out.println("Conexion: "+con);
            System.out.println("STM: "+stm);
            rs = stm.executeQuery(sql);
            System.out.println("PASO EL EXECUTEQUERY");
            rs.next();
            System.out.println("pASO EL RX.NEXT");
            this.setRut(rut);
            this.setDv(rs.getString("DV_USUARIO"));
            this.setPass(rs.getString("CONTRASEÑA"));
            this.setNombres(rs.getString("NOMBRES"));
            this.setApellido1(rs.getString("APELLIDO1"));
            this.setApellido2(rs.getString("APELLIDO2"));
            this.setFecha_nacimiento(rs.getString("FECHA_NACIMIENTO"));
            this.setDireccion(rs.getString("DIRECCION"));
            this.setTelefono(rs.getInt("TELEFONO"));
            this.setEmail(rs.getString("CORREO"));
            this.setId_rol(rs.getInt("ROLES_IDROL"));
            return true;
            //return docente;

        } catch (Exception e) {
            System.out.println("entro al catch del Usuario de iniciar sesión " + e.getMessage());
            return false;
        }

    }
    
    //Buscar Nombre de Carrera
    public String nombre_carrera(){
        String salida = "";
        
        try {
            String sql = "SELECT NOMBRE_CARRERA FROM CARRERA WHERE IDCARRERA = '"+this.id_carrera+"'";
            rs = stm.executeQuery(sql);
            rs.next();
            return rs.getString("NOMBRE_CARRERA");
  
        } catch (Exception e) {
            
            System.out.println("entro al catch del obtener nombre carrera " + e.getMessage());
            return salida;
            
        }
    
        
    }
    
    //Buscar Usuarios (array) por tipo de Usuario
    //1 = Jefe Carrera ; 2 = Coordinador ; 3 = Docente ; 4 = Alumno ;
    public ArrayList<Usuario> BuscarTipoUsuario(int id_rol){
        try {
            String sql ="SELECT RUT,NOMBRES,APELLIDO1,APELLIDO2 FROM USUARIO WHERE ROLES_IDROL = '"+id_rol+"'";
            ResultSet rs = stm.executeQuery(sql);
            
            ArrayList<Usuario> usuarios = new ArrayList<>();
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setRut(rs.getInt("RUT"));
                user.setNombres(rs.getString("NOMBRES"));
                user.setApellido1(rs.getString("APELLIDO1"));
                user.setApellido2(rs.getString("APELLIDO2"));
                usuarios.add(user);
            }
            return usuarios;
            
            
        } catch (Exception e) {
            System.out.println("entro al catch de BuscarTipoUsuario" + e.getMessage());
            return null;
            
        }
    
    
    }
    
    //Generar Contraseña automaticamente
    public String autoContrasena(){
        String pass = Integer.toString(this.rut).substring(1,5)+this.nombre_carrera.substring(1, 3);
        return pass;
    }
    
}
