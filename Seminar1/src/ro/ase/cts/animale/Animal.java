package ro.ase.cts.animale;

public abstract class Animal {
    protected String name;
    private int age;
    protected FoodType foodType;

    public Animal(int age, String name, FoodType foodType) {
        this.age = age;
        this.name = name;
        this.foodType = foodType;
    }

    public abstract void eat(String zookeeperName);
}
