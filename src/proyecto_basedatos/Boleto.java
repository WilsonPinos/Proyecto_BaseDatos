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
    private String codigo_boleto;

    public Boleto() {
    }

    public Boleto(double precio, int num_asiento, String codigo_boleto) {
        this.precio = precio;
        this.num_asiento = num_asiento;
        this.codigo_boleto = codigo_boleto;
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

    public String getCodigo_boleto() {
        return codigo_boleto;
    }

    public void setCodigo_boleto(String codigo_boleto) {
        this.codigo_boleto = codigo_boleto;
    }

    @Override
    public String toString() {
        return "Boleto{" + "precio=" + precio + ", num_asiento=" + num_asiento + ", codigo_boleto=" + codigo_boleto + '}';
    }
    
    
    
}
