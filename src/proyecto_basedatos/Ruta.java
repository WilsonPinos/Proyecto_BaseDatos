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
public class Ruta {
    
    private String codigo_ruta,origen;
    private double distancia;

    public Ruta() {
    }

    public Ruta(String codigo_ruta, String origen, double distancia) {
        this.codigo_ruta = codigo_ruta;
        this.origen = origen;
        this.distancia = distancia;
    }

    public String getCodigo_ruta() {
        return codigo_ruta;
    }

    public void setCodigo_ruta(String codigo_ruta) {
        this.codigo_ruta = codigo_ruta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Ruta{" + "codigo_ruta=" + codigo_ruta + ", origen=" + origen + ", distancia=" + distancia + '}';
    }

 
    
    
    
}
