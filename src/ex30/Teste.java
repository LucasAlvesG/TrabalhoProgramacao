package src.ex30;

public class Teste {

    public static void main(String[] args) {
        Pessoa filha = new Pessoa("Ana", 20);

        Pessoa mae = new Pessoa("Maria", 45);
        Pessoa pai = new Pessoa("João", 50);

        Pessoa avo1_m = new Pessoa("Sebastiana", 75);
        Pessoa avo2_m = new Pessoa("Sebastião", 80);

        Pessoa avo1_p = new Pessoa("Francisca", 70);
        Pessoa avo2_p = new Pessoa("Joaquim", 72);

        filha.setMae(mae);
        filha.setPai(pai);

        mae.setMae(avo1_m);
        mae.setPai(avo2_m);
        pai.setMae(avo1_p);
        pai.setPai(avo2_p);

        filha.apresentarArvore();
        mae.apresentarArvore();
        pai.apresentarArvore();
    }
}
