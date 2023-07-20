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
public class Registro_contrato {
    
    private String id_contrato,matricula_bus,id_agencia;
    private Date fecha_contrato,fecha_exo_contra;

    public Registro_contrato() {
    }

    public Registro_contrato(String id_contrato, String matricula_bus, String id_agencia, Date fecha_contrato, Date fecha_exo_contra) {
        this.id_contrato = id_contrato;
        this.matricula_bus = matricula_bus;
        this.id_agencia = id_agencia;
        this.fecha_contrato = fecha_contrato;
        this.fecha_exo_contra = fecha_exo_contra;
    }

    public String getId_contrato() {
        return id_contrato;
    }

    public void setId_contrato(String id_contrato) {
        this.id_contrato = id_contrato;
    }

    public String getMatricula_bus() {
        return matricula_bus;
    }

    public void setMatricula_bus(String matricula_bus) {
        this.matricula_bus = matricula_bus;
    }

    public String getId_agencia() {
        return id_agencia;
    }

    public void setId_agencia(String id_agencia) {
        this.id_agencia = id_agencia;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(Date fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public Date getFecha_exo_contra() {
        return fecha_exo_contra;
    }

    public void setFecha_exo_contra(Date fecha_exo_contra) {
        this.fecha_exo_contra = fecha_exo_contra;
    }

    @Override
    public String toString() {
        return "Registro_contrato{" + "id_contrato=" + id_contrato + ", matricula_bus=" + matricula_bus + ", id_agencia=" + id_agencia + ", fecha_contrato=" + fecha_contrato + ", fecha_exo_contra=" + fecha_exo_contra + '}';
    }
    
    
}
