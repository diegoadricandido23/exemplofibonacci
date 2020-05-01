/**
 * 
 */
package br.com.diego.fibonacci;

import br.com.diego.fibonacci.implementacao.Fibonacci;

/**
 * @author dcandido
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.printf("[");
		Fibonacci.fibonacci().forEach(i -> System.out.printf(" %d,", i));
		System.out.printf("]");
		
		Integer numero = 377;
		System.out.printf("\n\nO número %d %s Fibonnaci", 
				numero, Boolean.TRUE.equals(Fibonacci.isFibonacci(numero))
						? "é" : "não é");
	}

}
