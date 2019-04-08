package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Alumno {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    String nombreAlumno;
    String apellidoPaterno;
    String apellidoMaterno;
    LocalDate fechaNacimiento;

}
