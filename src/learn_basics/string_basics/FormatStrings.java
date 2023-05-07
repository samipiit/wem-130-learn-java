package learn_basics.string_basics;

public class FormatStrings {

    public static void main(String[] args) {
        String sentence = "My name is";
        String name = "Sabbir";
        String secondSentence = "My age is";
        int age = 28;

//        System.out.println(sentence + " " + name + "\n" + secondSentence + " " + age);
        /*
        My name is Sabbir
        My age is 28
         */


        System.out.printf("%s %s\n%s %d", sentence, name, secondSentence, age);
    }

}
