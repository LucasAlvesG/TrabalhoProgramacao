package src.ex23;

import java.util.Scanner;

public class MatrizTroca {

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
		System.out.println("MATRIZ ORIGINAL ");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(MATRIZ[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("MATRIZ TRANSPOSTA ");
		int[][] matrizT = new int[tamMatriz][tamMatriz];
		for (int i = 0; i < tamMatriz; i++) {
			for (int j = 0; j < tamMatriz; j++) {
				matrizT[j][i] = MATRIZ[i][j];
			}
		}
		for (int i = 0; i < tamMatriz; i++) {
		    for (int j = 0; j < tamMatriz; j++) {
		        System.out.print(matrizT[i][j] + " ");
		    }
		    System.out.println();
		}

	}

}
