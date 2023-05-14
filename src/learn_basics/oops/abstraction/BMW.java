package learn_basics.oops.abstraction;

public class BMW extends Car {

    String transmission;

    public BMW(String manufacturer, String model, String color, String transmission) {
        super(manufacturer, model, color);
        this.transmission = transmission;
    }

    void startEngine() {
        System.out.println("Starting BMW");
    }
}
