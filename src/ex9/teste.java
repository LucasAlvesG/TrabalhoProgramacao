package src.ex9;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = "";

        while (!entrada.equalsIgnoreCase("S")) {
            System.out.println("Digite o código:");
            int C = scanner.nextInt();

            System.out.println("Digite o número de horas trabalhadas");
            int N = scanner.nextInt();

            SalarioFuncionario s1 = new SalarioFuncionario();
            System.out.println(s1.SalarioF(N));

            scanner.nextLine();

            System.out.print("Deseja encerrar o programa?:");
            entrada = scanner.nextLine();
        }

        System.out.println("Programa encerrado!");
    }
}
