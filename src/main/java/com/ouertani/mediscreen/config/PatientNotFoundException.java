package com.ouertani.mediscreen.config;

public class PatientNotFoundException extends RuntimeException {

    public PatientNotFoundException(Long id) {
        super("Patient id not found : " + id);
    }

}