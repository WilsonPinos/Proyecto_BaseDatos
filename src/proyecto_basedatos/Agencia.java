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
public class Agencia {
    
    private String id_agencia,nombre_agencia,ubicacion;

    public Agencia() {
    }

    public Agencia(String id_agencia, String nombre_agencia, String ubicacion) {
        this.id_agencia = id_agencia;
        this.nombre_agencia = nombre_agencia;
        this.ubicacion = ubicacion;
    }

    public String getId_agencia() {
        return id_agencia;
    }

    public void setId_agencia(String id_agencia) {
        this.id_agencia = id_agencia;
    }

    public String getNombre_agencia() {
        return nombre_agencia;
    }

    public void setNombre_agencia(String nombre_agencia) {
        this.nombre_agencia = nombre_agencia;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Agencia{" + "id_agencia=" + id_agencia + ", nombre_agencia=" + nombre_agencia + ", ubicacion=" + ubicacion + '}';
    }

   
    
    
    
}
