package mjv.classes.objetos;

public class Pessoa {

	String nome;
	String cpf;
	String rg;
	
	Pessoa (String cpf, String nome){
		this.cpf = cpf;
	}
	
	Pessoa(String cpf){
		this(cpf,"B");
	}
}
