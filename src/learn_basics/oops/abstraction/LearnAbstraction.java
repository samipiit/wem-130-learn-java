package learn_basics.oops.abstraction;

public class LearnAbstraction {

    /*
    Abstract

        - Abstract Classes
            - Cannot be instantiated


        - Abstract Methods
            - Do not have a concrete implementation
     */


    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", "M3", "Imola Red", "6MT");
        Mercedes mercedes = new Mercedes("Mercedes", "C63 AMG", "Red");

        bmw.startEngine();
        mercedes.startEngine();
    }

}
