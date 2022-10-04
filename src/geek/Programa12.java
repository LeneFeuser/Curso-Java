// Tipos de dados
// Num�ricos (Inteiros e Reais)
package geek;

public class Programa12 {
	
	public static void main(String[] args) {
	
		// Tipos prim�rios/primitivos
		// Por padr�o, os numeros reais em Java s�o considerados double
		float preco1 = 23.4f; //23.40
		double preco2 = 23.4; //23.434534534345345345345355453
		
		// Tipos n�o prim�rios/primitivos
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		System.out.println("float -> preco1 " + preco1);
		System.out.println("double -> preco2 " + preco2);
		System.out.println("Float -> preco3 " + preco3);
		System.out.println("Double -> preco4 " + preco4);
		
		System.out.println("float/Float " + Float.SIZE + " bits");
		System.out.println("double/Double " + Double.SIZE + " bits");
		
		System.out.println("Valor Min  float/Float " + Float.MIN_VALUE);
		System.out.println("Valor Max  float/Float " + Float.MAX_VALUE);
		
		System.out.println("Valor Min  double/Double " + Double.MIN_VALUE);
		System.out.println("Valor Max  double/Double " + Double.MAX_VALUE);
		
	}

}
