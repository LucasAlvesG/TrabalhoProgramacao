package src.ex27;

public class CalcularBinario {
    public static void main(String[] args) {
        int decimal = 110;
        String binario = decimalParaBinario(decimal);
        System.out.println("O valor binário de " + decimal + " é: " + binario);
    }

    public static String decimalParaBinario(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();

        while (decimal > 0) {
            int resto = decimal % 2;
            binario.insert(0, resto);
            decimal = decimal / 2;
        }

        return binario.toString();
    }
}






