package pl.gornik.test1;

public class Eagle implements Flying {
    private String name;

    public String getName() {
        return name;
    }

    public Eagle(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("iiiiii, iiiii......");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}
