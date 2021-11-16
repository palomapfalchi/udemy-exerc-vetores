package Exercicio3.application;

import Exercicio3.entities.Students;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Students[] room = new Students[10];

        System.out.println("Temos 10 quartos disponíveis. Quantos quartos serão alugados?");
        int n = scanner.nextInt();


        for(int i=1; i<=n; i++) {
            scanner.nextLine();
            System.out.println("Quarto #" + i + ":");
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Email: ");
            String email = scanner.nextLine();
            System.out.println("Número do quarto desejado? ");
            int number = scanner.nextInt();
            room[number] = new Students(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=1; i<=10; i++) {
            if (room[i] != null) {
                System.out.println(i + ": " + room[i]);
            }
        }

    }
}
