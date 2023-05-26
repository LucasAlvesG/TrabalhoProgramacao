package src.ex16;

import java.util.Random;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor");
		int tam = scanner.nextInt();

		if (tam > 50) {
			System.out.println("Tamanho máximo permitido é 50");
			scanner.close();
		}

		int[] V1 = new int[tam];
		int[] V2 = new int[tam];

		Random random = new Random();
		
		System.out.println("---DIGITANDO VALORES DO VETOR 1---");
		for (int i = 0; i < V1.length; i++) {
			System.out.println("DIGITE O NUMERO:");
			V1[i] = scanner.nextInt();
		}
			
			
		System.out.println("---DIGITANDO VALORES DO VETOR 2---");
		for (int i = 0; i < V2.length; i++) {
			System.out.println("DIGITE O NUMERO:");
			V2[i] = scanner.nextInt();

		}
		
		int cont=0;
		for(int i =0; i<tam; i++) {
			if(V1[i]== V2[i]) {
				cont++;
			}
		}
		System.out.println("VALORES IDÊNTICOS NOS VETORES CORRESPONDENTES:"+cont);
		scanner.close();
	}

}
