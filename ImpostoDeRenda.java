
/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 24/01/2019 
 * Objetivo sucinto do programa: Ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda
 * Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1051
 */

package grupo1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double renda = Double.parseDouble(leitor.next());
		leitor.close();
		double total;
		
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
		
		decimalFormatSymbols.setDecimalSeparator('.');
		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
		
		 if(renda <= 2000.0) {
		        System.out.println("Isento");
		    }
		    else if(renda <= 3000.0 ){
		        total = (renda - 2000.0)*0.08;
		        System.out.println("R$ "+ decimalFormat.format(total));
		    }
		    else if( renda <= 4500.0){
		        total = (renda - 3000.0)*0.18 + (1000*0.08);
		        System.out.println("R$ "+ decimalFormat.format(total));
		    }
		    else {
		        total = (renda - 4500)*0.28 + (1500*0.18) + (1000*0.08);
		        System.out.println("R$ "+ decimalFormat.format(total));
		

		    }
		 
	}

}
