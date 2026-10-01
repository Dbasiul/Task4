package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite kraštinės a ilgį: ");
        double a = scanner.nextDouble();

        System.out.print("Įveskite kraštinės b ilgį: ");
        double b = scanner.nextDouble();

        System.out.print("Įveskite kraštinės c ilgį: ");
        double c = scanner.nextDouble();

        // Trikampio nelygybės patikrinimas
        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2.0; // Pusperimetris
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Herono formulė

            System.out.printf("Trikampio plotas: %.2f%n", area);
        } else {
            System.out.println("Klaida: trikampis su tokiomis kraštinėmis neegzistuoja.");
        }

        scanner.close();
    }
}
