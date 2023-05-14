package learn_basics.composition;

public class Computer {

    String manufacturer;
    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;

    public Computer(String manufacturer, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.manufacturer = manufacturer;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

}
