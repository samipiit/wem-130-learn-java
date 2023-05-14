package learn_basics.oops.abstraction;

public class Mercedes extends Car {

    public Mercedes(String manufacturer, String model, String color) {
        super(manufacturer, model, color);
    }

    void startEngine() {
        System.out.println("Starting Mercedes");
    }

}
