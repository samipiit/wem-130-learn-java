package learn_basics.composition;

public class LearnComposition {

    public static void main(String[] args) {
        Monitor monitor = new Monitor("Dell", 24, "4K", 144, true);
        Keyboard keyboard = new Keyboard("HP", true, true, true,
                false, false);
        Mouse mouse = new Mouse("Logitech", true, true, true, false);

        String computerManufacturer = "HP";
        Computer hp = new Computer(computerManufacturer, monitor, keyboard, mouse);

        hp.monitor.increaseVolume();
        hp.mouse.moveCursor(20, -167);
        hp.monitor.turnOn();
        hp.keyboard.enableCapsLock();

    }

}
