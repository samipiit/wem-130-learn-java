package learn_basics.commenting;

import java.util.Scanner;

public class LearnCommenting {

//     Single-line comment

    /*
    This
    is
    a
    multi
    line
    comment
     */

    public static void main(String[] args) {
        System.out.println(doAddition(5, 10));
        Scanner obj = new Scanner(System.in);
    }


    /**
     * This method will accept 2 integers and return the sum of both of the integers
     *
     * @param num1 First number to be added
     * @param num2 Second number to be added
     * @return Sum of the 2 integers
     */
    static int doAddition(int num1, int num2) {
        return num1 + num2;
    }

}
