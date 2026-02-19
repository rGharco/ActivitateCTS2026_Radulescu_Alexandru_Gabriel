package ro.ase.cts.animale;

public class Lion extends Animal {
    private float weight;

    public Lion(int age, String name, FoodType foodType, float weight) {
        super(age, name, foodType);
        this.weight = weight;
    }


    @Override
    public void eat(String zookeeperName) {
        System.out.println("Zookeperul: " + zookeeperName + " i-a dat sa manance leului: " + super.name + " "
                + super.foodType);
    }
}
