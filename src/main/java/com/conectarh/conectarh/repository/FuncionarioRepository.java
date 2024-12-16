package com.conectarh.conectarh.repository;

import com.conectarh.conectarh.models.Funcionario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FuncionarioRepository extends CrudRepository<Funcionario, String>{

    Funcionario findById(long id);

    // busca
    Funcionario findByNome(String nome);

    // para a busca
    @Query(value = "select u from Funcionario u where u.nome like %?1%")
    List<Funcionario> findByNomes(String nome);

}
