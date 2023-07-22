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
    
    private String id_agencia,nombre_agencia,ubicacion, telefono, correo;

    public Agencia() {
    }

    public Agencia(String id_agencia, String nombre_agencia, String ubicacion, String telefono, String correo) {
        this.id_agencia = id_agencia;
        this.nombre_agencia = nombre_agencia;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.correo = correo;
    }

    /**
     * @return the id_agencia
     */
    public String getId_agencia() {
        return id_agencia;
    }

    /**
     * @param id_agencia the id_agencia to set
     */
    public void setId_agencia(String id_agencia) {
        this.id_agencia = id_agencia;
    }

    /**
     * @return the nombre_agencia
     */
    public String getNombre_agencia() {
        return nombre_agencia;
    }

    /**
     * @param nombre_agencia the nombre_agencia to set
     */
    public void setNombre_agencia(String nombre_agencia) {
        this.nombre_agencia = nombre_agencia;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Agencia{" + "id_agencia=" + id_agencia + ", nombre_agencia=" + nombre_agencia + ", ubicacion=" + ubicacion + ", telefono=" + telefono + ", correo=" + correo + '}';
    }

}
