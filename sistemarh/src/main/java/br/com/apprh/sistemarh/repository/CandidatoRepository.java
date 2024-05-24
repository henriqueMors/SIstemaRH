package br.com.apprh.sistemarh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.apprh.sistemarh.models.Candidato;

public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
}
