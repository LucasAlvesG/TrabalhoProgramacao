package src.ex03;

import javax.swing.*;
import java.net.StandardSocketOptions;

public class Relacao {
    public void relacionamento(int n1, int n2, int n3){
        String resposta = "";

        resposta += ("1º número: " + n1 + "\n2º número: " + n2 + "\n3º número: " + n3) + "\n\n";

        if(n1==n2 && n2==n3){
            resposta += "Os três números são iguais! \n";
        } else if(n1==n2 && n2!=n3){
            resposta += "Apenas o 1º e o 2º número são iguais! \n";
        } else if(n2==n3 && n1!=n3){
            resposta += "Apenas o 2º e o 3º número são iguais! \n";
        } else if(n1==n3 && n3!=n2){
            resposta += "Apenas o 1º e o 3º número são iguais! \n";
        } else {
            resposta += "Os três números não são iguais! \n";
        }

        if(n1>n2 && n1>n3){
            resposta += "O 1º número é o maior! \n";
        } else if(n2>n1 && n2>n3){
            resposta += "O 2º número é o maior! \n";
        } else if(n3>n1 && n3>n2){
            resposta += "O 3º número é o maior! \n";
        }

        if(n1<n2 && n1<n3){
            resposta += "O 1º número é o menor! \n";
        } else if(n2<n1 && n2<n3){
            resposta += "O 2º número é o menor! \n";
        } else if(n3<n1 && n3<n2){
            resposta += "O 3º número é o menor! \n";
        }

        resposta += "\n";

        if(n1>=n2 && n1>=n3) {
            resposta += "O 1º número é maior ou igual ao 2º e ao 3º! \n";
        } else if(n1>=n2){
            resposta += "O 1º número é maior ou igual ao 2º! \n";
        } else if(n1>=n3){
            resposta += "O 1º número é maior ou igual ao 3º! \n";
        }
        if(n2>=n1 && n2>=n3) {
            resposta += "O 2º número é maior ou igual ao 1º e ao 3º! \n";
        } else if(n2>=n1){
            resposta += "O 2º número é maior ou igual ao 1º! \n";
        }  else if(n2>=n3){
            resposta += "O 2º número é maior ou igual ao 3º! \n";
        }
        if(n3>=n1 && n3>=n2){
            resposta += "O 3º número é maior ou igual ao 1º e ao 2º! \n";
        } else if(n3>=n1){
            resposta += "O 3º número é maior ou igual ao 1º! \n";
        }  else if(n3>=n2){
            resposta += "O 3º número é maior ou igual ao 2º! \n";
        }

        resposta += "\n";

        if(n1<=n2 && n1<=n3) {
            resposta += "O 1º número é menor ou igual ao 2º e ao 3º! \n";
        } else if(n1<=n2){
            resposta += "O 1º número é menor ou igual ao 2º! \n";
        } else if(n1>=n3){
            resposta += "O 1º número é menor ou igual ao 3º! \n";
        }
        if(n2<=n1 && n2<=n3) {
            resposta += "O 2º número é menor ou igual ao 1º e ao 3º! \n";
        } else if(n2<=n1){
            resposta += "O 2º número é menor ou igual ao 1º! \n";
        }  else if(n2<=n3){
            resposta += "O 2º número é menor ou igual ao 3º! \n";
        }
        if(n3<=n1 && n3<=n2){
            resposta += "O 3º número é menor ou igual ao 1º e ao 2º! \n";
        } else if(n3<=n1){
            resposta += "O 3º número é menor ou igual ao 1º! \n";
        }  else if(n3<=n2){
            resposta += "O 3º número é menor ou igual ao 2º! \n";
        }

        JOptionPane.showMessageDialog(null, resposta);
    }

}
