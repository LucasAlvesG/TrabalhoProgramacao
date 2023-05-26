package src.ex30;

import javax.swing.*;

public class Pessoa {

    private String nome;
    private int idade;

    private Pessoa mae = null;
    private Pessoa pai = null;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentarArvore(){

        String resposta = "";
        if((this.mae != null) && (this.pai != null)){
            resposta += this.nome + " possui " + this.idade + " anos" + "\nÉ filho(a) de " + mae.getNome() + " e de " + pai.getNome();
        } else if (this.mae != null) {
            resposta += this.nome + " possui " + this.idade + " anos" + "\nÉ filho(a) de " + mae.getNome();
        } else if (this.pai != null) {
            resposta += this.nome + " possui " + this.idade + " anos" + "\nÉ filho(a) de " + pai.getNome();
        } else {
            resposta += this.nome + " possui " + this.idade + " anos";
        }
        JOptionPane.showMessageDialog(null, resposta);
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
