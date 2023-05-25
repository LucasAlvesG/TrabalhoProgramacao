package src.ex22;

import java.util.Scanner;

public class calcularHipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor em Metros de um dos lados: ");
        double Lado1 = scanner.nextInt();

        System.out.println("digite o valor em Metros do segundo lado: ");
        double Lado2 = scanner.nextInt();

        System.out.println("A hipotenusa é: " + CalculadoraHipo(Lado1,Lado2));

        }
        static double CalculadoraHipo(double Lado1 , double Lado2) {
        double hipotenusa = Math.sqrt(Math.pow(Lado1, 2)+Math.pow(Lado2 , 2));
        return hipotenusa;
    }

}


