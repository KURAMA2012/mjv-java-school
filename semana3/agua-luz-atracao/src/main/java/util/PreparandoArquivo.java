package util;

import model.Cadastro;
import model.Contrato;
import model.Endereco;

public class PreparandoArquivo {
	public String prepararConteudoArquivoCSV(Cadastro pessoa, Contrato contrato) {
		StringBuilder bs = new StringBuilder();

		// String.format("%014d", Long.valueOf(pessoa.getCpf().replaceAll("\\D", "")));
		// String valorFormatado =
		// NumberFormat.getCurrencyInstance().format(contrato.getValor());
		// String rgFormatado = FormatadorUtil.formatarRg(pessoa.getRg());
		Endereco conteudo = pessoa.getEndereco();
		String cpfFormatado = FormatadorUtil.formatarCpf(pessoa.getCpf());
		String cepFormatado = FormatadorUtil.formatarCep(conteudo.getCep());
		String celularFormatado = FormatadorUtil.formatarCelular(pessoa.getCelular());
		String dataFormatada = FormatadorUtil.formatarData(contrato.getDataHora());

		bs.append(String.format(cpfFormatado));
		bs.append(";");
		bs.append(pessoa.getRg());
		bs.append(";");
		bs.append(pessoa.getNome());
		bs.append(";");
		bs.append(String.format(celularFormatado));
		bs.append(";");
		bs.append(conteudo.getLogradouro());
		bs.append(";");
		bs.append(conteudo.getNumero());
		bs.append(";");
		bs.append(conteudo.getComplemento());
		bs.append(";");
		bs.append(conteudo.getBairro());
		bs.append(";");
		bs.append(conteudo.getCidade());
		bs.append(";");
		bs.append(conteudo.getUf());
		bs.append(";");
		bs.append(cepFormatado);
		bs.append(";");
		bs.append(conteudo.getPais());
		bs.append(";");
		bs.append(contrato.getNumeroProtoloco());
		bs.append(";");
		bs.append(String.format(dataFormatada));
		bs.append(";");
		bs.append(contrato.getTiposervico().ÁGUA);
		bs.append(";");
		bs.append(contrato.getValor());
		bs.append(";");
		bs.append(contrato.getTipoNotificacao().SMS);

		return bs.toString();
	}

	public String prepararConteudoArquivoTXT(Cadastro pessoa, Contrato contrato) {
		StringBuilder bs = new StringBuilder();

		bs.append(String.format("%011d", Long.valueOf(pessoa.getCpf().replaceAll("\\D", ""))));
		bs.append(String.format("%010d", Long.valueOf(pessoa.getRg().replaceAll("\\D", ""))));
		String nome = pessoa.getNome();
		if (nome.length() >= 30) {
			bs.append(nome.substring(0, 30).toUpperCase());
		} else {
			bs.append(String.format("%-30s", nome.toUpperCase()));
		}

		bs.append(String.format("%011d", Long.valueOf(pessoa.getCelular().replaceAll("\\D", ""))));

		String logradouro = pessoa.getEndereco().getLogradouro();
		if (logradouro.length() >= 20) {
			bs.append(logradouro.substring(0, 20).toUpperCase());
		} else {
			bs.append(String.format("%-20s", logradouro.toUpperCase()));
		}

		bs.append(String.format("%06d", Long.valueOf(pessoa.getEndereco().getNumero())));

		String complemento = pessoa.getEndereco().getComplemento();
		if (complemento.length() >= 10) {
			bs.append(complemento.substring(0, 10).toUpperCase());
		} else {
			bs.append(String.format("%-10s", logradouro.toUpperCase()));
		}

		String bairro = pessoa.getEndereco().getBairro();
		if (bairro.length() >= 15) {
			bs.append(bairro.substring(0, 15).toUpperCase());
		} else {
			bs.append(String.format("%-15s", bairro.toUpperCase()));
		}

		String cidade = pessoa.getEndereco().getCidade();
		if (cidade.length() >= 30) {
			bs.append(cidade.substring(0, 30).toUpperCase());
		} else {
			bs.append(String.format("%-30s", cidade.toUpperCase()));
		}

		String uf = pessoa.getEndereco().getUf();
		if (uf.length() >= 2) {
			bs.append(uf.substring(0, 2).toUpperCase());
		} else {
			bs.append(String.format("%-2s", uf.toUpperCase()));
		}
		bs.append(String.format("%08d", Long.valueOf(pessoa.getEndereco().getCep().replaceAll("\\D", ""))));
		bs.append(pessoa.getEndereco().getPais().getSigla());
		bs.append(String.format("%010d", Long.valueOf(contrato.getNumeroProtoloco())));
		bs.append(contrato.getData().toString().replaceAll("\\D", ""));
		bs.append(contrato.getHora().toString().replaceAll("\\D", ""));
		bs.append(contrato.getTiposervico().getSigla());
		bs.append(String.valueOf(contrato.getValor()).replaceAll("\\D", ""));
		bs.append(contrato.getTipoNotificacao().getNotificar());

		return bs.toString();
	}
}
