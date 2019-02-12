/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 17/01/2019 
 * Objetivo sucinto do programa: calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem
 * Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1017
 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class GastoDeCombust�vel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		double tempoGasto = leitor.nextInt();
		double velocidadeMedia = leitor.nextInt();
		
		DecimalFormat decimalFormat = new DecimalFormat("#0.000");
		DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
		
		decimalFormatSymbols.setDecimalSeparator('.');
		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
		
		double quantidadeLitro;
		
		quantidadeLitro = (tempoGasto * velocidadeMedia / 12);
		
		System.out.println(decimalFormat.format(quantidadeLitro));
		
	}

}
