package learn_basics.operators;


public class LearnOperators {

    /*
    4 Types of Operators
        1 - Arithmetic
        2 - Assignment
        3 - Comparison
        4 - Logical
     */


    public static void main() {
        // Arithmetic (+, -, *, /, %)
        System.out.println(2 + 2); // 4
        System.out.println(2 - 2); // 0
        System.out.println(2 * 2); // 4
        System.out.println(2 / 2); // 1
        System.out.println(234326 % 2);

        // Assignment
        int myInt = 5;

        myInt += 1;
        System.out.println(myInt);

        myInt -= 1;
        System.out.println(myInt);

        myInt *= 2;
        System.out.println(myInt);

        myInt /= 2;
        System.out.println(myInt); // 5

        myInt %= 2;
        System.out.println(myInt); // 1

        // Comparison (evaluate to a boolean)
        System.out.println(10 == 10); // true
        System.out.println(10 == 20); // false

        System.out.println(10 != 10); // false
        System.out.println(10 != 20); // true

        System.out.println(10 > 10); // false
        System.out.println(10 > 20); // false
        System.out.println(20 > 10); // true
        System.out.println(10 >= 10); // true
        System.out.println(10 < 10); // false
        System.out.println(20 < 10); // false
        System.out.println(20 <= 10); // false
        System.out.println(10 <= 10); // true

        // Logical
        if (2 > 10 && 20 > 10) {
            System.out.println("Hooray");
        } else {
            System.out.println("Aww, man");
        }

        if (2 > 10 || 20 > 10) {
            System.out.println("Hooray");
        } else {
            System.out.println("Aww, man");
        }

        if (2 != 10) {
            System.out.println("Hooray");
        } else {
            System.out.println("Aww, man");
        }
    }

}
