package pl.gornik.test4;

import java.util.Scanner;

public class BlikPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Platnosc blik...");
        System.out.println("Podaj kod blik...");
        int blik = scanner.nextInt();
        System.out.println("Kod blik: " + blik);
        System.out.println("Pobrano z konta: " + amount + " zl");
    }
}
