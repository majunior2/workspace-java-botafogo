package model;

public class AppLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 20; i++) {
			System.out.println(i + "Meus alunos são desanimados!");
		}

		//while
		boolean acao = false;
				
		while(acao == true) {
			System.out.println("outro loop");
			acao = false;
		}
				
				// do..while
		do {
			System.out.println("este é loop do...");
		} while(acao == true);
		
		/*
		 * números pares até 100
		 */
		
		int limite = 100;
		for(int i = 0; i <= limite; i+=2) {
			if(i < limite) {
				System.out.print( i + ", ");
				
			} else {
				System.out.print(i);
			}
	 }
}
	}

