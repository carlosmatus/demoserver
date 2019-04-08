package com.example.service;

import com.example.entity.Alumno;

import java.util.List;



    public interface AlumnoService {
        public Alumno getById(Long id);
        public List<Alumno> getAllAlumnos();
        public Alumno createAlumno(Alumno alumno);
        public Alumno updateAlumo(Alumno alumno) ;
        public boolean deleteAlumno(Long alumnoId) ;

    }

