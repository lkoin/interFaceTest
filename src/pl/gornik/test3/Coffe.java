package pl.gornik.test3;

public class Coffe implements DoubleCoffe,CoffeCup{
    private String name;
    private int numberOfBeans;
    private double amountOfWater;
    private double amountofMilk;

    public Coffe() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBeans() {
        return numberOfBeans;
    }

    public void setNumberOfBeans(int numberOfBeans) {
        this.numberOfBeans = numberOfBeans;
    }

    public double getAmountOfWater() {
        return amountOfWater;
    }

    public void setAmountOfWater(double amountOfWater) {
        this.amountOfWater = amountOfWater;
    }

    public double getAmountofMilk() {
        return amountofMilk;
    }

    public void setAmountofMilk(double amountofMilk) {
        this.amountofMilk = amountofMilk;
    }

    @Override
    public String toString() {
        return this.getName() + " ziaren kawy: " + getNumberOfBeans() + " wody: " + getAmountOfWater();
    }

    @Override
    public void makeDoubleCoffe() {
        makeCoffe();
        this.setName(this.getName()+ " x2");
        this.setNumberOfBeans(this.getNumberOfBeans()*2);
        this.setAmountOfWater(this.getAmountOfWater()*20);
    }

    @Override
    public void makeCoffe() {
        this.setName("Coffe");
        this.setNumberOfBeans(15);
        this.setAmountOfWater(30);
    }
}
