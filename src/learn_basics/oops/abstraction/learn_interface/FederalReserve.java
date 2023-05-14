package learn_basics.oops.abstraction.learn_interface;

public interface FederalReserve {

    public double FED_FUNDS_RATE = 5.5;

    /*
    Interface

        - Difference between abstract classes and interfaces
            1. Interfaces also cannot be instantiated
            2. Interfaces do not have a default constructor or any constructor
            3. Interfaces are 100% abstract
            4. All global variables are public, static, final by default
            5. All methods are public, non-static and abstract by default
     */

    void withdraw();

}
