package pl.gornik.test3;

public class Capuchino extends Coffe implements CoffeCup{
    public Capuchino() {
    }

    @Override
    public void makeCoffe() {
        this.setName("Capuchino");
        this.setNumberOfBeans(15);
        this.setAmountOfWater(100);
        this.setAmountofMilk(100);
    }
        public String toString() {
            return this.getName() + " ziaren kawy: " + getNumberOfBeans() + " wody: " + getAmountOfWater()+ " mleko: "+ getAmountofMilk();
    }
}
