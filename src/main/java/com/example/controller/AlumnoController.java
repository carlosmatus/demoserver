package com.example.controller;

import com.example.entity.Alumno;
import com.example.repository.AlumnoRepository;
import com.example.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;
    @GetMapping(path = "/alumnos",  produces = {
            MediaType.APPLICATION_JSON_VALUE })
    public @ResponseBody
    List<Alumno> getAllAlumnos() {
            List<Alumno> lista = alumnoService.getAllAlumnos();
        System.out.println("lista de salida "+lista);
            return lista;


    }

    @GetMapping(path = "/alumnos/{alumnoId}", produces = {
            MediaType.APPLICATION_JSON_VALUE })
    public
    Alumno getAlumno(@PathVariable(value = "alumnoId", required = true) Long alumnoId) {
      Alumno alumno  = alumnoService.getById(alumnoId);
        System.out.println("Nombre del alumno "+alumno);
      return alumno;


    }


}
