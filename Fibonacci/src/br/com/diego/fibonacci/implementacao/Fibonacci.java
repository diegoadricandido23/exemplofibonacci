/**
 * 
 */
package br.com.diego.fibonacci.implementacao;

import java.util.ArrayList;
import java.util.List;

/**
 * @author diegoadricandido23@gmail.com
 *
 */
public class Fibonacci {
	
	public static List<Integer> fibonacci() {
		List<Integer> fibonacci = new ArrayList<>();
		fibonacci.add(0);
		fibonacci.add(1);
		int valor = 0;
		
		while(valor < 350) {
			valor = fibonacci.get(fibonacci.size() -2) + fibonacci.get(fibonacci.size() -1);
			fibonacci.add(valor);
		}
		
		return fibonacci;
	}
	
	public static Boolean isFibonacci(Integer valor) {
		List<Integer> lista = fibonacci();
		for(Integer v : lista) {
			if (v == valor)
				return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
