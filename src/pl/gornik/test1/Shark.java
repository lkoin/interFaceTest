package pl.gornik.test1;

public class Shark implements Swimming{
    private String name;

    public String getName() {
        return name;
    }

    public Shark(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Buul bull");
    }

    @Override
    public void Swim() {
        System.out.println("Swimming");
    }
}
