package src.ex7;

import java.util.Scanner;
public class CalculadoraFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem processados: ");
        int quantidadeNumeros = scanner.nextInt();

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o número #" + i + ": ");
            int numero = scanner.nextInt();

            int fatorial = calcularFatorial(numero);

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }

    public static int calcularFatorial(int numero) {
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
