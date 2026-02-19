package ro.ase.cts.animale;

public class Zebra extends Animal {
    private int lineNr;

    public Zebra(int age, String name, FoodType foodType, int lineNr) {
        super(age, name, foodType);
        this.lineNr = lineNr;
    }

    @Override
    public void eat(String zookeeperName) {
        System.out.println("Zookeperul: " + zookeeperName + " i-a dat sa manance zebrei: " + super.name + " "
                + super.foodType);
    }
}
