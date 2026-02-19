package ro.ase.cts.animale;

public class Monkey extends Animal{
    public Monkey(int age, String name, FoodType foodType) {
        super(age, name, foodType);
    }

    @Override
    public void eat(String zookeeperName) {
        System.out.println(zookeeperName + " hraneste cu " + super.foodType + " pe " + super.name);
    }
}
