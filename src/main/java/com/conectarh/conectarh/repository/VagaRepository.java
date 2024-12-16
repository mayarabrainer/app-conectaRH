package com.conectarh.conectarh.repository;

import com.conectarh.conectarh.models.Vaga;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VagaRepository extends CrudRepository<Vaga, String> {
    Vaga findByCodigo(long codigo);

    List<Vaga> findByNome(String nome);

    // para a busca
    @Query(value = "select u from Vaga u where u.nome like %?1%")
    List<Vaga> findByNomesVaga(String nome);
}
