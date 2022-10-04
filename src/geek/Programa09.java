package geek;

import java.util.Scanner;
	
public class Programa09 {
	public static void main(String[] args) {
		int idade = 1;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		//Variável de controle; Condição de parada; Forma de incremento
		// i++ -> i + 1
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); //Bug
			idade = Integer.parseInt(teclado.nextLine());
			
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos ");
			}
		}
		
		teclado.close();
	}

}
