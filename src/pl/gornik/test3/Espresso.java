package pl.gornik.test3;

public class Espresso extends Coffe implements CoffeCup{

    public Espresso() {
    }

    @Override
    public void makeCoffe() {
        this.setName("Espresso");
        this.setNumberOfBeans(30);
        this.setAmountOfWater(20);
    }

    public String toString() {
        return this.getName() + "ziaren kawy: " + getNumberOfBeans() + "wody: " + getAmountOfWater();
    }
}
