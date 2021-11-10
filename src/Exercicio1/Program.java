package Exercicio1;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de alturas: ");
        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            System.out.println("Digite a altura: ");
            vect[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i=0; i<n; i++){
            soma += vect[i];
        }

        double avg = soma / n;

        System.out.println("Average height: " + avg);
    }
}
