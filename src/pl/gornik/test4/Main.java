package pl.gornik.test4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        payment payment;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę do zaplaty: ");
        double amount = scanner.nextDouble();
        System.out.println("Jaki rodzaj platnosci");
        System.out.println("1. Platnosc gotowka");
        System.out.println("2. Platnosc karta");
        System.out.println("3. Platnosc blik");
        int wybor = scanner.nextInt();
        switch (wybor) {
        case 1 -> {

        }
    }   }
}
