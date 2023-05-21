package learn_advanced.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnExceptions {

    /*
    Exception Hierarchy
        Checked Exceptions - Compile-time errors
        Unchecked Exceptions - Run-time errors

    Try-Catch-Finally
        Try to do something, catch this particular exception (if it occurs)
        Finally, do something, no matter what
     */

    public static void main(String[] args) {
        try {
            printDay(2);
        } catch (NoSuchDayException nsde) {
            System.out.println("No such day matches the number entered");
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divide by 0");
        } catch (Exception e) {
            System.out.println("This is a catch-all");
        }

        // Try-Catch-Finally (To be used with closing resources manually)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your age?");
//
//        try {
//            int age = scanner.nextInt();
//            System.out.println(age);
//        } catch (InputMismatchException ime) {
//            System.out.println("Must enter a whole number");
//        } finally {
//            System.out.println("Closing scanner...");
//            scanner.close();
//            System.out.println("Scanner closed");
//        }

        // Try with resources (Will always close resource after exiting try block)
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your age");
            int age = scanner.nextInt();
            System.out.printf("Your age is %d", age);
        } catch (InputMismatchException ime) {
            System.out.println("Must enter a whole number");
        }

        System.out.println();
    }


    static void printDay(int dayNum) throws NoSuchDayException {
        switch(dayNum) {
            case 1:
                System.out.println("Sunday");
                System.out.println(10/0);
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                throw new NoSuchDayException();
        }
    }


}
