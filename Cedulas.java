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
		
		int a = leitor.nextInt();

		if(a > 0){
			for(i = 0; i <= a; i++){
				System.out.println(""+a);
				System.out.println(i);
				System.out.println(a-100+" nota(s) de R$ 100,00");
				
				a = a / 100;
				System.out.println(a-50+" nota(s) de R$ 50,00");
				
				a = a / 50;
				System.out.println(a-20+" nota(s) de R$ 20,00");

				a = a / 20;

				System.out.println(a-10+" nota(s) de R$ 10,00");

				a = a / 10;

				System.out.println(a-5+" nota(s) de R$ 5,00");

				a = a / 5;

				System.out.println(a-2+" nota(s) de R$ 2,00");

				a = a / 2;
				System.out.println(a-1+" nota(s) de R$ 1,00");
			}
		} 
	else{
		System.out.println("Erro");
		}
		
	}

}
