package org.hcl.springbootlab.data.repositories;

import org.hcl.springbootlab.data.domain.Pessoa;
import org.springframework.data.repository.Repository;


public interface PessoaRepository extends Repository<Pessoa, String>{
	
	Pessoa save(Pessoa pessoa);
	Pessoa findByCpf(String cpf);

}
