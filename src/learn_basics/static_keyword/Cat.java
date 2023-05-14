package learn_basics.static_keyword;

public class Cat {

    // States
    String color;
    String breed;
    String weight;
    static int numOfPaws = 4;


    // Behaviors
    static void eat() {
        System.out.println("Nom, nom, nom");
    }

    static void sleep() {
        System.out.println("Good night");
    }

    static void run() {
        System.out.println("Running to claw your face off");
    }

    static void purr() {
        System.out.println("Purrrrrr");
    }

    static void talk() {
        System.out.println("Meow!");
    }

    static void crouch() {
        System.out.println("Hunting for food...");
    }

    void pounce() {
        System.out.println("I'm gonna getchya!");
    }

}
