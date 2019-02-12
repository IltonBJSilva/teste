/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 17/01/2019 
 * Objetivo sucinto do programa: Calcular o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia total percorrida (em Km) e o total de combust�vel gasto (em litros).
 * Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1014 
 */


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		int distanciaTotal = Integer.parseInt(leitor.next());
		double totalCombustivelGasto = Double.parseDouble(leitor.next());
		
		leitor.close();
		
		DecimalFormat decimalFormat = new DecimalFormat("#.000");
		DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
		
		decimalFormatSymbols.setDecimalSeparator('.');
		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
		
		double consumoMedio;
		
		consumoMedio = distanciaTotal / totalCombustivelGasto;
		
		System.out.println(decimalFormat.format(consumoMedio) + " km/l");
	
		
	
		
	}

}
