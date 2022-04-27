package javaexplorer.controlefluxo;

public class ControleFluxoCondicional {

	public static void main(String[] args) {
		simuladorNotaEscolarFluxoComposto(6);
		simuladorNotaEscolarFluxoComposto(10);

	}

	static void simuladorCaixaEletronicoFluxoSimples(double saldo, double valorSolicitado) {
		// foco do exemplo
		if (valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
		}

		System.out.println(saldo);
	}
	
	static void simuladorNotaEscolarFluxoComposto(double nota) {
		// foco do exemplo
		if (nota >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}

}
