package org.hcl.springbootlab.data.domain;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PessoaTest {
	
	
	@Test
	public void pessoaToStringTest() {
		log.info("Iniciando testes: pessoaToStringTest");
		Pessoa pessoa = new Pessoa("000000001834", "Charles Haddon Spurgeon");
		Assert.isTrue(pessoa.toString().equals("Pessoa(cpf=000000001834, nome=Charles Haddon Spurgeon)"), "Valor diferente do esperado.");		
	}
	

}
