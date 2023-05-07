package learn_basics.methods;

import learn_basics.operators.LearnOperators;

public class LearnMethods {

    /*
    2 Types of Methods
        1 - Perform an action (return type = void)
        2 - Perform an action & return something (return type = data type)
     */

    /*
    Method Declaration/Signature
        1 - Access Modifier
        2 - Static or non-static
        3 - Return type*
        4 - Name*
        5 - Parameters*
        6 - Code block**
     */

    static int age = 2;
    static int myOtherInt = 1000;

    static void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    static int doSubtract(int num1, int num2) {
        return num1 - num2;
    }

    static void printMyAge() {
        System.out.println("My age is " + age);
    }

    public static void main(String[] args) {
        printMyAge();
        subtract(200, 10); // 190
        subtract(500, 100); // 400
        subtract(1000, 250); // 750

        // THESE WILL NOT PRINT BECAUSE WE ARE ONLY RETURNING A VALUE FROM doSubtract method
        doSubtract(500, 25); // 475
        doSubtract(-500, 750); // -1250
        doSubtract(0, -19); // 19

        if (doSubtract(100, 50) > 20) {
            System.out.println("Greater than 20");
        } else {
            System.out.println("Less than 20");
        }

        System.out.println(isChild(19)); // false
        System.out.println(isChild(1)); // true
        System.out.println(isChild(-500)); // true
        System.out.println(isChild(2003)); // false

        // We can use the return value of a method to do various things, such as use them in conditional statements
        if (isChild(age)) {
            System.out.println("You are just a child");
        } else {
            System.out.println("You are an adult");
        }
    }

    static boolean isChild(int age) {
        return age < 18;
    }

}
