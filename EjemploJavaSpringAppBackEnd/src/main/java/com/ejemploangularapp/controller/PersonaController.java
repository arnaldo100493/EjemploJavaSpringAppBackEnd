/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemploangularapp.controller;

import com.ejemploangularapp.interfaces.PersonaService;
import com.ejemploangularapp.entity.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author abarrime
 */
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas"})
public class PersonaController {

    @Autowired
    public PersonaService service;

    public PersonaController() {

    }

    @GetMapping(name = "/listar")
    public List<Persona> list() {
        return this.service.list();
    }

    @GetMapping(name = "/listarPorId", path = {"/{id}"})
    public Persona listById(@PathVariable("id") Integer id) {
        return this.service.listById(id);
    }

    @PostMapping("/agregar")
    public Persona add(@RequestBody Persona persona) {
        return this.service.add(persona);
    }

    @PutMapping(name = "/editar", path = {"/{id}"})
    public Persona edit(@RequestBody Persona persona, @PathVariable("id") Integer id) {
        persona.setIdPersona(id);
        return this.service.edit(persona);
    }

    @DeleteMapping(name = "/eliminar", path = {"/{id}"})
    public Persona delete(@PathVariable("id") Integer id) {
        return this.service.delete(id);
    }
}
