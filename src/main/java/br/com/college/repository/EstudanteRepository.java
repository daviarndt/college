package br.com.college.repository;

import br.com.college.model.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepository extends JpaRepository<EstudanteModel, Integer> {

}
