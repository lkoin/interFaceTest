package pl.gornik.test1;

public class FlyingFIsh implements Swimming,Flying{
    private String name;

    public String getName() {
        return name;
    }

    public FlyingFIsh(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("bul bul");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void Swim() {
        System.out.println("Swimming");
    }
}
