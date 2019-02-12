/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 24/01/2019 
 * Objetivo sucinto do programa:Ler um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de Y ímpares consecutivos a partir de X inclusive o próprio X se ele for ímpar 
 * Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1158 
 */

package grupo1;
import java.util.Scanner;

public class SomaDeÍmparesConsecutivoslII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int quantidade = leitor.nextInt();
		int x;
		int y;
		int saida = 0;
		
		for(int i = 0; i < quantidade; i++) {
			saida = 0; 
				x = leitor.nextInt();
				y = leitor.nextInt();
				if(x % 2 == 0) {
					x += 1;
				}
				for(int j = 0; j < y; j++) {
					saida += x +2*j;
				}
				System.out.println(saida);

		}

	}

}
