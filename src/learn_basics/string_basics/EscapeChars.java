package learn_basics.string_basics;

public class EscapeChars {

    /*
    The character backslash "\" is used to escape the next character that appears and treat it as a string literal

    \n = Newline escape sequence
    \t = Single tab escape sequence
    \b = Backspace escape sequence

     */

    public static void main(String[] args) {
        String firstString = "Welcome to WEM-130.";
        String secondString = "In this batch, we will start off by learning core Java concepts.";
        String thirdString = "In the second portion of this course, we will begin learning automated testing.";
        String fourthString = "My Student ID is \"3472NY_Sami\".";

        System.out.println(firstString + "\b\b\b\b\b\b\b\n\n\n\n\t\t\t\t\t" + secondString + "\b\n\t" + thirdString + "\b\n\t" + fourthString + "\b");
    }
}
