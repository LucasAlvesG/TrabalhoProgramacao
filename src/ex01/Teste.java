package src.ex01;

import javax.swing.*;

public class Teste {

    public static void main(String[] args) {

        Estoque e = new Estoque();
        int q_maxima, q_minima;
        q_minima = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade mínima?"));
        q_maxima = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade máxima?"));

        if(q_maxima < q_minima){
            JOptionPane.showMessageDialog(null, "A quantidade máxima é menor do que a quantidade mínima!");
            q_maxima = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade máxima?"));
        }
        JOptionPane.showMessageDialog(null, "O estoque médio é " + e.estoqueMedio(q_minima, q_maxima));
    }
}
