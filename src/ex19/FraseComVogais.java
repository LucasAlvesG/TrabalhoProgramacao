package src.ex19;

import javax.swing.*;

public class FraseComVogais {

    String vogais_frase = "";

    public void verificarVogais(){
        String frase = JOptionPane.showInputDialog("Informe uma frase!");
        for(int i =0; i<frase.length();i++){
            String auxiliar = String.valueOf(frase.charAt(i));
            char letra = Character.toLowerCase(frase.charAt(i));
            if(eVogal(letra)){
                vogais_frase += auxiliar;
            }
        }
        JOptionPane.showMessageDialog(null, "Frase informada: " + frase + "\nApenas vogais da frase: " + vogais_frase);
    }

    public boolean eVogal(char letra){
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}
