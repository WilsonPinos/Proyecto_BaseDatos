/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_basedatos;

import java.util.Date;

/**
 *
 * @author mauri
 */
public class Conductor {
    private String id_conductor,cedula,Anio_experiencia,tipo_Licencia,id_licencia,nombre,apellido,telefono;
    private int edad;
    private Date fecha_nacimiento;

    public Conductor() { 
    }

    public Conductor(String id_conductor, String cedula, String Anio_experiencia, String tipo_Licencia, String id_licencia, String nombre, String apellido, String telefono, int edad, Date fecha_nacimiento) {
        this.id_conductor = id_conductor;
        this.cedula = cedula;
        this.Anio_experiencia = Anio_experiencia;
        this.tipo_Licencia = tipo_Licencia;
        this.id_licencia = id_licencia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(String id_conductor) {
        this.id_conductor = id_conductor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getAnio_experiencia() {
        return Anio_experiencia;
    }

    public void setAnio_experiencia(String Anio_experiencia) {
        this.Anio_experiencia = Anio_experiencia;
    }

    public String getTipo_Licencia() {
        return tipo_Licencia;
    }

    public void setTipo_Licencia(String tipo_Licencia) {
        this.tipo_Licencia = tipo_Licencia;
    }

    public String getId_licencia() {
        return id_licencia;
    }

    public void setId_licencia(String id_licencia) {
        this.id_licencia = id_licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Conductor{" + "id_conductor=" + id_conductor + ", cedula=" + cedula + ", Anio_experiencia=" + Anio_experiencia + ", tipo_Licencia=" + tipo_Licencia + ", id_licencia=" + id_licencia + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", edad=" + edad + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }

   
    
}
