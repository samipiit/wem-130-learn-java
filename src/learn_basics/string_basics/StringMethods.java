package learn_basics.string_basics;

public class StringMethods {

    public static void main(String[] args) {
        String sentence = "   The blue fox jumps over the ravine     ";
        String period = ".";

        System.out.println("The blue fox jumps over the ravine".length());
        System.out.println(sentence.length());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.concat(period));

        System.out.println(sentence.endsWith("ravine")); // true
        System.out.println(sentence.endsWith("ravin")); // false

        System.out.println(sentence.trim());
        System.out.println(sentence.replace(" ", "_"));

    }

}
