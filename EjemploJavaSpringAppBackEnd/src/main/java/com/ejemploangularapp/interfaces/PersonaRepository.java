/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemploangularapp.interfaces;

import com.ejemploangularapp.entity.Persona;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author abarrime
 */
public interface PersonaRepository extends Repository<Persona, Integer> {

    public List<Persona> findAll();

    public Persona findById(Integer id);

    public Persona save(Persona persona);

    public void delete(Persona persona);

}
