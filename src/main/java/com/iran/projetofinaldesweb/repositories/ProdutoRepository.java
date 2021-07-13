package com.iran.projetofinaldesweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iran.projetofinaldesweb.domain.Produto;

@Repository  
public interface ProdutoRepository  extends JpaRepository<Produto, Integer>{

	

}
