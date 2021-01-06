package HW2;

public class Dog extends Animal {

//    String breed;
//    int height;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise(String a) {
        super.makeNoise(a);
        System.out.println("gau-gau");
    }
}
