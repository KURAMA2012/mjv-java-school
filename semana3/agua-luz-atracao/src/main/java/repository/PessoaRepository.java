package repository;

import java.util.ArrayList;

import domain.Pessoa;

public class PessoaRepository {

	private static ArrayList<Pessoa> cadastro = new ArrayList<Pessoa>();
	
	public static void salvarCadastroPessoa(Pessoa pessoa) {
		cadastro.add(pessoa);
	}

	private static Pessoa getPessoa(int listar) {
		return cadastro.get(listar);
	}
	
	
}
