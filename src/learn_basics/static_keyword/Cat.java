package learn_basics.static_keyword;

public class Cat {

    // States
    String color;
    String breed;
    String weight;
    static int numOfPaws = 4;


    // Behaviors
    void eat() {
        System.out.println("Nom, nom, nom");
    }

    void sleep() {
        System.out.println("Good night");
    }

    void run() {
        System.out.println("Running to claw your face off");
    }

    void purr() {
        System.out.println("Purrrrrr");
    }

    void talk() {
        System.out.println("Meow!");
    }

    void crouch() {
        System.out.println("Hunting for food...");
    }

    void pounce() {
        System.out.println("I'm gonna getchya!");
    }

}
