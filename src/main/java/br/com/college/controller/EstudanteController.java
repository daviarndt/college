package br.com.college.controller;

import br.com.college.model.EstudanteModel;
import br.com.college.service.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/estudante")
public class EstudanteController {

    @Autowired
    EstudanteService estudanteService;

    @GetMapping
    public ResponseEntity<List<EstudanteModel>> getAllEstudantes() {
        return ResponseEntity.status(HttpStatus.OK).body(estudanteService.findAllEstudantes());
    }
}
