/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 18/01/2019 
 * Objetivo sucinto do programa: Ler um valor inteiro correspondente � idade de uma pessoa em dias e informe-a em anos, meses e dias
 * Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1020
 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class IdadeemDias {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int idade = leitor.nextInt();
		leitor.close();
		
		int ano = 365;
		int mes = 30;

		int totalAno= idade / ano;
		int totalDia= (idade % ano)%mes;
		int totalMes= (idade % ano) / mes;

		System.out.println(totalAno+ " ano(s)");		
		System.out.println(totalMes+ " mes(es)");
		System.out.println(totalDia+ " dia(s)");
		
	}

}
