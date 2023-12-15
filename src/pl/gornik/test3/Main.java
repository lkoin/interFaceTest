package pl.gornik.test3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu ekspresu:");
        System.out.println("1. Kawa zwykła");
        System.out.println("2. Espresso");
        System.out.println("3. Capuchino");
        System.out.println("4. Wyłacz ekspres");
        System.out.println("5. test diagnostyczny");
        boolean wlaczony = true;
        while (wlaczony == true) {
            int wybor = scanner.nextInt();
            switch (wybor) {
                case 1 -> {

                } case 2 -> {

                } case 3 -> {

                } case 4 -> {

                } case 5 -> {

                }
            }
        }
    }
}
