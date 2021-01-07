package HW2;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

public class Dog extends Animal {

    private final String description = "dog on the walk";
    private final double weight;
    private int age;


    public Dog(double weight) {
        this.weight = weight;
    }

    public Dog(String food, String location, double weight) {
        super(food, location);
        this.weight = weight;
    }

    public Dog (String food, String location, int age, double weight) {
        super(food,location);
        this.weight = weight;
        this.age = age;
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
