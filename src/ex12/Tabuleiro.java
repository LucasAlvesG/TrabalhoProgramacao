package src.ex12;


import java.math.BigInteger;

public class Tabuleiro {
    public static BigInteger CalculadorDeGraos() {
        BigInteger resultado = BigInteger.ONE;
        BigInteger dois = BigInteger.valueOf(2);

        for (int i = 1; i < 64; i++) {
            resultado = resultado.multiply(dois);
        }

        return resultado;
    }
}
