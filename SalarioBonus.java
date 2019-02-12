/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 15/01/2019 
 * Objetivo sucinto do programa:: Calcula o salário de um funcionário baseado na sua comissão
 * Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1009 
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SalarioBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.next();
		double salario = Double.parseDouble(leitor.next());
		double totalVendido = Double.parseDouble(leitor.next());
	
		leitor.close();
		
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
		
		decimalFormatSymbols.setDecimalSeparator('.');
		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
		
		double total;
		double comissao;
		
		
		comissao = totalVendido*0.15;
		total = comissao+salario;
		 
		
	
		
		System.out.println("TOTAL = R$ "+ decimalFormat.format(total));
		
	}

}
