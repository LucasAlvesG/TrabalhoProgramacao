package src.ex20;

import java.util.Scanner;

public class MediaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos Numeros serão adicionados ao vetor ?");
        int TamanhoVetor = scanner.nextInt();
        int[] vetor = new int[TamanhoVetor];
        float media = 0;
        int maior = 0;

        for (int i=0;i<TamanhoVetor;i++){
            System.out.println("Digite o número:");
            int NumeroFornecido = scanner.nextInt();
            vetor[i] = NumeroFornecido;
        }
        System.out.println("O seu vetor é: ");
        for (int x=0;x<TamanhoVetor;x++) {
            media = vetor[x] + media;
            System.out.println(vetor[x]);
            if (vetor[x]>maior){
                maior = vetor[x];
            }
        }
        System.out.println("A média do vetor é: "+(media/TamanhoVetor));
        System.out.println("O maior valor do array é: "+ maior);
    }
}
