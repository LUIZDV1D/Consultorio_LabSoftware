/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Pedro Alcantara
 */
public class Consulta {
    
    private int id;
    private int idp;
    private String Nome;
    private String Datacad;
    private String Datacons;
    private String Medico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDatacad() {
        return Datacad;
    }

    public void setDatacad(String Datacad) {
        this.Datacad = Datacad;
    }

    public String getDatacons() {
        return Datacons;
    }

    public void setDatacons(String Datacons) {
        this.Datacons = Datacons;
    }

    public String getMedico() {
        return Medico;
    }

    public void setMedico(String Medico) {
        this.Medico = Medico;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }
    
    
    
    
}
