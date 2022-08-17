package br.com.college.service;

import br.com.college.model.EstudanteModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class EstudanteService {

    public EstudanteModel getEstudante() {
        return new EstudanteModel(
                1,
                "C1234",
                "Nome",
                "emailtest@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 18),
                18
        );
    }
}
