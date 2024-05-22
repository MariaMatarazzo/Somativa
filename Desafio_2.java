package Formativa_aula17;

import java.util.Scanner;

public class Desafio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double lado,area;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor do lado do quadrado: ");
		lado = ler.nextDouble();
		
		area=lado*lado;
		
		System.out.print(" A area do quadrado é de: " + area);

	}

}
