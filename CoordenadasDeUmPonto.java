/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 23/01/2019 
 * Objetivo sucinto do programa: Ler 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano
 * Referência ao enunciado/origem do exercício:https://www.urionlinejudge.com.br/judge/pt/problems/view/1041
 */

package grupo1;

import java.util.Scanner;

public class CoordenadasDeUmPonto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		float x =  Float.parseFloat(leitor.next());
		float y =  Float.parseFloat(leitor.next());
		
		leitor.close();
		
		if(x == 0  && y == 0) {
			System.out.println("Origem");
		} else if(x > 0 && y > 0) {
			System.out.println("Q1");
		} else if(x < 0 && y < 0) {
			System.out.println("Q3");
		} else if(x > 0 && y < 0) {
			System.out.println("Q4");
		} else if(x < 0 && y > 0 ) {
			System.out.println("Q2");
		} else if(x == 0) {
			System.out.println("Eixo Y");
		} else if( y == 0) {
			System.out.println("Eixo X");
		}
		
	}

}
