package com.isaquecosta.microservices.produtos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
	
	

	@GetMapping
	public List<Produtos> findAll(){
		return new ArrayList<Produtos>();
	}
	
}
