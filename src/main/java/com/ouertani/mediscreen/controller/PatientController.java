package com.ouertani.mediscreen.controller;

import com.ouertani.mediscreen.config.PatientNotFoundException;
import com.ouertani.mediscreen.model.Patient;
import com.ouertani.mediscreen.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    private final PatientRepository repository;

    @Autowired
    public PatientController(PatientRepository repository) {
        this.repository = repository;
    }

    @PreAuthorize("hasAuthority('SCOPE_patientfornote')")
    @GetMapping("/patientfornote/{id}")
    Patient findPatientForNote(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException(id));
    }

}