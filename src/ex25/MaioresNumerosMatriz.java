package src.ex25;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaioresNumerosMatriz {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos dos maiores elementos deseja conhecer?");
        int quantidade = scanner.nextInt();
        int[][] matriz = new int[10][10];

        for(int i = 0; i < 10; i++){
            for(int k = 0; k < 10; k++){
                matriz[i][k] = generator.nextInt(50);
            }
        }

        int[] maioresElementos = encontrarMaioresElementos(matriz, quantidade);
        System.out.println("Os " + quantidade + " maiores elementos são: " + Arrays.toString(maioresElementos));
    }

    public static int[] encontrarMaioresElementos(int[][] matriz, int quantidade) {
        int elementos[] = new int[matriz.length * matriz[0].length];
        int indice = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int k = 0; k < matriz[i].length; k++){
                elementos[indice] = matriz[i][k];
                indice++;
            }
        }

        Arrays.sort(elementos);

        int maiores[] = new int[quantidade];
        int indiceMaiores = elementos.length - 1;

        for(int i = 0; i < quantidade; i++){
            maiores[i] = elementos[indiceMaiores];
            indiceMaiores--;
        }

        return maiores;
    }
}

