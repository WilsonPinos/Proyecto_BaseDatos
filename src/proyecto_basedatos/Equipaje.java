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
public class Equipaje {
    
    private String id_equipaje,id_cliente,matricula_bus,tipo_equipaje;
    private double peso;

    public Equipaje() {
    }

    public Equipaje(String id_equipaje, String id_cliente, String matricula_bus, String tipo_equipaje, double peso) {
        this.id_equipaje = id_equipaje;
        this.id_cliente = id_cliente;
        this.matricula_bus = matricula_bus;
        this.tipo_equipaje = tipo_equipaje;
        this.peso = peso;
    }

    public String getId_equipaje() {
        return id_equipaje;
    }

    public void setId_equipaje(String id_equipaje) {
        this.id_equipaje = id_equipaje;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getMatricula_bus() {
        return matricula_bus;
    }

    public void setMatricula_bus(String matricula_bus) {
        this.matricula_bus = matricula_bus;
    }

    public String getTipo_equipaje() {
        return tipo_equipaje;
    }

    public void setTipo_equipaje(String tipo_equipaje) {
        this.tipo_equipaje = tipo_equipaje;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Equipaje{" + "id_equipaje=" + id_equipaje + ", id_cliente=" + id_cliente + ", matricula_bus=" + matricula_bus + ", tipo_equipaje=" + tipo_equipaje + ", peso=" + peso + '}';
    }
    
 
    
}
