package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Peoples;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int numPeoples = sc.nextInt();

        Peoples[] peoples = new Peoples[numPeoples];

        for(int n = 0; n < peoples.length; n++) {
            System.out.println(String.format("Dados da %da pessoa: ", n + 1));
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: "); 
            int age = sc.nextInt();
            System.out.print("Altura: "); 
            double height = sc.nextDouble();

            peoples[n] = new Peoples(name, age, height);
        }

        double sumHeights = 0;
        int numMinors = 0;

        for(int i = 0; i < peoples.length; i++) {
            sumHeights += peoples[i].getHeight();
            if(peoples[i].getAge() < 16) {
                numMinors++;
            }
        }
        double averangeTotal = sumHeights / peoples.length;
        double percentageMinors = (double) numMinors / numPeoples * 100;
        System.out.printf("Altura media: %.2f%n", averangeTotal);
        System.out.printf("Pessoas com menos de 16 anos: %.0f%%%n", percentageMinors);
        
        System.out.println("Nome das pessoas com menos de 16 anos: ");
        for(int i = 0; i < peoples.length; i++) {
            if(peoples[i].getAge() < 16) {
                System.out.println(peoples[i].getName());
            }
        }
        sc.close();
    }
}
