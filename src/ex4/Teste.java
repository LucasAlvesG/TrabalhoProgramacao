package src.ex4;

import javax.swing.*;

public class Teste {

    public static void main(String[] args) {
        Troca t = new Troca();
        t.trocarValores(Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A!")),
                Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B!")));
    }
}
