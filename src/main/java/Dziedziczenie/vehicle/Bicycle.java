package Dziedziczenie.vehicle;

public class Bicycle extends Vehicle {

    private int wheels;
    private int numberOfGears;

    public Bicycle(int speed, int maxSpeed, int wheels, int numberOfGears) {
        super(speed, maxSpeed);
        this.wheels = wheels;
        this.numberOfGears = numberOfGears;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "wheels=" + wheels +
                ", numberOfGears=" + numberOfGears +
                '}';
    }
}
