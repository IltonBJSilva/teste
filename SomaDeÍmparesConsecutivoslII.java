/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 24/01/2019 
 * Objetivo sucinto do programa:Ler um valor inteiro N que � a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Voc� deve apresentar a soma de Y �mpares consecutivos a partir de X inclusive o pr�prio X se ele for �mpar 
 * Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1158 
 */

package grupo1;
import java.util.Scanner;

public class SomaDe�mparesConsecutivoslII {

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
