package learn_basics.debugging;

public class LearnDebugging {

    /*
    Debugging

        The process of walking through our code and identifying if/where any bugs exist. It also helps us understand
        how our code is functioning

        In order to debug, we must set a breakpoint. Breakpoints indicate where we want our code to pause while
        executing
     */

    public static void main(String[] args) {
        int num = 1000;

        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }

//        String name = "Sofiane";
//
//        System.out.println("We are beginning execution of the program");
//        doSomething(2);
//        System.out.println("We are done executing the program");
    }

    static void doSomething(int value) {
        if (value == 1) {
            nestedDoSomething(value);
        }
    }

    static void nestedDoSomething(int value) {
        if (value == 1) {
            nestedNestedDoSomething();
        }
    }

    static void nestedNestedDoSomething() {
        System.out.println("Doing something");
    }



}
