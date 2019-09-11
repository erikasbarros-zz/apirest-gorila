package com.gorila.apirestgorila.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gorila.apirestgorila.models.Investimento;
import com.gorila.apirestgorila.repository.InvestimentoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



//Classe que irá receber as requisições http
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Investimentos")
@CrossOrigin(origins="*") //aqui estou dizendo que qualquer domínio pode acessar essa api

public class InvestimentoResource {
	@Autowired
	InvestimentoRepository investimentoRepository;
	
	//get: método que irá listar todos os produtos do banco
	@GetMapping("/invests")
	@ApiOperation(value="Retorna uma lista de investimentos")
	public List<Investimento> listaInvestimentos(){
		return investimentoRepository.findAll();
	}
	
	@GetMapping("/invest/{id}")
	@ApiOperation(value="Retorna um investimento único")
	public Investimento listaInvestimentoUnico(@PathVariable(value="id")long id){ //argumento=id
		return investimentoRepository.findById(id);
	}
	
	@PostMapping("/invest")
	@ApiOperation(value="Salva um investimento")
	public Investimento salvaInvest(@RequestBody Investimento investimento){
		return investimentoRepository.save(investimento);
	}
	
	@DeleteMapping("/invest")
	@ApiOperation(value="Deleta um investimento")
	public void deletaInvest(@RequestBody Investimento investimento){
		investimentoRepository.delete(investimento);
	}
	
	@PutMapping("/invest")
	@ApiOperation(value="Atualiza um investimento")
	public Investimento atualizaInvest(@RequestBody Investimento investimento){
		return investimentoRepository.save(investimento);
	}
}
