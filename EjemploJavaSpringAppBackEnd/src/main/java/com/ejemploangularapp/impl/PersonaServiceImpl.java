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
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(readOnly = true)
    public List<Persona> list() {
        return this.repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Persona listById(Integer id) {
        return this.repository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona add(Persona persona) {
        return this.repository.save(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona edit(Persona persona) {
        return this.repository.save(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona delete(Integer id) {
        Persona persona = this.repository.findById(id);
        if (persona != null) {
            this.repository.delete(persona);
        }
        return persona;
    }

}
