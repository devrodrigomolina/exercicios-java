package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Product product = new Product();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);
        

        // ATUALIZA A QUANTIDADE DE PRODUTOS EM ESTOQUE
        System.out.println("Enter number of products to be ADDED in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated data: " + product);

        // REMOVER PRODUTOS EM ESTOQUE

        System.out.println("Enter number of products to be REMOVE in stock: ");
        quantity = sc.nextInt(); // REAPROVEITANDO A VARIAVEL
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
