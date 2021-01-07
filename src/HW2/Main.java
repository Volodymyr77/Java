package HW2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Animal> animals = new ArrayList<>();

        Dog dog1 = new Dog("meat", "home");
        Dog dog2 = new Dog("milk", "ferm");
//    Cat cat1 = new Cat();
//    Cat cat2 = new Cat();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        System.out.println("Animal");
        System.out.println("-----______------");

        dog1.makeNoise();
        dog2.animalEat("a");
        dog1.animalSleep("ahhh");
    }


//    Array[] arrays = new Array[] {dog1, dog2, cat1, cat2, horse1, horse2};
}
