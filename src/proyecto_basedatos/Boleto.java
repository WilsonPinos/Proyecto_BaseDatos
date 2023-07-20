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
public class Boleto {
    
    private double precio;
    private int num_asiento;
    private String id_boleto,matricula_bus,id_cajero,id_destino;

    public Boleto() {
    }

    public Boleto(double precio, int num_asiento, String id_boleto, String matricula_bus, String id_cajero, String id_destino) {
        this.precio = precio;
        this.num_asiento = num_asiento;
        this.id_boleto = id_boleto;
        this.matricula_bus = matricula_bus;
        this.id_cajero = id_cajero;
        this.id_destino = id_destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNum_asiento() {
        return num_asiento;
    }

    public void setNum_asiento(int num_asiento) {
        this.num_asiento = num_asiento;
    }

    public String getId_boleto() {
        return id_boleto;
    }

    public void setId_boleto(String id_boleto) {
        this.id_boleto = id_boleto;
    }

    public String getMatricula_bus() {
        return matricula_bus;
    }

    public void setMatricula_bus(String matricula_bus) {
        this.matricula_bus = matricula_bus;
    }

    public String getId_cajero() {
        return id_cajero;
    }

    public void setId_cajero(String id_cajero) {
        this.id_cajero = id_cajero;
    }

    public String getId_destino() {
        return id_destino;
    }

    public void setId_destino(String id_destino) {
        this.id_destino = id_destino;
    }

    @Override
    public String toString() {
        return "Boleto{" + "precio=" + precio + ", num_asiento=" + num_asiento + ", id_boleto=" + id_boleto + ", matricula_bus=" + matricula_bus + ", id_cajero=" + id_cajero + ", id_destino=" + id_destino + '}';
    }

  
    
    
}
