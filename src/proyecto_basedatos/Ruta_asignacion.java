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
public class Ruta_asignacion {
    
    private String id_asignacion,matricula_bus,codigo_ruta,descripcion;
    private Date hora_asignacion;

    public Ruta_asignacion() {
    }

    public Ruta_asignacion(String id_asignacion, String matricula_bus, String codigo_ruta, String descripcion, Date hora_asignacion) {
        this.id_asignacion = id_asignacion;
        this.matricula_bus = matricula_bus;
        this.codigo_ruta = codigo_ruta;
        this.descripcion = descripcion;
        this.hora_asignacion = hora_asignacion;
    }

    public String getId_asignacion() {
        return id_asignacion;
    }

    public void setId_asignacion(String id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    public String getMatricula_bus() {
        return matricula_bus;
    }

    public void setMatricula_bus(String matricula_bus) {
        this.matricula_bus = matricula_bus;
    }

    public String getCodigo_ruta() {
        return codigo_ruta;
    }

    public void setCodigo_ruta(String codigo_ruta) {
        this.codigo_ruta = codigo_ruta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getHora_asignacion() {
        return hora_asignacion;
    }

    public void setHora_asignacion(Date hora_asignacion) {
        this.hora_asignacion = hora_asignacion;
    }

    @Override
    public String toString() {
        return "Ruta_asignacion{" + "id_asignacion=" + id_asignacion + ", matricula_bus=" + matricula_bus + ", codigo_ruta=" + codigo_ruta + ", descripcion=" + descripcion + ", hora_asignacion=" + hora_asignacion + '}';
    }

    
    
    
}
