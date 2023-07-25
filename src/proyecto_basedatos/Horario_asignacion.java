/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_basedatos;

import java.util.Date;

/**
 *
 * @author Wilson Pinos
 */
public class Horario_asignacion {
    private String id_asignacion;
    private Date fecha_asignacion;

    public Horario_asignacion(String id_asignacion, Date fecha_asignacion) {
        this.id_asignacion = id_asignacion;
        this.fecha_asignacion = fecha_asignacion;
    }

    /**
     * @return the id_asignacion
     */
    public String getId_asignacion() {
        return id_asignacion;
    }

    /**
     * @param id_asignacion the id_asignacion to set
     */
    public void setId_asignacion(String id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    /**
     * @return the fecha_asignacion
     */
    public Date getFecha_asignacion() {
        return fecha_asignacion;
    }

    /**
     * @param fecha_asignacion the fecha_asignacion to set
     */
    public void setFecha_asignacion(Date fecha_asignacion) {
        this.fecha_asignacion = fecha_asignacion;
    }

    @Override
    public String toString() {
        return "Horario_asignacion{" + "id_asignacion=" + id_asignacion + ", fecha_asignacion=" + fecha_asignacion + '}';
    }
}
