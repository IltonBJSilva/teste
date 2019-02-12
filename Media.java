/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 16/01/2019 
 * Objetivo sucinto do programa: Calcular a media de notas de um aluno
 * Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1006
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		float a = Float.parseFloat(leitor.next());
		
		float b = Float.parseFloat(leitor.next());
		
		float c = Float.parseFloat(leitor.next());

		leitor.close();
		
		DecimalFormat decimalFormat = new DecimalFormat("#,###.0");
		DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
		
		decimalFormatSymbols.setDecimalSeparator('.');
		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
		
		 
		float media;

		media = (a*2 + b*3 + c*5) /(3+2+5); 
		
		System.out.println("MEDIA = "+ decimalFormat.format(media));
		
		
		

	}

}
