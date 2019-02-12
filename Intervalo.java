/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 23/01/2019 
 * Objetivo sucinto do programa: ler um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 * Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1037
 */

package grupo1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double intervalo = Double.parseDouble(leitor.next());
		leitor.close();
		
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
		
		decimalFormatSymbols.setDecimalSeparator('.');
		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
		
		if(intervalo < 0 || intervalo > 100) {
			System.out.println("Fora de intervalo");
		} else if(intervalo <= 25.00) {
			System.out.println("Intervalo [0,25]");
		} else if(intervalo > 25.00 && intervalo <= 50.00) {
			System.out.println("Intervalo (25,50]");
		} else if(intervalo >= 50.00 && intervalo <= 75.00) {
			System.out.println("Intervalo (50,75]");
		} else if(intervalo >=75.00 && intervalo <=100.00) {
			System.out.println("Intervalo (75,100]");
		}
		
	}

}
