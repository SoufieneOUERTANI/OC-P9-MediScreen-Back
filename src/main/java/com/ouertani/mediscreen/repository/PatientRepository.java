package com.ouertani.mediscreen.repository;

import com.ouertani.mediscreen.model.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Page<Patient> findByLastNameLikeIgnoreCase(@Nullable String lastName, Pageable pageable);

}