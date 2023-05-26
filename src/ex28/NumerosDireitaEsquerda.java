package src.ex28;

import java.util.Arrays;

public class NumerosDireitaEsquerda {

	public static void main(String[] args) {
		int[] numeros = {1 , -5, 2, -3, -8, 6,-7, 4};
		System.out.println("Array com todos os números:" + Arrays.toString(numeros));
		
		   int[] result = movendoNumeros(numeros);
		   System.out.println("Array modificado: " + Arrays.toString(result));
		
	}
	
	public static int[] movendoNumeros(int[] numeros) {
		 int[] resultado = new int[numeros.length];
	        int esquerda = 0;
	        int direita = numeros.length - 1;

	        for (int i = 0; i < numeros.length; i++) {
	            if (numeros[i] < 0) {
	                resultado[esquerda] = numeros[i];
	                esquerda++;
	            } else {
	                resultado[direita] = numeros[i];
	                direita--;
	            }
	        }

	        return resultado;
	    }
	}


