package HW2;

import java.lang.reflect.Method;

public class Animal {

    private  String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise (int a) {
        System.out.println("grroul");
    }

    public static void animalEat(String[] args) {
        System.out.println("hrum-hrum");
    }

    public static void animalSleep(String[] args) {
        System.out.println("hrrrrrrrrrr....");
    }



}
