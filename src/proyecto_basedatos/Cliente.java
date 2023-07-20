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
public class Cliente{
    
    private String Id_cliente,cedula_cli,nombre_cli,apellido_cli,telefono_cli,correo_cli;
    private int edad_cli;
    private Date fecha_nacimiento;

    public Cliente() {
    }

    public Cliente(String Id_cliente, String cedula_cli, String nombre_cli, String apellido_cli, String telefono_cli, String correo_cli, int edad_cli, Date fecha_nacimiento) {
        this.Id_cliente = Id_cliente;
        this.cedula_cli = cedula_cli;
        this.nombre_cli = nombre_cli;
        this.apellido_cli = apellido_cli;
        this.telefono_cli = telefono_cli;
        this.correo_cli = correo_cli;
        this.edad_cli = edad_cli;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(String Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    public String getCedula_cli() {
        return cedula_cli;
    }

    public void setCedula_cli(String cedula_cli) {
        this.cedula_cli = cedula_cli;
    }

    public String getNombre_cli() {
        return nombre_cli;
    }

    public void setNombre_cli(String nombre_cli) {
        this.nombre_cli = nombre_cli;
    }

    public String getApellido_cli() {
        return apellido_cli;
    }

    public void setApellido_cli(String apellido_cli) {
        this.apellido_cli = apellido_cli;
    }

    public String getTelefono_cli() {
        return telefono_cli;
    }

    public void setTelefono_cli(String telefono_cli) {
        this.telefono_cli = telefono_cli;
    }

    public String getCorreo_cli() {
        return correo_cli;
    }

    public void setCorreo_cli(String correo_cli) {
        this.correo_cli = correo_cli;
    }

    public int getEdad_cli() {
        return edad_cli;
    }

    public void setEdad_cli(int edad_cli) {
        this.edad_cli = edad_cli;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Id_cliente=" + Id_cliente + ", cedula_cli=" + cedula_cli + ", nombre_cli=" + nombre_cli + ", apellido_cli=" + apellido_cli + ", telefono_cli=" + telefono_cli + ", correo_cli=" + correo_cli + ", edad_cli=" + edad_cli + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }


    
    
    
    
    
    
    
}
