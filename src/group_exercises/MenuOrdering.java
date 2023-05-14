package group_exercises;

import java.util.Scanner;

public class MenuOrdering {

    /*
    Requirements:
        1. User should be able to select sides, entrées and/or drinks
        2. Each item should have a cost associated with it
        3. Upon selection, the cost of the item should be added to the total that the customer will owe
     */


    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Hello, welcome to Sofiane's Burger Joint!");
        System.out.println("What would you like to order?\n\t1 - Starters/Sides\n\t2 - Entrees\n\t3 - Drinks");
        System.out.print("Please enter the number corresponding to your selection:");
        int menuSelection = stdin.nextInt();
        System.out.println();

        if (menuSelection == 1) {
            printStarterMenu();
        } else if (menuSelection == 2) {
            printEntreeMenu();
        } else if (menuSelection == 3) {
            printDrinkMenu();
        }
    }

    static void printStarterMenu() {
        System.out.println("***STARTERS***");
        System.out.println("\t1 - Mozzarella Sticks (5)\n\t2 - Chicken Nuggies (5)\n\t3 - Onion Rings (4)\n\t4 - Sofiane's Signature French Fries (6)");
    }

    static void printEntreeMenu() {
        System.out.println("***ENTREES***");
        System.out.println("\t1 - Double Cheeseburger (15)\n\t2 - Fried Chicken Burger (12)\n\t3 - Grilled Chicken Burger (13)\n\t4 - Veggie Burger (16)");
    }

    static void printDrinkMenu() {
        System.out.println("***DRINKS***");
        System.out.println("\t1 - Coke (3)\n\t2 - Sofiane's Signature Homemade Iced Tea (5)\n\t3 - Orange Juice (3)\n\t4 - Iced Coffee (5)");
    }
}
