package com.conectarh.conectarh.repository;

import com.conectarh.conectarh.models.Dependente;
import com.conectarh.conectarh.models.Funcionario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DependenteRepository extends CrudRepository<Dependente, String> {

    Iterable<Dependente> findByFuncionario(Funcionario funcionario);

    Dependente findByCpf(String cpf);

    Dependente findById(long id);
    List<Dependente> findByNome(String nome);

    @Query(value = "select u from Dependente u where u.nome like %?1%")
    List<Dependente> findByNomesDependentes(String nome);
}
