// Tipos  boleanos
package geek;

public class Programa14 {
	public static void main(String[] args) {
		//Tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
		//Tipos n�o primitivos
		Boolean v = true;
		Boolean f = false;
		
		boolean ativo = false;
		
		System.out.println("Verdadeiro " + verdadeiro);
		System.out.println("Falso " + falso);
		System.out.println("V " + v);
		System.out.println("F " + f);
		
		if(verdadeiro) {
			System.out.println("� Verdadeiro");
		}else {
			System.out.println("� Falso");
		}
			
		if(1 == 2) {
			System.out.println("1 == 1 � verdadeiro");
		}else {
			System.out.println("... � falso");
			
		if(ativo) {
			System.out.println("Pode acessar o sistema.");
		}else {
			System.out.println("Acesso negado.");
		}
		}
	}

}
