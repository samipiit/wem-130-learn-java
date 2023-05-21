package learn_advanced.data_structures;

import java.util.HashMap;

public class LearnDataStructures {

    public static void main(String[] args) {
        // List

        // Stack (Last in, First Out - LIFO)

        // Queue (First in, First Out - FIFO)

        // HashMap (Key:Value Pairs)
        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Dalal");
        students.put(2, "Sabbir");
        students.put(3, "Fatma");
        students.put(4, "Salim");
        students.put(5, "Dalal");
        students.put(5, "Sofiane");

        System.out.println(students.get(5));

    }

}
