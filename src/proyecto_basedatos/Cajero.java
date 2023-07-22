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
public class Cajero {
    
    private String Id_cajero,Cedula,nombre,apellido,correo,celular,nivel_estudio,turno;
    private int edad;
    private Date nacimiento,fec_contratacion;

    public Cajero() {
       
    }

    public Cajero(String Id_cajero, String Cedula, String nombre, String apellido, String correo, String celular, String nivel_estudio, String turno, int edad, Date nacimiento, Date fec_contratacion) {
        this.Id_cajero = Id_cajero;
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.nivel_estudio = nivel_estudio;
        this.turno = turno;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.fec_contratacion = fec_contratacion;
    }

    public String getId_cajero() {
        return Id_cajero;
    }

    public void setId_cajero(String Id_cajero) {
        this.Id_cajero = Id_cajero;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNivel_estudio() {
        return nivel_estudio;
    }

    public void setNivel_estudio(String nivel_estudio) {
        this.nivel_estudio = nivel_estudio;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Date getFec_contratacion() {
        return fec_contratacion;
    }

    public void setFec_contratacion(Date fec_contratacion) {
        this.fec_contratacion = fec_contratacion;
    }

    @Override
    public String toString() {
        return "Cajero{" + "Id_cajero=" + Id_cajero + ", Cedula=" + Cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", celular=" + celular + ", nivel_estudio=" + nivel_estudio + ", turno=" + turno + ", edad=" + edad + ", nacimiento=" + nacimiento + ", fec_contratacion=" + fec_contratacion + '}';
    }

    
}
