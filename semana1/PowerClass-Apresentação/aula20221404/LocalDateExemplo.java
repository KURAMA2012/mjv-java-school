package aula20221404;

import java.time.LocalDate;

import static java.time.Month.APRIL;
import static java.time.Month.JUNE;

public class LocalDateExemplo {
	
	  public static void main(String[] args) {
		  
			//	 1.A Classe LocalDate � uma classe imut�vel.
			//   Atrav�s dela � poss�vel representar uma data, normalmente visualizado atrav�s de ano-mes-dia.
			//    � poss�vel acessar outras informa��es como, dia da semana, semana do ano...
			
			// 2. LocalDate now = new LocalDate(2022,04,17); (� um construtor privado)
				
			     LocalDate now = LocalDate.of(2022,4,17); //Vai funcionar da mesma maneira que o construtor privado.
			     System.out.println("2: " + now);
			     
			     
			     
			 /*3.*/
			     /*3.1.*/ //M�todo que adiciona o n�mero de dias informado no par�metro. Retorna uma c�pia do Date com o n�mero adicionado.
			     System.out.println("3.1: " + now.plusDays(10));
			
			     /*3.2.*/ // M�todo que combina a Data com o tempo no par�metro para criar um LocalDateTime;
			     System.out.println("3.2: " + now.atTime(15,23));
			
			     /*3.3.*/ //M�todo que compara o quanto tempo falta de uma data para outra. Retorna em formato de Period.
			     LocalDate after = LocalDate.of(2032,4,15);
			     System.out.println("3.3: " + now.until(after));
			
			     /*3.4.*/ //M�todo que compara uma data a outra, levando em considera��o apenas o ano. Retorna um int;
			     System.out.println("3.4: " + now.compareTo(after));
			
			//     4. M�todo sobrecarregado � o .atTime;
			     now.atTime(16,40,55);
			     now.atTime(18,55,45,99);
			
			//     5. Tenho uma data em especifico e quero saber quanto tempo falta para uma outra data especifica;
			     LocalDate example3 = LocalDate.of(2022,APRIL,17);
			     LocalDate futureDate = LocalDate.of(2025, JUNE, 20);
			     futureDate.plusDays(15);	
			     System.out.println("5: " + example3.until(futureDate));
			}
	  
}
