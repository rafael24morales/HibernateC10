/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author rafaelm
 */

@Entity
@Table(name="Equipo", catalog="mundial")
public class Equipo {
    
    @Id @GeneratedValue
    @Column(name="idEquipo")
    private int IdEquipo;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="continente")
    private String continente;
    
    public Equipo(){}

    public int getIdEquipo() {
        return IdEquipo;
    }

    public void setIdEquipo(int IdEquipo) {
        this.IdEquipo = IdEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
    
    
}
