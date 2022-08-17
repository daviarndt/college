package br.com.college.service;

import br.com.college.model.EstudanteModel;
import br.com.college.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    EstudanteRepository estudanteRepository;

    public List<EstudanteModel> findAllEstudantes() {
        return estudanteRepository.findAll();
    }
}
