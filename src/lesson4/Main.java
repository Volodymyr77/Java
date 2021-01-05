package lesson4;

public class Main {

    public static void main(String[] args) {

//        for (CarType carType : CarType.values()) {
//            System.out.println(carType.getUkrainianTranslation());
//            carType.paint();
//        }


//        first option:
//        Engine engine = new Engine((2,4));
//        Car car = new Car(engine, "Audi", 32000, CarType.SEDAN)

        Car car = new Car((new Engine(2,4)), "Audi", Math.max(30000, 32000), CarType.SEDAN);

        Car car1 = new Car(car.getEngine(), "sad", 30000, CarType.SEDAN);


//        car.getEngine().setCylinderNumber(car.getEngine().getCylinderNumber()+1);
//        System.out.println(car);
//        System.out.println(car1);

        car.getEngine().startEngine();
        car.startCar();
    }
}
