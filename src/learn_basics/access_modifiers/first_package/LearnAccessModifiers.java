package learn_basics.access_modifiers.first_package;

public class LearnAccessModifiers {

    /*
    Access Modifiers - Restrict the visibility of a class, method or variable
        1. Public - Accessible globally, from any other package
        2. Private - Accessible ONLY within the class it is declared in
        3. Protected - Accessible ONLY within the package it is contained within
        4. Default - Same as protected
     */

    private String name = "Sofiane";

    void doSomething() {
        System.out.println("Hello, world! My name is " + name);
    }

}
