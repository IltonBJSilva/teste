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

		if(b > 0){
			for(i = 0; i <= b; i++){
				System.out.println(""+b);
				System.out.println(i);
				System.out.println(b-100+" nota(s) de R$ 100,00");
				
				b = b / 100;
				System.out.println(b-50+" nota(s) de R$ 50,00");
				
				b = b / 50;
				System.out.println(b-20+" nota(s) de R$ 20,00");

				b = b / 20;

				System.out.println(b-10+" nota(s) de R$ 10,00");

				b = b / 10;

				System.out.println(b-5+" nota(s) de R$ 5,00");

				b = b / 5;

				System.out.println(b-2+" nota(s) de R$ 2,00");

				b = b / 2;
				System.out.println(b-1+" nota(s) de R$ 1,00");
			}
		} 
	else{
		System.out.println("Erro");
		}
		
	}

}
