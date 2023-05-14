package learn_basics.oops.abstraction;

public abstract class Car {

    String manufacturer;
    String model;
    String color;

    public Car(String manufacturer, String model, String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
    }

    abstract void startEngine();

    void turnOffEngine() {
        System.out.println("Turning engine off...");
    }

    void shutOffCar() {
        turnOffEngine();
    }

}
