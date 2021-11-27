package com.ouertani.mediscreen.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.time.LocalDate;

@Table(name = "patient")
@Entity
@Getter
@Setter
//@SequenceGenerator(name = "patient-sequence-generator", sequenceName = "patient_sequence", initialValue = 5  , allocationSize=1)
public class Patient {

    private enum Gender {Not_Known, Male, Female, Not_Applicable};

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //- GenerationType.IDENTITY : The different generated table IDs are independent, in different entities
    //- GenerationType.SEQUENCE : separate DB sequences for every id
    //- GenerationType.AUTO     : hibernate internally creates hibernate_sequence table, shared between tables
    //@GeneratedValue(strategy =GenerationType.SEQUENCE)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="patient-sequence-generator")
    @Id
    @Column(name = "patient_id", nullable = false)
    private Long patientId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;

    //https://tomee.apache.org/examples-trunk/jpa-enumerated/
    @Enumerated
    @Column(name = "gender")
    private Gender gender;

    @Column(name = "main_adress")
    private String mainAdress;

    //@Digits(message = "Numero de telephone doit etre numerique", integer = 10, fraction = 0)
    //@Length(message = "Le numér de téléphone doit etre sur 10 caractères", min = 10, max = 10)
    @Column(name = "phone", length = 10)
    private String phone;

}