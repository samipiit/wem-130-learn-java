package learn_basics.oops.inheritance;

public class LearnInheritance {

    /*
    INHERITANCE

        - "IS A" relationship
            - A cat is a animal, a car is a vehicle
     */

    public static void main(String[] args) {
        Motorcycle kawasaki = new Motorcycle();
        kawasaki.accelerate();
        kawasaki.decelerate();

        Car mercedes = new Car();
        mercedes.accelerate();
        mercedes.decelerate();

        Vehicle mercedesBenz = new Vehicle();
        mercedesBenz.accelerate();

        Tesla modelX = new Tesla();
        modelX.accelerate();
        modelX.decelerate();


        Vehicle bmw = new Car();
        bmw.accelerate();

        if (mercedes instanceof Vehicle) {
            System.out.println("Mercedes is a vehicle!");
        }

    }

}
