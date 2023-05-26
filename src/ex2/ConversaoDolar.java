package src.ex2;
import java.util.Scanner;

public class ConversaoDolar {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Quanto está a cotação do dólar hoje?");
	double cotacao = scanner.nextDouble();
	System.out.println("COTACAO DO DOLAR:"+ cotacao); 
	
	System.out.println("Digite o valor em dólar que deseja converter:"
			+ "");
	double valorDolar = scanner.nextDouble();
	System.out.println("Valor em dólar:"+ valorDolar);
	
	double conversao = valorDolar/cotacao;
	
	System.out.println("CONVERSÃO DE DOLAR PARA REAL DESSES VALORES:"+ conversao);
	

	}
		
		
		
	

}