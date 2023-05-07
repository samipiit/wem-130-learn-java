package learn_basics.variables;

public class LearnVariableScope {

    String name = "Abdul"; // Global variable aka Instance variable

    void doSomething() {
        System.out.println(name);
    }

    void doSomethingElse() {
        System.out.println(name);
    }

    void doAnotherThing() {
        System.out.println(name);
    }

    void doLastThing() {
        String name = "Dalal";
        System.out.println(name);
    }

    public static void main(String[] args) {
        LearnVariableScope obj = new LearnVariableScope();

        obj.doSomething(); // Abdul
        obj.doSomethingElse(); // Abdul
        obj.doAnotherThing(); // Abdul

        obj.doLastThing(); // Dalal
    }

    /*
     Scope of a variable is the reachability of that variable

     Local - Contained within the method itself
     Global - Able to be accessed globally (pending access modifier)
     */

}

