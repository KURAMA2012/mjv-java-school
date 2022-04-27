package servico;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Classe com metodos para gerar arquivo
public class GerarArquivo {
	//Arquivo .CSV
	public static void gerarArquivoCsv(String output) {
		String nomeArquivo = "agua-luz-contratos.csv";
		
		try {
			File diretorio = new File("C:\\MJV\\mjv-java-school\\semana3\\agua-luz-output");
			if(! diretorio.exists())
				diretorio.mkdirs();
			Path path = Paths.get(diretorio.getAbsolutePath(),nomeArquivo);
			Files.write(path, output.getBytes(StandardCharsets.UTF_8));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	//Arquivo .TXT
	public static void gerarArquivoTxt(String output) {
		String nomeArquivo = "agua-luz-contratos.txt";
		
		try {
			File diretorio = new File("C:\\MJV\\mjv-java-school\\semana3\\agua-luz-output");
			if(! diretorio.exists())
				diretorio.mkdirs();
			Path path = Paths.get(diretorio.getAbsolutePath(),nomeArquivo);
			Files.write(path, output.getBytes(StandardCharsets.UTF_8));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
