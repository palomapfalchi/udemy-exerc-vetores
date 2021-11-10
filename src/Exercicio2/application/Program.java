package Exercicio2.application;

import Exercicio2.entities.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos: ");
        int n = scanner.nextInt();
        Product[] vect = new Product[n];

        for(int i=0; i<vect.length; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;

        for(int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.println("Average price = R$ " + avg);
    }

}
