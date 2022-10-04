 /*
  * Receba dados do usuário	enquanto a idade for maior que 0
  */

//do while
package geek;

import java.util.Scanner;

public class Programa08 {
public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		
	//Primeiro executa o bloco, depois faz a checagem
	do {
		System.out.println("Informe o seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Informe sua idade: ");
		//idade = teclado.nextInt(); //Bug
		idade = Integer.parseInt(teclado.nextLine());
		
		if (idade > 0) {
		System.out.println(nome + " tem " + idade + " anos ");
		}
	}while(idade > 0);
		
		teclado.close();
	}

}

