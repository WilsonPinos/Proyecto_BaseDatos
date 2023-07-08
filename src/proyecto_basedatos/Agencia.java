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
    
    private String codigo_agencia,nombre_agencia;

    public Agencia() {
    }

    public Agencia(String codigo_agencia, String nombre_agencia) {
        this.codigo_agencia = codigo_agencia;
        this.nombre_agencia = nombre_agencia;
    }

    public String getCodigo_agencia() {
        return codigo_agencia;
    }

    public void setCodigo_agencia(String codigo_agencia) {
        this.codigo_agencia = codigo_agencia;
    }

    public String getNombre_agencia() {
        return nombre_agencia;
    }

    public void setNombre_agencia(String nombre_agencia) {
        this.nombre_agencia = nombre_agencia;
    }

    @Override
    public String toString() {
        return "Agencia{" + "codigo_agencia=" + codigo_agencia + ", nombre_agencia=" + nombre_agencia + '}';
    }
    
    
    
    
}
