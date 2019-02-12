/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 18/01/2019 
 * Objetivo sucinto do programa: Ler a distância (em Km) e calcular quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
 * Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1016
 */


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in); 
		int tempoCarroY = leitor.nextInt();
		leitor.close();
		
		int total;
		total = tempoCarroY * 2;
		
		System.out.println(total+" minutos");
		
		

	}

}
