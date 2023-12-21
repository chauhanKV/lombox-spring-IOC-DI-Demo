package di;

public class DiDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.setEngine(new Engine("gg",1200)); // DI with Setter
        car.runCar();

        Car car1 = new Car("I20", new Engine("Power", 1300)); // DI with constructor
        car1.runCar();
    }
}
