/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_basedatos;

/**
 *
 * @author mauri
 */
public class Destino {
    
    private String id_destino,descripcion,nombre_destino;
    private double duracion_viaje;

    public Destino() {
    }

    public String getId_destino() {
        return id_destino;
    }

    public void setId_destino(String id_destino) {
        this.id_destino = id_destino;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre_destino() {
        return nombre_destino;
    }

    public void setNombre_destino(String nombre_destino) {
        this.nombre_destino = nombre_destino;
    }

    public double getDuracion_viaje() {
        return duracion_viaje;
    }

    public void setDuracion_viaje(double duracion_viaje) {
        this.duracion_viaje = duracion_viaje;
    }

    @Override
    public String toString() {
        return "Destino{" + "id_destino=" + id_destino + ", descripcion=" + descripcion + ", nombre_destino=" + nombre_destino + ", duracion_viaje=" + duracion_viaje + '}';
    }
    
    
    
    
}
