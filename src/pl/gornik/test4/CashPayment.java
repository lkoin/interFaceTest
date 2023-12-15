package pl.gornik.test4;

import java.util.Scanner;

public class CashPayment implements payment{
    @Override
    public void makePayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Platnosc gotowka");
        System.out.println("Jaka kwote wplacono");
        double value = scanner.nextDouble();
        while (value<amount) {
            System.out.println("Podaj kwote wieksza niz kwota do zaplaty");
            value = scanner.nextDouble();
        }
        System.out.printf("Reszta: %.2f",value-amount);
        System.out.println("Kwota do zaplaty: " + amount + " zl");
    }
}
