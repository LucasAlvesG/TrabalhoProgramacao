package src.ex4;

import javax.swing.*;

public class Troca {

    public void trocarValores(int a, int b){
        int ajuda = 0;
        ajuda = a;
        a = b;
        b = ajuda;
        JOptionPane.showMessageDialog(null, "A: " + a + "\nB: " + b);
    }
}
