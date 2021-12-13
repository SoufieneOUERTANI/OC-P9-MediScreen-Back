package com.ouertani.mediscreen.controller;

import com.ouertani.mediscreen.config.PatientNotFoundException;
import com.ouertani.mediscreen.model.Patient;
import com.ouertani.mediscreen.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    private PatientRepository repository;
	
    // Find
    @GetMapping("/Patients-one/{id}")
    Patient findOne(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException(id));
    }

}