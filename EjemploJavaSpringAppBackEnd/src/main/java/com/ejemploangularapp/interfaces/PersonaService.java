/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemploangularapp.interfaces;

import com.ejemploangularapp.entity.Persona;
import java.util.List;

/**
 *
 * @author abarrime
 */
public interface PersonaService {

    public List<Persona> list();

    public Persona listById(Integer id);

    public Persona add(Persona persona);

    public Persona edit(Persona persona);

    public Persona delete(Integer id);

}
