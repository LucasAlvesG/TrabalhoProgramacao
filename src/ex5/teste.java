package src.ex5;

public class teste {
    public static void main(String[] args) {
        NumeroFornecido n1 = new NumeroFornecido(5);
        NumeroFornecido n2 = new NumeroFornecido(0);
        NumeroFornecido n3 = new NumeroFornecido(-20);
        System.out.println(n1.ModuloDoNumero() + "\n" + n2.ModuloDoNumero() + "\n"+ n3.ModuloDoNumero() );
    }
}

