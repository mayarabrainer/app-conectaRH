package com.conectarh.conectarh.repository;

import com.conectarh.conectarh.models.Dependentes;
import com.conectarh.conectarh.models.Funcionario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DependentesRepository extends CrudRepository<Dependentes, String> {

    Iterable<Dependentes> findByFuncionario(Funcionario funcionario);

    // pensando no método delete
    Dependentes findByCpf(String cpf);

    Dependentes findById(long id);

    // criado para implementar
    List<Dependentes> findByNome(String nome);

    // para a busca
    @Query(value = "select u from Dependentes u where u.nome like %?1%")
    List<Dependentes> findByNomesDependentes(String nome);


}
