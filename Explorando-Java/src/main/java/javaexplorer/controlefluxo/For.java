package javaexplorer.controlefluxo;

public class For {

	public static void main(String[] args) {

		//Simples
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		
		
		
		//Com Array
		String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

		for (int x = 0; x < alunos.length; x++) {
			System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
		}

		
		//For Each
		//Com Array
		String pessoas[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

		// Forma abreviada
		for (String aluno : pessoas) {
			System.out.println(aluno);
		}

		
		//For com break 
		for(int numero = 1; numero <=5; numero ++){
			if(numero==3)
				break;//Break significa quebrar, parar, frear, interromper.
			
			System.out.println(numero);
			
		}
		
		

	}
}
