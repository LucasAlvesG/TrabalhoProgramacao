package src.ex3;

import javax.swing.*;

public class Teste {

    public static void main(String[] args) {

        int n1, n2, n3;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º número!"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º número!"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 3º número!"));

        Relacao r = new Relacao();

        r.relacionamento(n1, n2, n3);


    }
}
