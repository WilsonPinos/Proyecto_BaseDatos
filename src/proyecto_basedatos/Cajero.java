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
public class Cajero extends Persona{
    
    private String Id_cajero,nivel_estudio;

    public Cajero() {
        super();
    }

    public Cajero(String Id_cajero, String nivel_estudio, String nombre, String apellido, String edad, String celular, String correo, Date nacimiento) {
        super(nombre, apellido, edad, celular, correo, nacimiento);
        this.Id_cajero = Id_cajero;
        this.nivel_estudio = nivel_estudio;
    }

   

    public String getId_cajero() {
        return Id_cajero;
    }

    public void setId_cajero(String Id_cajero) {
        this.Id_cajero = Id_cajero;
    }

    public String getNivel_estudio() {
        return nivel_estudio;
    }

    public void setNivel_estudio(String nivel_estudio) {
        this.nivel_estudio = nivel_estudio;
    }

    @Override
    public String toString() {
        return "Cajero{" + "Id_cajero=" + Id_cajero + ", nivel_estudio=" + nivel_estudio + '}';
    }

    
    
    
    
    
    
    
}
