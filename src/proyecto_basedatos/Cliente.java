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
public class Cliente extends Persona{
    
    private String Id_cliente;

    public Cliente() {
    }


    public Cliente(String Id_cliente, String nombre, String apellido, String edad, String celular, String correo, Date nacimiento) {
        super(nombre, apellido, edad, celular, correo, nacimiento);
        this.Id_cliente = Id_cliente;
    }

    public String getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(String Id_cliente) {
        this.Id_cliente = Id_cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Id_cliente=" + Id_cliente + '}';
    }
    
    
    
    
    
    
    
    
}
