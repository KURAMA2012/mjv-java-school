package arrays;

import java.util.HashSet;
import java.util.Set;

public class ArraysExplorer {
	public static void main(String[] args) {
		Set <String> alunos = new HashSet<String>();
		
		alunos.add("Pedro");
		alunos.add("Caio");
		
		System.out.println(alunos.size());
		
		alunos.remove(1);
		
		for(String aluno: alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos.size());
	
		alunos.add("Marcos");
		alunos.add("Lebre");
		
		for(String aluno:alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos.size());
	}
	

}
