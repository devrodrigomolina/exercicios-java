package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculateArea;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CalculateArea calculate = new CalculateArea();
        
        System.out.print("Digite a Largura do retangulo: ");
        calculate.width = sc.nextDouble();

        System.out.print("Digite a Altura do retangulo: ");
        calculate.height = sc.nextDouble();

        calculate.Area();
        calculate.Perimeter();
        calculate.Diagonal();

        System.out.println("A area do retangulo e: " + calculate);
        sc.close();

    }
}
