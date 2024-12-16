package com.conectarh.conectarh.repository;

import com.conectarh.conectarh.models.Candidato;
import com.conectarh.conectarh.models.Vaga;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CandidatoRepository extends CrudRepository<Candidato, String> {

    Iterable<Candidato> findByVaga(Vaga vaga);

    Candidato findByRg(String rg);

    Candidato findById(long id);

    // para a busca
    @Query(value = "select u from Candidato u where u.nomeCandidato like %?1%")
    List<Candidato> findByNomesCandidatos(String nomeCandidato);
}
