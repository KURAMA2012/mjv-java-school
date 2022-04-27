package javaexplorer.fundamentos;

public class StringExplorer {

	public static void main(String[] args) {
		StringExplorer.explorandoMetodoSplit();
		
		
	}
	//p split separa as palavras de uma string
	static void explorandoMetodoSplit() {
		String nomeCompleto = "DAVY LUCAS BRANCO CASTELO";
		String [] palavras = nomeCompleto.split(" ");
		//como percorrer um array.
		for(String palavra: palavras) {
			System.out.println(palavra);
		}
		/*
		 * simulando a utilizacao do split no contexto
		 * de um ticket de passagem aerea
		 */
		String lastname = palavras[palavras.length-1];
		String fisrtname = palavras[0];
		System.out.println(lastname.concat(" ").concat(fisrtname));
	}
}
