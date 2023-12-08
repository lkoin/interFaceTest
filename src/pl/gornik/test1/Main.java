package pl.gornik.test1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Burek");
        System.out.println(dog1.getName()+"daje głos: ");
        dog1.makeSound();
        dog1.run();
        System.out.println("-------------------------------");
        Eagle eagle = new Eagle("Janek");
        System.out.println(eagle.getName()+"daje głos: ");
        eagle.makeSound();
        eagle.fly();
        System.out.println("-------------------------------");
        Shark shark = new Shark("Heniek");
        System.out.println(shark.getName()+"daje głos: ");
        shark.Swim();
        shark.makeSound();
    }
}