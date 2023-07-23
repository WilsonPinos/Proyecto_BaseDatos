/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_basedatos;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author mauri
 */
public class Horario {
    
    
    
    private String id_turno;
    private LocalTime fecha_ingreso,fecha_salida;

    public Horario() {
    }

    public Horario(String id_turno, LocalTime fecha_ingreso, LocalTime fecha_salida) {
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

    public LocalTime getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalTime fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public LocalTime getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(LocalTime fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    
    
    
}
