/* 
 * Nome do autor: Ilton Batista da Silva J�nior 
 * Data de cria��o do arquivo: 15/01/2019 
 * Objetivo sucinto do programa: mostrar o n�mero e o sal�rio do funcion�rio
 * Refer�ncia ao enunciado/origem do exerc�cio: https://www.urionlinejudge.com.br/judge/pt/problems/view/1008 
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
