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
public class Historial_asignacion {
    
    private String id_asignacion,id_conductor,matricula_bus;
    private Date Fecha_asignacion;

    public Historial_asignacion() {
    }

    public Historial_asignacion(String id_asignacion, String id_conductor, String matricula_bus, Date Fecha_asignacion) {
        this.id_asignacion = id_asignacion;
        this.id_conductor = id_conductor;
        this.matricula_bus = matricula_bus;
        this.Fecha_asignacion = Fecha_asignacion;
    }

    public String getId_asignacion() {
        return id_asignacion;
    }

    public void setId_asignacion(String id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    public String getId_conductor() {
        return id_conductor;
    }

    public void setId_conductor(String id_conductor) {
        this.id_conductor = id_conductor;
    }

    public String getMatricula_bus() {
        return matricula_bus;
    }

    public void setMatricula_bus(String matricula_bus) {
        this.matricula_bus = matricula_bus;
    }

    public Date getFecha_asignacion() {
        return Fecha_asignacion;
    }

    public void setFecha_asignacion(Date Fecha_asignacion) {
        this.Fecha_asignacion = Fecha_asignacion;
    }

    @Override
    public String toString() {
        return "Historial_asignacion{" + "id_asignacion=" + id_asignacion + ", id_conductor=" + id_conductor + ", matricula_bus=" + matricula_bus + ", Fecha_asignacion=" + Fecha_asignacion + '}';
    }
    
    
    
}
