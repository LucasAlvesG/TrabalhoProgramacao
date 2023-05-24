package src.ex10;

import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        ParOuImpar n = new ParOuImpar();

        do{
            n.verificaNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe um número!")));
        }while(n.parar.equals("N"));

    }
}
