package Formativa_aula17;

import java.util.Scanner;

public class Desafio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor1,valor2,soma,sub,mult;
		String op;
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o valor 1: ");
		valor1 = ler.nextDouble();

		System.out.print("Informe o valor 2: ");
		valor2 = ler.nextDouble();

		System.out.print("Informe a operaçao desejada + ou - ou *:  ");
		op = ler.next();

		if (op.equals("+")) {
			soma= valor1+valor2;
			System.out.println("O valor é:" + soma);

		}
		else if (op.equals("-")) {
			sub= valor1- valor2;
			System.out.println("O valor é: "+ sub);
		}		
		else{
			mult= valor1*valor2;
			System.out.println (" O valor é "+ mult);

		}
		ler.close();




	}

}
