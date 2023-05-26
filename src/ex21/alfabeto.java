package src.ex21;
import java.util.Scanner;
public class alfabeto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite dois caracteres de A a Z (em ordem alfabética):");
		char char1 = scanner.next().charAt(0);
		char char2 = scanner.next().charAt(0);
		
		if(char1 <=char2) {
			int caracteres = char2 - char1 - 1;
			System.out.println("Número de caracteres entre eles é:" + caracteres);
		}else {
			System.out.println("Letras não estão em ordem alfabética.");}
		
	}

}
