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
public class Turno_asignado {
    
    
    private String id_turno_asignado,id_turno,matricula_bus;
    private Date fecha_asignada;

    public Turno_asignado() {
    }

    public Turno_asignado(String id_turno_asignado, String id_turno, String matricula_bus, Date fecha_asignada) {
        this.id_turno_asignado = id_turno_asignado;
        this.id_turno = id_turno;
        this.matricula_bus = matricula_bus;
        this.fecha_asignada = fecha_asignada;
    }

    public String getId_turno_asignado() {
        return id_turno_asignado;
    }

    public void setId_turno_asignado(String id_turno_asignado) {
        this.id_turno_asignado = id_turno_asignado;
    }

    public String getId_turno() {
        return id_turno;
    }

    public void setId_turno(String id_turno) {
        this.id_turno = id_turno;
    }

    public String getMatricula_bus() {
        return matricula_bus;
    }

    public void setMatricula_bus(String matricula_bus) {
        this.matricula_bus = matricula_bus;
    }

    public Date getFecha_asignada() {
        return fecha_asignada;
    }

    public void setFecha_asignada(Date fecha_asignada) {
        this.fecha_asignada = fecha_asignada;
    }

    @Override
    public String toString() {
        return "Turno_asignado{" + "id_turno_asignado=" + id_turno_asignado + ", id_turno=" + id_turno + ", matricula_bus=" + matricula_bus + ", fecha_asignada=" + fecha_asignada + '}';
    }
    
    
    
}
