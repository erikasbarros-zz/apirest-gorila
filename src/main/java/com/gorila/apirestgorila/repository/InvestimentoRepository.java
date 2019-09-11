package com.gorila.apirestgorila.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gorila.apirestgorila.models.Investimento;

//essa interface vai estender na classe JpaRepository
//Por que usar o Jpa Repository? Pq ele já possui vários métodos prontos para fazer persistência no banco de dados
//Ex.: listAll();

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{ //argumentos: entidade e o tipo de id
	Investimento findById(long id);
}
