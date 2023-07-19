package Santander_ADA.Aula01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        System.out.print("\n=====================================================\n");
        System.out.printf("%nTemperatura em Fahrenheit: %.2fºF", fahrenheit);
        System.out.printf("%nTemperatura de Fahrenheit para Celsius: %.2fºC%n", fahrenheitToCelsius(fahrenheit));
        System.out.print("\n=====================================================");
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = ((fahrenheit - 32)/9);
        return celsius;

    }
}
