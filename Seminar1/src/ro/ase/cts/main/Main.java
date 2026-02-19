package ro.ase.cts.main;

import ro.ase.cts.animale.FoodType;
import ro.ase.cts.animale.Lion;
import ro.ase.cts.animale.Monkey;
import ro.ase.cts.animale.Zebra;
import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zookeper1 = new ZooKeeper("Ionel");
        Zoo zoo1 = new Zoo("Zoo Bucuresti", zookeper1);

        Lion leu = new Lion(3, "Leutu", FoodType.MEAT, 30.5F);
        Zebra zebra = new Zebra(5, "Zebruta", FoodType.GRASS, 12);
        Monkey maimuta1 = new Monkey(7, "Marcel", FoodType.BANANE);

        zoo1.addAnimal(leu);
        zoo1.addAnimal(zebra);
        zoo1.addAnimal(maimuta1);

        zoo1.feedAllAnimals();
    }
}
