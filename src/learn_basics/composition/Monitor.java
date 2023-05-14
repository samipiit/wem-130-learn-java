package learn_basics.composition;

public class Monitor {

    String manufacturer;
    int screenSize;
    String displayType;
    int refreshRate;
    boolean hasSpeakers;

    public Monitor(String manufacturer, int screenSize, String displayType, int refreshRate, boolean hasSpeakers) {
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.displayType = displayType;
        this.refreshRate = refreshRate;
        this.hasSpeakers = hasSpeakers;
    }

    void turnOn() {
        System.out.println("Monitor screen is turning on");
    }

    void turnOff() {
        System.out.println("Monitor screen is turning off");
    }

    void increaseVolume() {
        if(hasSpeakers) {
            System.out.println("Increasing volume");
        }
    }

    void decreaseVolume() {
        if(hasSpeakers) {
            System.out.println("Decreasing volume");
        }
    }


}
