package learn_basics.control_flow;

public class LearnForLoops {

    /*
    Loops are used to iterate (do a task repeatedly, a certain number of times)

    For Loops - used when we know the exact number of times to iterate
    For-Each Loops - used when we don't know the exact number of times to iterate (typically used with data structures)

     */

    public static void main(String[] args) {

        // FOR LOOP
        //  Start;     Stop;  Step
//        for(int i = 0; i < 10; i++) {
//            System.out.printf("Iteration #%d: Hello, world!\n", i);
//        }
//
//        for(int i = 10; i > 0; i--) {
//            System.out.printf("Iteration #%d: Hello, world!\n", i);
//        }

        // FOR-EACH LOOP
        int[] myArray = {10, 20, 30, 40, 50, 60, 70, 80};

//        for(int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }

        int total = 0;

        for (int num : myArray) {
            System.out.println(num);
        }

    }

}
