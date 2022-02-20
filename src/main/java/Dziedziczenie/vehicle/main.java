package Dziedziczenie.vehicle;

public class main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(100, 180);
        Car car = new Car(90, 200, "Nissan", 2, 3);
        Bicycle bicycle = new Bicycle(10, 25, 2, 6);

        System.out.println(vehicle.getSpeed());
        System.out.println(car.getModel());
        System.out.println(car.getEngineSize());
        System.out.println(bicycle.getWheels());

    }
}
