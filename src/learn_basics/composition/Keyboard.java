package learn_basics.composition;

public class Keyboard {

    String manufacturer;
    boolean hasNumPad;
    boolean isBacklit;
    boolean hasScrollPad;
    boolean hasSmartScreen;
    boolean isMechanical;

    public Keyboard(String manufacturer, boolean hasNumPad, boolean isBacklit, boolean hasScrollPad,
                    boolean hasSmartScreen, boolean isMechanical) {
        this.manufacturer = manufacturer;
        this.hasNumPad = hasNumPad;
        this.isBacklit = isBacklit;
        this.hasScrollPad = hasScrollPad;
        this.hasSmartScreen = hasSmartScreen;
        this.isMechanical = isMechanical;
    }

    void turnOnBacklight() {
        if (isBacklit) {
            System.out.println("Turning on backlight");
        }
    }

    void turnOffBacklight() {
        if (isBacklit) {
            System.out.println("Turning off backlight");
        }
    }

    void enableCapsLock() {
        System.out.println("CAPS LOCK ENABLED");
    }

    void disableCapsLock() {
        System.out.println("Disabled caps lock");
    }


}
