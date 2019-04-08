package com.example.repository;

import com.example.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
public interface AlumnoRepository extends JpaRepository<Alumno,Long> {
    Optional<Alumno>findById(Long id);


}
