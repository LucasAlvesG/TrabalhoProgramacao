package src.ex9;

public class SalarioFuncionario {
    public SalarioFuncionario() {
    }

    public String SalarioF(int N) {
        if (N <= 50) {
            return ("O Salario é: "+(N * 10));
        } else {
            return ("O Salario é: "+(500 + ((N - 50) * 20) + "\n Sendo o Salario excedente: "+ ((N - 50) * 20)));
        }
    }
}
