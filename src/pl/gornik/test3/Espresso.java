package pl.gornik.test3;

public class Espresso extends Coffe implements CoffeCup,DoubleCoffe{

    public Espresso() {
    }

    @Override
    public void makeCoffe() {
        this.setName("Espresso");
        this.setNumberOfBeans(30);
        this.setAmountOfWater(20);
    }

    @Override
    public void makeDoubleCoffe() {
        makeCoffe();
        this.setName(this.getName()+ " x2");
        this.setNumberOfBeans(this.getNumberOfBeans()*2);
        this.setAmountOfWater(this.getAmountOfWater()*20);
    }


    public String toString() {
        return this.getName() + " ziaren kawy: " + getNumberOfBeans() + " wody: " + getAmountOfWater();
    }
}
