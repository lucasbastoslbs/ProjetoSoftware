package com.example.CRUD.Repository;

import com.example.CRUD.model.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {
}
