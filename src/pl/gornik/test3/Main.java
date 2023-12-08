package pl.gornik.test3;

public class Main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        Capuchino capuchino = new Capuchino();
        Normal normal = new Normal();
        espresso.makeCoffe();
        System.out.println(espresso);
        System.out.println("-----------------------------");
        capuchino.makeCoffe();
        System.out.println(capuchino);
        System.out.println("-----------------------------");
        normal.makeCoffe();
        System.out.println(normal);

        System.out.println("-----------------------------");
        System.out.println("Kawa x2");
        espresso.makeDoubleCoffe();
        System.out.println(espresso);
    }
}
