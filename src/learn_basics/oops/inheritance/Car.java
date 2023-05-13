package learn_basics.oops.inheritance;

public class Car extends Vehicle {

    // Car is the child class

    @Override // Annotate
    void accelerate() {
        super.accelerate();
        System.out.println("Car is accelerating");
    }

}
