package repository;

import java.util.ArrayList;

import model.Cadastro;

public class PessoaRepository {

	private static ArrayList<Cadastro> cadastro = new ArrayList<Cadastro>();
	
	public static void salvarCadastroPessoa(Cadastro pessoa) {
		cadastro.add(pessoa);
	}

	private static Cadastro getPessoa(int listar) {
		return cadastro.get(listar);
	}
	
	
}
