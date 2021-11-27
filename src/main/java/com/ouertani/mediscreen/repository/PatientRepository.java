package com.ouertani.mediscreen.repository;

import com.ouertani.mediscreen.model.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:4200")
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Page<Patient> findByPhone(@Nullable String phone, Pageable pageable);

    Page<Patient> findByLastNameLikeIgnoreCase(@Nullable String lastName, Pageable pageable);

}