/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_basedatos;

import java.util.Date;

/**
 *
 * @author Wilson Pinos
 */
public class Detalle_venta {
    private String id_venta;
    private String id_cajero;
    private String id_boleto;
    private int num_venta;
    private Date fecha_de_venta;

    public Detalle_venta(String id_venta, String id_cajero, String id_boleto, int num_venta, Date fecha_de_venta) {
        this.id_venta = id_venta;
        this.id_cajero = id_cajero;
        this.id_boleto = id_boleto;
        this.num_venta = num_venta;
        this.fecha_de_venta = fecha_de_venta;
    }

    /**
     * @return the id_venta
     */
    public String getId_venta() {
        return id_venta;
    }

    /**
     * @param id_venta the id_venta to set
     */
    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    /**
     * @return the id_cajero
     */
    public String getId_cajero() {
        return id_cajero;
    }

    /**
     * @param id_cajero the id_cajero to set
     */
    public void setId_cajero(String id_cajero) {
        this.id_cajero = id_cajero;
    }

    /**
     * @return the id_boleto
     */
    public String getId_boleto() {
        return id_boleto;
    }

    /**
     * @param id_boleto the id_boleto to set
     */
    public void setId_boleto(String id_boleto) {
        this.id_boleto = id_boleto;
    }

    /**
     * @return the num_venta
     */
    public int getNum_venta() {
        return num_venta;
    }

    /**
     * @param num_venta the num_venta to set
     */
    public void setNum_venta(int num_venta) {
        this.num_venta = num_venta;
    }

    /**
     * @return the fecha_de_venta
     */
    public Date getFecha_de_venta() {
        return fecha_de_venta;
    }

    /**
     * @param fecha_de_venta the fecha_de_venta to set
     */
    public void setFecha_de_venta(Date fecha_de_venta) {
        this.fecha_de_venta = fecha_de_venta;
    }

    @Override
    public String toString() {
        return "Detalle_venta{" + "id_venta=" + id_venta + ", id_cajero=" + id_cajero + ", id_boleto=" + id_boleto + ", num_venta=" + num_venta + ", fecha_de_venta=" + fecha_de_venta + '}';
    }
}
