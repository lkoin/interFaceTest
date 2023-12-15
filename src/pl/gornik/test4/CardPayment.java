package pl.gornik.test4;

import java.util.Scanner;

public class CardPayment implements payment{
    @Override
    public void makePayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Platnosc kartą");
        int nrKarty = scanner.nextInt();
        System.out.println("Nr karty " + nrKarty);
        System.out.println("Pobrano z karty: " + amount + " zl");
    }
}
