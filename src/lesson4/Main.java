package lesson4;

public class Main {

    public static void main(String[] args) {

        for (CarType carType : CarType.values()) {
            System.out.println(carType.getUkrainianTranslation());

        }
    }
}
