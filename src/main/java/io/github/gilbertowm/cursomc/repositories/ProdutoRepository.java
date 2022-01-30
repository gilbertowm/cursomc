package io.github.gilbertowm.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.gilbertowm.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
}
