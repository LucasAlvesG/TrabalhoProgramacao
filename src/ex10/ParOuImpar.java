package src.ex10;

import javax.swing.*;

public class ParOuImpar {
    String parar = "";
    public String verificaNumero(int x) {
        String resposta = ("Número: " + x + "\n");

        if (x % 2 == 0) {
            resposta += "PAR\n";
        } else {
            resposta += "ÍMPAR\n";
        }
        if (x > 0) {
            resposta += "POSITIVO\n";
        } else if (x < 0) {
            resposta += "NEGATIVO\n";
        } else {
            resposta += "NEUTRO\n";
        }
        parar = JOptionPane.showInputDialog(resposta + "\nDeseja encerrar o programa? (S/N)");
        return parar;
    }

}
