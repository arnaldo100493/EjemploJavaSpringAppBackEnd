/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemploangularapp.impl;

import com.ejemploangularapp.interfaces.PersonaService;
import com.ejemploangularapp.interfaces.PersonaRepository;
import com.ejemploangularapp.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author abarrime
 */
@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository repository;

    public PersonaServiceImpl() {

    }

    @Override
    public List<Persona> list() {
        return this.repository.findAll();
    }

    @Override
    public Persona listById(Integer id) {
        return this.repository.findOne(id);
    }

    @Override
    public Persona add(Persona persona) {
        return this.repository.save(persona);
    }

    @Override
    public Persona edit(Persona persona) {
        return this.repository.save(persona);
    }

    @Override
    public Persona delete(Integer id) {
        Persona persona = this.repository.findOne(id);
        if (persona != null) {
            this.repository.delete(persona);
        }
        return persona;
    }

}