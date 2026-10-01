package lt.vcd;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Krastine a: ");
        double a = scanner.nextDouble();

        System.out.print("Krastine b: ");
        double b = scanner.nextDouble();

        System.out.print("Krastine c: ");
        double c = scanner.nextDouble();

        // Pusperimetris
        double p = (a + b + c) / 2;

        // Herono formule plotui skaičiuoti
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Trikampio plotas: " + s);

        scanner.close();
    }
}
