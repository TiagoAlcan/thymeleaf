package com.github.TiagoAlcan.thymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.TiagoAlcan.thymeleaf.model.Pessoa;
import com.github.TiagoAlcan.thymeleaf.repository.PessoaRepositoryMockup;



@Controller
@RequestMapping("/pessoas")
public class PessoaController {
	private PessoaRepositoryMockup pessoaRepository;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String lista (Model model) {
		List<Pessoa> pessoas = pessoaRepository.list();
		model.addAttribute("pessoas", pessoas);
		return "pessoa/lista.html";
	}
	

}
