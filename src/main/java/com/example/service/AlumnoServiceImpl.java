package com.example.service;

import com.example.entity.Alumno;
import com.example.repository.AlumnoRepository;
import com.example.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    @Autowired
    private  AlumnoRepository alumnoRepository;

    @Override
    public Alumno getById(Long id) {
        return alumnoRepository.findById(id).orElse(new Alumno());
    }

    @Override
    public List<Alumno> getAllAlumnos() {
        List<Alumno> alumnos = alumnoRepository.findAll();
        System.out.println("Estos son los alumnos "+ alumnos);
        return  alumnos;
    }

    @Override
    public Alumno createAlumno(Alumno alumno) {
        return null;
    }

    @Override
    public Alumno updateAlumo(Alumno alumno) {
        return (Alumno)alumnoRepository.save(alumno);
    }

    @Override
    public boolean deleteAlumno(Long alumnoId) {
        return false;
    }
}
