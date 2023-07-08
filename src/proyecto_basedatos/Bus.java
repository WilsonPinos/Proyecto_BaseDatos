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
    
    private int num_bus;
    private String matricula;

    public Bus() {
    }

    public Bus(int num_bus, String matricula) {
        this.num_bus = num_bus;
        this.matricula = matricula;
    }

    public int getNum_bus() {
        return num_bus;
    }

    public void setNum_bus(int num_bus) {
        this.num_bus = num_bus;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Bus{" + "num_bus=" + num_bus + ", matricula=" + matricula + '}';
    }
    
    
    
}
