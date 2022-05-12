package org.hcl.springbootlab.data.repositories;

import org.hcl.springbootlab.config.testes.BaseJpaTest;
import org.hcl.springbootlab.data.domain.Pessoa;
import org.hcl.springbootlab.data.repositories.PessoaRepository;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

//TODO: Verificar pq os testes dessa classe não são executados durante o 'mvn pacakge ou mvn test'.
public class PessoaRepositoryTest extends BaseJpaTest {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	private Pessoa p1Teste = new Pessoa("000000001628", "John Bunyan");
	private Pessoa p2Teste = new Pessoa("000000001834", "Charles Haddon Spurgeon");
	
	
	@Test
	@Order(1)
	public void pessoaSaveTest() {
		
		
		Pessoa p1s = this.pessoaRepository.save(p1Teste);
		Pessoa p2s = this.pessoaRepository.save(p2Teste);
		
		Assert.isTrue(p1s.getCpf().equals(p1Teste.getCpf()), "Cpf de p1s diferente do esperado.");
		Assert.isTrue(p2s.getCpf().equals(p2Teste.getCpf()), "Cpf de p2s diferente do esperado.");
	}
	
	@Test
	@Order(2)
	public void pessoafindByIdTest() {
				
		Pessoa p1s = this.pessoaRepository.findByCpf(p1Teste.getCpf());
		Pessoa p2s = this.pessoaRepository.findByCpf(p2Teste.getCpf());
		
		Assert.isTrue(p1s.getNome().equals(p1Teste.getNome()), "Nome de p1s diferente do esperado.");
		Assert.isTrue(p2s.getNome().equals(p2Teste.getNome()), "Nome de p2s diferente do esperado.");
	}

}
