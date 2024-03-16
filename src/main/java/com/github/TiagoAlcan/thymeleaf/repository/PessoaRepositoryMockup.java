package com.github.TiagoAlcan.thymeleaf.repository;

import java.util.List;

import java.util.ArrayList;

import com.github.TiagoAlcan.thymeleaf.model.Pessoa;

public class PessoaRepositoryMockup {

	//
	//
	
	
	public List<Pessoa> list(){
		List<Pessoa> result = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa(1L,"Pelé","M");
		
		result.add(pessoa);
		
		pessoa = new Pessoa(2L,"Elizabeth","F");
		
		result.add(pessoa);
		
		result.add(new Pessoa(3L, "Madona", "F"));
		
		return null;
	}
	
}
