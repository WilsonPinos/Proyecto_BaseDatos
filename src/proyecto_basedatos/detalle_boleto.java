/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_basedatos;

import java.util.Date;

/**
 *
 * @author mauri
 */
public class detalle_boleto {
    
     private String id_cliente,id_boleto,id_detalle;
     private Date fec_compra;
     private int cantidad;

    public detalle_boleto() {
    }

    public detalle_boleto(String id_cliente, String id_boleto, String id_detalle, Date fec_compra, int cantidad) {
        this.id_cliente = id_cliente;
        this.id_boleto = id_boleto;
        this.id_detalle = id_detalle;
        this.fec_compra = fec_compra;
        this.cantidad = cantidad;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getId_boleto() {
        return id_boleto;
    }

    public void setId_boleto(String id_boleto) {
        this.id_boleto = id_boleto;
    }

    public String getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(String id_detalle) {
        this.id_detalle = id_detalle;
    }

    public Date getFec_compra() {
        return fec_compra;
    }

    public void setFec_compra(Date fec_compra) {
        this.fec_compra = fec_compra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "detalle_boleto{" + "id_cliente=" + id_cliente + ", id_boleto=" + id_boleto + ", id_detalle=" + id_detalle + ", fec_compra=" + fec_compra + ", cantidad=" + cantidad + '}';
    }

    
}
