package formatador;

import domain.Contrato;
import domain.Pessoa;

public class FormatadorCSV {
	public String mensagem(Pessoa pessoa, Contrato contrato) {
			
		StringBuilder sb = new StringBuilder();
		
		sb.append(pessoa.getNome());
		sb.append(pessoa.getCep());
		
		
		return sb.toString();
		
	}
}
