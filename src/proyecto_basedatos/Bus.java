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
public class Bus {
    
    private int num_bus,cantidad_pas;
    private String matricula,color_bus,nombre_agencia;

    public Bus() {
    }

    public Bus(int num_bus, int cantidad_pas, String matricula, String color_bus, String nombre_agencia) {
        this.num_bus = num_bus;
        this.cantidad_pas = cantidad_pas;
        this.matricula = matricula;
        this.color_bus = color_bus;
        this.nombre_agencia = nombre_agencia;
    }

    public int getNum_bus() {
        return num_bus;
    }

    public void setNum_bus(int num_bus) {
        this.num_bus = num_bus;
    }

    public int getCantidad_pas() {
        return cantidad_pas;
    }

    public void setCantidad_pas(int cantidad_pas) {
        this.cantidad_pas = cantidad_pas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor_bus() {
        return color_bus;
    }

    public void setColor_bus(String color_bus) {
        this.color_bus = color_bus;
    }

    public String getNombre_agencia() {
        return nombre_agencia;
    }

    public void setNombre_agencia(String nombre_agencia) {
        this.nombre_agencia = nombre_agencia;
    }

    @Override
    public String toString() {
        return "Bus{" + "num_bus=" + num_bus + ", cantidad_pas=" + cantidad_pas + ", matricula=" + matricula + ", color_bus=" + color_bus + ", nombre_agencia=" + nombre_agencia + '}';
    }

   
    
}
