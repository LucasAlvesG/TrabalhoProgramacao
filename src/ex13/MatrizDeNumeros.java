package src.ex13;

import java.util.Scanner;

public class MatrizDeNumeros {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a quantidade de números da matriz");
		int qtdNumeros = scanner.nextInt();

		int tamMatriz = (int) Math.ceil(Math.sqrt(qtdNumeros));

		int linhas = tamMatriz;
		int colunas = tamMatriz;
		int[][] MATRIZ = new int[linhas][colunas];

		int[] numeros = new int[qtdNumeros];

		for (int i = 0; i < qtdNumeros; i++) {
			System.out.println("Digite um numero para compor a matriz:");
			numeros[i] = scanner.nextInt();
		}
		
		int cont = 0;
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (cont < numeros.length) {
					MATRIZ[i][j] = numeros[cont];
					cont++;
				}
			}
		}
		for (int i = 0; i < linhas; i++){
			for (int j = 0; j < colunas; j++) {
				System.out.print(MATRIZ[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}

}



