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
public class Horario {
    
    
    
    private String id_turno;
    private Date fecha_ingreso,fecha_salida;

    public Horario() {
    }

    public Horario(String id_turno, Date fecha_ingreso, Date fecha_salida) {
        this.id_turno = id_turno;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
    }

    public String getId_turno() {
        return id_turno;
    }

    public void setId_turno(String id_turno) {
        this.id_turno = id_turno;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    @Override
    public String toString() {
        return "Horario{" + "id_turno=" + id_turno + ", fecha_ingreso=" + fecha_ingreso + ", fecha_salida=" + fecha_salida + '}';
    }
    
    
    
    
}
