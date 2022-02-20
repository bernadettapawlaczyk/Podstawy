package Dziedziczenie.vehicle;

public class Car extends Vehicle {

    private String model;
    private int engineSize;
    private int door;

    public Car(int speed, int maxSpeed, String model , int engineSize, int door) {
        super(speed, maxSpeed);
        this.model = model;
        this.engineSize = engineSize;
        this.door = door;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engineSize=" + engineSize +
                ", door=" + door +
                '}';
    }
}
