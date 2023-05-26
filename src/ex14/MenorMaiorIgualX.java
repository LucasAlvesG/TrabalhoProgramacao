package src.ex14;

import javax.swing.*;

public class MenorMaiorIgualX {

    int[] numeros = new int[10];
    int x = 0, qtde_maior = 0, qtde_menor = 0, qtde_igual = 0;

    public void verificarNumero(){

        x = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro!"));

        for(int i =0; i < 10; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " +(1+i)+ "º número do vetor!"));
            if(x==numeros[i]){
                qtde_igual += 1;
            } else if (x<numeros[i]) {
                qtde_maior += 1;
            } else if (x>numeros[i]) {
                qtde_menor += 1;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade maior: " + qtde_maior
                + "\nQuantidade menor: " + qtde_menor + "\nQuantidade igual: " + qtde_igual);
    }

}
