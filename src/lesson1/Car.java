package lesson1;

public class Car {
    int power = 0;
    int engVolume = 0;
    String name = "ford";
    int weight = 0;
    String color = "red";
    int wheels = 4;
    boolean bag = true;

    public Car() {
    }

    public Car(int power, int engVolume, String name, int weight, String color, int wheels, boolean bag) {
        this.power = power;
        this.engVolume = engVolume;
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.wheels = wheels;
        this.bag = bag;

    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", engVolume=" + engVolume +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", bag=" + bag +
                '}';
    }
}
