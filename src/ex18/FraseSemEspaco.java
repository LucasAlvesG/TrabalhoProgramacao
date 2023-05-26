package src.ex18;

import javax.swing.*;

public class FraseSemEspaco {
    String frase = "";

    public void verificarFrase(){
        frase = JOptionPane.showInputDialog("Infome uma frase de até 50 caracteres!");
        String f_sem = frase.replaceAll(" ","");

        int qtde = (frase.length() - f_sem.length());

        JOptionPane.showMessageDialog(null, "Frase informada: " +frase + "\nFrase sem espaços: " + f_sem
                + "\nQuantidade de espaços: " + qtde);
    }
}
