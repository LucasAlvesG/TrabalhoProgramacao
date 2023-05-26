package src.ex11;

import javax.swing.*;
import java.util.Arrays;

public class MaiorMenor {
    float[] numeros;
    int indice = 0;
    float x = 0, maior = 0, menor = 0;

    public void verificarNumero(){

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual o tamanho do vetor?"));
        numeros = new float[tamanho];

        x = Float.parseFloat(JOptionPane.showInputDialog("Informe um número! (0 para encerrar)"));
        numeros[indice] = x;
        indice++;

        if(x!=0){
            maior = x;
            menor = x;
            while(x!=0){
                x = Float.parseFloat(JOptionPane.showInputDialog("Informe outro número! (0 para encerrar)"));
                numeros[indice] = x;
                indice++;
                if(x > maior){
                    maior = x;
                } else if (x < menor){
                    menor = x;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nMenor: " + menor);
    }

}
