/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 16/01/2019 
 * Objetivo sucinto do programa: Calcular o pre�o de pe�as
 * Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1010
 */


import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class C�lculoSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		int codigo = Integer.parseInt(leitor.next());
		int quantidadePe�a1 = Integer.parseInt(leitor.next());
		double valorUnitarioP1 = Double.parseDouble(leitor.next());
		
		int codigo2 = Integer.parseInt(leitor.next());
		int quantidadePe�a2= Integer.parseInt(leitor.next());
		double valorUnitarioP2 = Double.parseDouble(leitor.next());
		
		leitor.close();
		
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
		
		decimalFormatSymbols.setDecimalSeparator('.');
		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
		
		double valorSerPago = (valorUnitarioP1*quantidadePe�a1) + (valorUnitarioP2*quantidadePe�a2);
		
		System.out.println("VALOR A PAGAR: R$ "+decimalFormat.format(valorSerPago));
		
	}

}
