package pl.gornik.test4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę do zaplaty: ");
        double amount = scanner.nextDouble();
        System.out.println("Jaki rodzaj platnosci");
        System.out.println("1. Platnosc gotowka");
        System.out.println("2. Platnosc karta");
        System.out.println("3. Platnosc blik");
        int wybor = scanner.nextInt();
        Payment payment = null;
        switch (wybor) {
            case 1 -> {
                payment = new CashPayment();
            }
            case 2 -> {
                payment = new CardPayment();
            }
            case 3 -> {
                payment = new BlikPayment();
            }
            default -> System.out.println("Podano nie wlasciwa opcje ");
        }
        if (wybor > 0 && wybor < 4) {
            System.out.println("Platnosc w toku...");
            payment.makePayment(amount);
        }
    }

}
