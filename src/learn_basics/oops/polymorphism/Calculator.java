package learn_basics.oops.polymorphism;

public class Calculator {

    /*
    3 Things That Allow Method Overloading

    1 - The number/quantity of parameters
    2 - The type of parameters
    3 - Position/Order of parameters
     */

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public long add(int a, long b) {
        return (long) a + b;
    }

    public long add(long a, int b) {
        return a + (long) b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
