package learn_basics.composition;

public class Mouse {

    String manufacturer;
    boolean isWireless;
    boolean hasScrollWheel;
    boolean hasSideNavigationButtons;
    boolean isBacklit;

    public Mouse(String manufacturer, boolean isWireless, boolean hasScrollWheel, boolean hasSideNavigationButtons,
                 boolean isBacklit) {
        this.manufacturer = manufacturer;
        this.isWireless = isWireless;
        this.hasScrollWheel = hasScrollWheel;
        this.hasSideNavigationButtons = hasSideNavigationButtons;
        this.isBacklit = isBacklit;
    }

    void rightClick() {
        System.out.println("Right clicked");
    }

    void leftClick() {
        System.out.println("Left clicked");
    }

    void scrollUp() {
        if(hasScrollWheel) {
            System.out.println("Scrolling up");
        }
    }

    void scrollDown() {
        if(hasScrollWheel) {
            System.out.println("Scrolling down");
        }
    }

    void moveCursor(int x, int y) {
        System.out.printf("Moving to screen coordinates: \nX: %d \nY: %d\n", x, y);
    }



}
