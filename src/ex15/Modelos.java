package src.ex15;
import java.util.ArrayList;


import java.util.Scanner;

public class Modelos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nomes = new String[10];
		int[] idade = new int[10];
		
		for(int i = 0; i<10 ; i++) {
			System.out.println("Digite o nome de canditada:");
			nomes[i]= scanner.next();
			
			System.out.println("Digite idade da canditada:");
			idade[i]= scanner.nextInt();
		}
		
		ArrayList<String> CandidatasAptas = new ArrayList<>();
		
	for(int i=0; i<nomes.length; i++) {
		if(idade[i]>=18 && idade[i]<=20) {
		CandidatasAptas.add(nomes[i]);
			
		}
	}
	System.out.println("CANDITAS APTAS:");
	for(String nome :CandidatasAptas) {
		System.out.println(nome);
		
	}
		
		
	
	}
			
		
	}


