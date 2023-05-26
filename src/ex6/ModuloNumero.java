package src.ex6;
import java.util.Scanner;


public class ModuloNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = scanner.nextInt();
		
		if(numero>0) {
			System.out.println("Módulo do número é:"+numero);			
		}else{
			System.out.println("Módulo do número é:"+(numero*(-1)));
		}
		

	}

}
