package mjv.classes.objetos;

public class SistemaCadastro {
	public static void main(String[] args) {
		
		Pessoa pessoa =  new Pessoa(null);
		pessoa.nome = "Davy Lucas";
		pessoa.cpf = "5656342";
		System.out.println(pessoa.nome);
		System.out.println(pessoa.cpf);
	}
}
