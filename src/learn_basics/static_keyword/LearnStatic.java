package learn_basics.static_keyword;

public class LearnStatic {

    public static void main(String[] args) {
        Cat sirMeow = new Cat();
        Cat leroy = new Cat();
        Cat garfield = new Cat();
        Cat snuggles = new Cat();
        Cat mimi = new Cat();

        sirMeow.color = "White";
        leroy.color = "Gray";
        garfield.color = "Orange";
        snuggles.color = "Black/White";
        mimi.color = "Black/White";

//        System.out.println(sirMeow.color);
//        System.out.println(leroy.color);
//        System.out.println(garfield.color);
//        System.out.println(snuggles.color);
//        System.out.println(mimi.color);

        Cat.numOfPaws = 10;

//        sirMeow.numOfPaws = 10;

        System.out.println("Reassigned to: 10");
        System.out.println(sirMeow.numOfPaws);
        System.out.println(leroy.numOfPaws);
        System.out.println(garfield.numOfPaws);
        System.out.println(snuggles.numOfPaws);
        System.out.println(mimi.numOfPaws);

        Cat.numOfPaws = 2;
//        leroy.numOfPaws = 2;

        System.out.println("Reassigned to: 2");
        System.out.println(sirMeow.numOfPaws);
        System.out.println(leroy.numOfPaws);
        System.out.println(garfield.numOfPaws);
        System.out.println(snuggles.numOfPaws);
        System.out.println(mimi.numOfPaws);

        Cat.numOfPaws = 54;
//        garfield.numOfPaws = 54;

        System.out.println("Reassigned to: 54");
        System.out.println(sirMeow.numOfPaws);
        System.out.println(leroy.numOfPaws);
        System.out.println(garfield.numOfPaws);
        System.out.println(snuggles.numOfPaws);
        System.out.println(mimi.numOfPaws);

        Cat.numOfPaws = 1;
//        snuggles.numOfPaws = 1;

        System.out.println(sirMeow.numOfPaws);
        System.out.println(leroy.numOfPaws);
        System.out.println(garfield.numOfPaws);
        System.out.println(snuggles.numOfPaws);
        System.out.println(mimi.numOfPaws);

        Cat.numOfPaws = 8;
//        mimi.numOfPaws = 8;

        System.out.println(sirMeow.numOfPaws);
        System.out.println(leroy.numOfPaws);
        System.out.println(garfield.numOfPaws);
        System.out.println(snuggles.numOfPaws);
        System.out.println(mimi.numOfPaws);

    }

}
