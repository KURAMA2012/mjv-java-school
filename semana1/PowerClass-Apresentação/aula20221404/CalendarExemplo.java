package aula20221404;

import java.util.Calendar;

public class CalendarExemplo {

	public static void main(String[] args) {
		
//		 1. A Classe Calendar, � uma classe abstrata.
//       Atrav�s dela � poss�vel converter entre um tempo em especifico em campos de calend�rio, como ANO,MES,DIA DO MES.
//       E tamb�m manipula��o dos campos de calend�rio, como pegar a data da proxima semana.

// 		 2. Por ser uma classe abstrata, n�o � poss�vel criar uma instancia da mesma. Nisso � possivel criar um
//     	m�todo que pode construir uma instancia de calend�rio formatado como queremos.;

		Calendar calendario = Calendar.getInstance();
		System.out.println(calendario);
		

		
		calendario.add(Calendar.YEAR, 10); 
		Integer ano = calendario.get(Calendar.YEAR); 
		System.out.println("Ano: " + ano);
			
		
	}

}
