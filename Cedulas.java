/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 22/01/2019 
 * Objetivo sucinto do programa: calcular o menor n�mero de notas poss�veis (c�dulas) no qual o valor pode ser decomposto
 * Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1018 
 */

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		int b = leitor.nextInt();

		if (a2 > 0) {
			for (i = 0; i <= a2; i++) {
				System.out.println("" + a2);
				System.out.println(i);
				System.out.println(a2 - 100 + " nota(s) de R$ 100,00");

				int a2 = a;
				a = a2 / 100;
				System.out.println(a2 - 50 + " nota(s) de R$ 50,00");

				a = a2 / 50;
				System.out.println(a2 - 20 + " nota(s) de R$ 20,00");

				a = a2 / 20;

				System.out.println(a2 - 10 + " nota(s) de R$ 10,00");

				a = a2 / 10;

				System.out.println(a2 - 5 + " nota(s) de R$ 5,00");

				a = a2 / 5;

				System.out.println(a2 - 2 + " nota(s) de R$ 2,00");

				a = a2 / 2;
