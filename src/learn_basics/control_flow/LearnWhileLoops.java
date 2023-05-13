package learn_basics.control_flow;

public class LearnWhileLoops {

    /*
    While & Do... While Loops

        - While loops are executed while a condition is true. The condition is evaluated BEFORE each execution/iteration
        - Do...While loops are executed at least once. The condition is evaluated AFTER each execution/iteration
     */

    public static void main(String[] args) {
        int x = 10;

        while (x > 5) {
            System.out.println(x);
            x--;
        }

        do {
            System.out.println(x);
            x--;
        } while (x > 5);

    }

}
