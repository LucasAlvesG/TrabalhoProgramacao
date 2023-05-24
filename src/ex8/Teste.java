package src.ex8;

import javax.swing.*;

public class Teste {

    public static void main(String[] args) {

        Tabuada t = new Tabuada();
        t.imprimirTabuada(Float.parseFloat(JOptionPane.showInputDialog("Deseja saber a tabuada de qual número?")));

    }
}
