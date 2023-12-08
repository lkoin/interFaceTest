package pl.gornik.test3;

public class Normal extends Coffe implements CoffeCup{
    public Normal() {
    }

    @Override
    public void makeCoffe() {
        this.setName("Espresso");
        this.setNumberOfBeans(20);
        this.setAmountOfWater(200);
    }

    public String toString() {
        return this.getName() + " ziaren kawy: " + getNumberOfBeans() + " wody: " + getAmountOfWater();
    }
}
