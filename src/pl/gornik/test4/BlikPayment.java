package pl.gornik.test4;

import java.util.Scanner;

public class BlikPayment implements payment{
    @Override
    public void makePayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Platnosc blik");
        int blik = scanner.nextInt();
        System.out.println("Kod blik: " + blik);
        System.out.println("Pobrano z konta: " + amount + " zl");
    }
}
