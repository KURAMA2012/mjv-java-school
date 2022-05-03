package service;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;

import model.Cadastro;
import model.Contrato;
import util.FormatadorUtil;

public class GerarMensagem {

	public String mensagem(Cadastro pessoa, Contrato contrato) {

		String cpfFormatado = FormatadorUtil.formatarCpfParaMensagem(pessoa.getCpf());
		StringBuilder sb = new StringBuilder();
		String valorFormatado = NumberFormat.getCurrencyInstance().format(contrato.getValor());
		String formatDataHora = (contrato.getDataHora()).format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		String cepFormatado = FormatadorUtil.formatarCepParaMensagem(pessoa.getEndereco().getCep());

			
		sb.append(("Senhor(a) " + pessoa.getNome() + " cpf de número " + cpfFormatado));
		sb.append(", Informamos que conforme contrato com protocolo de número " + contrato.getNumeroProtoloco());
		sb.append(" está agendado para a data " + formatDataHora + " a instalação do serviço de " + contrato.getTiposervico().ÁGUA +" com taxa de valor " + valorFormatado);
		sb.append(" em sua residência localizada no endereço abaixo:");
		sb.append("\nLogradouro: "
		+ pessoa.getEndereco().getLogradouro() + "\nComplemento: " + pessoa.getEndereco().getComplemento() + "\nBairro: " + pessoa.getEndereco().getBairro() + "\nCidade: " + pessoa.getEndereco().getCidade() + "\nCep: " + cepFormatado);
		
		
		
		/*
		sb.append("agendado para a data/hora "+ data +" / "+hora+ "h a instalação do serviço de "+servico+" com taxa de valor R$ "+valor+ " em sua residência localizada no\n");
		sb.append("endereço abaixo:\n\n");
		sb.append("Logradouro:"+contrato.getCliente().getEndereco().getLogradouro()+", "+contrato.getCliente().getEndereco().getNumero()+ "\n");
		sb.append("Complemento:"+contrato.getCliente().getEndereco().getComplemento()+"\n");
		sb.append("Bairro:"+contrato.getCliente().getEndereco().getBairro()+"\n");
		sb.append("Cidade:"+contrato.getCliente().getEndereco().getCidade().toUpperCase()+"/"+contrato.getCliente().getEndereco().getEstado()+"\n");
		sb.append("Cep:"+cep);
		*/
		System.out.println(sb.toString());
		
		return sb.toString();

	}

}
