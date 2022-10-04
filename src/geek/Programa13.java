// Tipos de dados alfanuméricos
// Caracteres e strings
package geek;

public class Programa13 {
	
	public static void main(String[] args) {
		//Tipos primitivos
		char letra1 = 'a';
		char letra2 = 97;  //97 em decimal == 'a'
		letra2 = (char) (letra2 + 1); //cast
		
		System.out.println("letra1 " + letra1);
		System.out.println("letra2 " + letra2);
		
		//Tipos	não primitivos
		Character letra3 = 'A';
		String nome = "LeneDieCorporation";
		
		System.out.println("Letra3 " + letra3);
		
		System.out.println("char/Character " + Character.SIZE + " bits");
		
		System.out.println("Valor Min  char/Character " + Character.MIN_VALUE);
		System.out.println("Valor Max  char/Character " + Character.MIN_VALUE);
		
		System.out.println("Nome " + nome);
		
		System.out.println("Tamanho da String " + nome.length());
		
		System.out.println("String " + (Character.SIZE * nome.length()) + " bits");
	}

}
