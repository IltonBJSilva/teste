/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 17/01/2019 
 * Objetivo sucinto do programa: calcular e mostrar a quantidade de litros de combustível gastos em uma viagem
 * Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1017
 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class GastoDeCombustível {

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
