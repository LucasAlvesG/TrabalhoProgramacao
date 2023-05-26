package src.ex24;
import java.util.Scanner;
public class Matrizbooleana {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite tamanho da matriz: ");
		int tamMatriz = scanner.nextInt();		
		
		boolean[][] matriz = new boolean[tamMatriz][tamMatriz];
		
		System.out.println("DIGITE UM VALOR BOOLEANO PARA COMPOR A MATRIZ:");
		for(int i =0; i	<tamMatriz; i++) {
			for(int j =0; j	<tamMatriz; j++) {
				matriz[i][j] = scanner.nextBoolean();
			}
		}
		System.out.println("---MATRIZ BOOLEANA---");
		for(int i =0; i	<tamMatriz; i++) {
			for(int j =0; j	<tamMatriz; j++) {
				boolean operacaoAND = matriz[j][i] && matriz[i][j];
				System.out.print(operacaoAND + " ");
			}
			System.out.println();
		}
		
		
	}

}
