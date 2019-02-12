/* 
 * Nome do autor: Ilton Batista da Silva Júnior 
 * Data de criação do arquivo: 15/01/2019 
 * Objetivo sucinto do programa: mostrar o número e o salário do funcionário
 * Referência ao enunciado/origem do exercício: https://www.urionlinejudge.com.br/judge/pt/problems/view/1008 
 */

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		int horasTrabalhadas = scanner.nextInt();
		float valorPorHora = scanner.nextFloat();
		scanner.close();
		
		int id1 = id;
		
		float total = valorPorHora*horasTrabalhadas;
		
		
		

        
        System.out.println("5,000".replace(",","."));
        
        
        float salario = valorPorHora*horasTrabalhadas;

        
        
	    System.out.printf("NUMBER = %d\n",id1);
	    System.out.printf("SALARY = U$ %.2f\n", salario);
		
	}

}
