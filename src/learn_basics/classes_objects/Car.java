package learn_basics.classes_objects;

public class Car {

    /*
    CLASS
    Classes are a blueprint of an object, and classes typically contain 2 things:

        1. States/Attributes (Fields)
            In this class, we can see attributes of all cars, such as engine, transmission, wheelSize, numOfDoors, color
        2. Behaviors/Methods
            In this class we can see methods or functions particular to all cars, such as accelerate, decelerate,
            reverse, turnOnWindshieldWipers, turnOffWindshieldWipers, turnOnHeadlights, turnOffHeadlights
     */

    /*
    CONSTRUCTORS

    - The constructors sole purpose is to initialize the object of the class
    - Constructors are implicit to all classes. Each class has its own constructor, whether explicitly declared, or not
    - Once a constructor is explicitly declared, the (implicit) default constructor goes away
    - Constructors can also be overloaded, just like methods
     */

    String manufacturer;
    String model;
    String engine;
    String transmissionType;
    int wheelSize;
    int numOfDoors;
    String color;

    public Car() {

    }

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

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
