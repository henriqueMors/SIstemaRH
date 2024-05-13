package br.com.apprh.sistemarh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.apprh.sistemarh.models.Vaga;

public interface VagaRepository extends CrudRepository<Vaga, String> {

    Vaga findByCodigo(long codigo);
    List<Vaga> findByNome(String nome);

}