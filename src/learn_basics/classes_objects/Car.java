package learn_basics.classes_objects;

public class Car {

    // The constructors sole purpose is to initialize the object of the class
    // Constructors are implicit to all classes. Each class has its own constructor, whether explicitly declared, or not
    // Once a constructor is explicitly declared, the implicit constructor goes away
    public Car(String manufacturer, String model, String engine, String transmissionType, int wheelSize, int numOfDoors,
               String color) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        this.transmissionType = transmissionType;
        this.wheelSize = wheelSize;
        this.numOfDoors = numOfDoors;
        this.color = color;
    }

    /*
    States/Attributes (Fields) of all cars
        engine, transmission, wheelSize, numOfDoors, color
     */

    /*
    Behaviors/Methods of all cars
        accelerate, decelerate, turnOnWindshieldWipers, turnOffWindshieldWipers, turnOnHeadlights, turnOffHeadlights,
        reverse
     */

    String manufacturer;
    String model;
    String engine;
    String transmissionType;
    int wheelSize;
    int numOfDoors;
    String color;

    void accelerate() {
        System.out.println(manufacturer + " " + model + " is accelerating");
    }

    void decelerate() {
        System.out.println(manufacturer + " " + model + " is decelerating");
    }

    void reverse() {
        System.out.println("The car is in reverse");
    }

    void turnOnWipers() {
        System.out.println("Wipers are on");
    }

    void turnOffWipers() {
        System.out.println("Wipers are off");
    }

}
