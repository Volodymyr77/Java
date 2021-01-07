package HW2;

import lombok.AllArgsConstructor;
import lombok.Data;

//
@AllArgsConstructor
@Data

public class Cat extends Animal {
//
private final String description = "cat catch mause";
    private final double mise;
    private int lifes;


    public Cat(double mise) {
        this.mise = mise;
    }

    public Cat(String food, String location, double mise) {
        super(food, location);
        this.mise = mise;
    }

    public Cat (String food, String location, int lifes, double mise) {
        super(food,location);
        this.mise = mise;
        this.lifes = lifes;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public String getFood() {
        return super.getFood();
    }


}
