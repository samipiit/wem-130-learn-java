package learn_advanced.data_structures;

import java.util.*;

public class LearnMaps {

    /*
    HashMap
        - Data is stored in key-value pairs
        - No duplicate keys are allows
        - Duplicate values are allowed
        - Not fixed in size
     */

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Dalal");
        students.put(2, "Sabbir");
        students.put(3, "Fatma");
        students.put(4, "Salim");
        students.put(5, "Dalal");
        students.put(5, "Sofiane"); // Overwriting the key of 5

//        System.out.println(students.get(5));

        // Retrieving the set of keys, and using the keys to iterate/get values from the map
//        Set<Integer> keys = students.keySet();
//        for (Integer key : keys) {
//            System.out.println(students.get(key));
//        }

        Set<Map.Entry<Integer, String>> entrySet = students.entrySet();

        Collection<String> names = students.values();
        for (String name : names) {
            System.out.println(name);
        }

    }

}
