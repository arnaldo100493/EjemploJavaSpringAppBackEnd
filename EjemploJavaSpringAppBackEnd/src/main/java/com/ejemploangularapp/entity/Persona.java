/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemploangularapp.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author abarrime
 */
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3648593832568027339L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersona;

    @Column
    private String nombre;

    @Column
    private String apellido;

    public Persona() {
        this.idPersona = 0;
        this.nombre = "";
        this.apellido = "";
    }

    public Persona(String nombre, String apellido) {
        this.idPersona = 0;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(Integer id, String nombre, String apellido) {
        this.idPersona = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * @return the idPersona
     */
    public Integer getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
}
