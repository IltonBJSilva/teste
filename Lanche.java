/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 23/01/2019 
 * Objetivo sucinto do programa:ler o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1038
 */

package grupo1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		int codigo = leitor.nextInt();
		int quantidade = leitor.nextInt();
		
		leitor.close();
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
		
		decimalFormatSymbols.setDecimalSeparator('.');
		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
		
		double pagar;
		
		if(codigo == 1) {
			
			pagar = quantidade*4;
			System.out.println("Total: R$ "+decimalFormat.format(pagar));
		}
		else if(codigo == 2) {
			pagar = quantidade*4.50;
			
			System.out.println("Total: R$ "+decimalFormat.format(pagar));
		}
		else if(codigo == 3) {
			pagar = quantidade*5;
			System.out.println("Total: R$ "+decimalFormat.format(pagar));
		}
		else if(codigo == 4) {
			pagar = quantidade*2;
			System.out.println("Total: R$ "+decimalFormat.format(pagar));
		}
		else if(codigo == 5) {
			pagar = quantidade*1.50;
			System.out.println("Total: R$ "+decimalFormat.format(pagar));
		}
	}

}
