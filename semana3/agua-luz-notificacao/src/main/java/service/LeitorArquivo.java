package service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeitorArquivo {

	Path path = Paths.get("C:\\MJV\\mjv-java-school\\semana3\\agua-luz-output\\agua-luz-contratos.txt");

	List<String> linhasArquivo = Files.readAllLines(path);

	
}
