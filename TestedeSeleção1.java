/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 22/01/2019 
 * Objetivo sucinto do programa:Ler 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a vari�vel A for par escrever a mensagem "Valores aceitos", sen�o escrever "Valores nao aceitos".
 * Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1035 
 */

import java.util.Scanner;

public class TestedeSele��o1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = leitor.nextInt();
		int d = leitor.nextInt();
		
		if(b > c && d > a && ((c + d) > (a + b)) && (c >= 0 && d >= 0) && a % 2 == 0) {
			System.out.println("Valores aceitos");
		}
		else {
			System.out.println("Valores nao aceitos");
		}
		
		
	}

}
