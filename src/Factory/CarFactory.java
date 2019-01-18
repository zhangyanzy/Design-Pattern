package Factory;

public class CarFactory {


    private CarFactory() {

    }

    public static Car createCar(String carType) {
        if ("buick".equals(carType)) {
            return new Buick();
        } else if ("DasAuto".equals(carType)) {
            return new DasAuto();
        } else {
            return null;
        }
    }
}

class CarFactoryDemo {

    public static void main(String[] args) {
        Car buick = CarFactory.createCar("buick");
        buick.mekeCar();
    }
}
