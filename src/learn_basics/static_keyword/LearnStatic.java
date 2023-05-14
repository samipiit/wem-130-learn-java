package learn_basics.static_keyword;

public class LearnStatic {

    /*
    Static

        - Static members belong to the class itself, instead of to each instance of the class
        - Static members of a class are called/accessed using the class name (e.g. - ClassName.staticVariable)
        - Non-static members of a class are called/accessed using the instance of the class
        - Static members can be accessed from non-static methods
        - Non-static members cannot be accessed from static methods
     */

    public static void main(String[] args) {
        Cat sirMeow = new Cat();
        Cat leroy = new Cat();
        Cat garfield = new Cat();
        Cat snuggles = new Cat();
        Cat mimi = new Cat();

//        sirMeow.color = "White";
//        leroy.color = "Gray";
//        garfield.color = "Orange";
//        snuggles.color = "Black/White";
//        mimi.color = "Black/White";
//
//        System.out.println(sirMeow.color);
//        System.out.println(leroy.color);
//        System.out.println(garfield.color);
//        System.out.println(snuggles.color);
//        System.out.println(mimi.color);
//
//        Cat.numOfPaws = 10;
//
//        System.out.println("Reassigned to: 10");
//        System.out.println(sirMeow.numOfPaws);
//        System.out.println(leroy.numOfPaws);
//        System.out.println(garfield.numOfPaws);
//        System.out.println(snuggles.numOfPaws);
//        System.out.println(mimi.numOfPaws);
//
//        Cat.numOfPaws = 2;
//
//        System.out.println("Reassigned to: 2");
//        System.out.println(sirMeow.numOfPaws);
//        System.out.println(leroy.numOfPaws);
//        System.out.println(garfield.numOfPaws);
//        System.out.println(snuggles.numOfPaws);
//        System.out.println(mimi.numOfPaws);

    }

}
