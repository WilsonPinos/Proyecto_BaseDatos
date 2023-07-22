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

    public Destino() {
    }

    public Destino(String id_destino, String descripcion, String nombre_destino) {
        this.id_destino = id_destino;
        this.descripcion = descripcion;
        this.nombre_destino = nombre_destino;
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

    @Override
    public String toString() {
        return "Destino{" + "id_destino=" + id_destino + ", descripcion=" + descripcion + ", nombre_destino=" + nombre_destino + '}';
    }

}
