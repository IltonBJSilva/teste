import java.util.Scanner;

/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 16/01/2019 
 * Objetivo sucinto do programa: mostrar a diferen�a do produto de A e B pelo produto de C e D
 * Refer�ncia ao enunciado/origem do exerc�cio:https://www.urionlinejudge.com.br/judge/pt/problems/view/1007
 */

public class Diferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = leitor.nextInt();
		int d = leitor.nextInt();
		int diferenca;
		
		leitor.close();
		
		diferenca = a*b - c*d;
		
		System.out.println("DIFERENCA = "+diferenca);
		
	}

}
