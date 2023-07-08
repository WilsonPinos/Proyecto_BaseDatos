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
public class Conductor extends Persona{
    private String Anio_experiencia,tipo_Licencia,id_licencia;

    public Conductor() {
        
        super();
    }


    public Conductor(String Anio_experiencia, String tipo_Licencia, String id_licencia, String nombre, String apellido, String edad, String celular, String correo, Date nacimiento) {
        super(nombre, apellido, edad, celular, correo, nacimiento);
        this.Anio_experiencia = Anio_experiencia;
        this.tipo_Licencia = tipo_Licencia;
        this.id_licencia = id_licencia;
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

    @Override
    public String toString() {
        return "Conductor{" + "Anio_experiencia=" + Anio_experiencia + ", tipo_Licencia=" + tipo_Licencia + ", id_licencia=" + id_licencia + '}';
    }
    
}
