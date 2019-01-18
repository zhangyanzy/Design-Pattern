package Singleton;

/**
 * 注意线程安全
 */

public class Car {

    private static Car car = null;

    private Car() {

    }

    public synchronized static Car getInstance() {
        if (car == null) {
            car = new Car();
        }
        return car;
    }
}

class CarDemo {
    public static void main(String[] args) {
        Car car = Car.getInstance();
        Car car1 = Car.getInstance();
        System.out.println(car == car1);
    }
}
