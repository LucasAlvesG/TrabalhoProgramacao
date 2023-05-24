package src.ex8;

import javax.swing.*;

public class Tabuada {

    public void imprimirTabuada(float n){
        String resposta = "";

        for(int i = 1; i < 11; i++){
            resposta += (n + " x " + i + " = " + (n*i) + "\n");
        }
        JOptionPane.showMessageDialog(null, resposta);
    }
}
