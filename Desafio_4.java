package Formativa_aula17;

public class Desafio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bingo[] = new int [20];
		for(int i=0; i<20;i++) {
			
		bingo[i] = (int)Math.round(Math.random()*100);
		}
		
		for(int i=0; i<20;i++) {
		System.out.println(" Os números são " + bingo[i]);

		}

	}
}





