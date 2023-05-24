package src.ex17;
import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSorteado = random.nextInt(101);
        int tentativas = 0;
        boolean acertou = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tente adivinhar o número de 0 a 100.");

        while (!acertou) {
            System.out.print("Digite um numero: ");
            int tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa == numeroSorteado) {
                acertou = true;
            } else if (tentativa < numeroSorteado) {
                System.out.println("O número sorteado é maior.");
            } else {
                System.out.println("O número sorteado é menor.");
            }
        }

        System.out.println("Parabéns! Você acertou o número sorteado em " + tentativas + " tentativa(s).");
    }
}

