package br.com.apprh.sistemarh.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apprh.sistemarh.models.Vaga;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {
    
    Vaga findByCodigo(long id);
    List<Vaga> findByNome(String nome);

}