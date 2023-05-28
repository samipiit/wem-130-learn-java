package learn_advanced.data_structures.collections;

import java.util.*;

public class LearnCollections {

    /*
    1. Parent interface of Collections framework is Iterable
    2. Three different types of data structures (List, Queue, Set)
    3. Map is not a part of the Collections framework, although it is often considered to be

    LIST
        - Ordered collection of data
        - Able to hold duplicate values
        - Preserves insertion order (can access and insert by position)

    QUEUE
        - Ordered collection of data
        - Stores elements in FIFO (First in, first out) order
        - Preserves insertion order (cannot access and insert by position - only FIFO is allowed)
        - Can only add items to back of queue, can only remove items from front of queue

    SET
        - Unordered collection of data
        - Cannot store duplicate values

     */

    public static void main(String[] args) {
        // region Lists
//        List<String> names = new ArrayList<>();
//
//        names.add("Farha");
//        names.add("Eric");
//        names.add("Abdul");
//        names.add(2, "Younes");
//
//        System.out.println(names.get(3));
//
//        List<String> otherNames = new ArrayList<>();
//        otherNames.add("Abdullah");
//        otherNames.add("Layla");
//        otherNames.add("Fazia");
//
////        names.addAll(otherNames);
//        names.addAll(0, otherNames);
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        otherNames.clear();
//        System.out.println(otherNames.contains("Layla"));
//
//        List<String> cars = new ArrayList<>();
//        List<String> sportsCars = new ArrayList<>();
//
//        cars.add("Honda");
//        cars.add("BMW");
//        cars.add("Ferrari");
//        cars.add("Koenigsegg");
//
//        sportsCars.add("Ferrari");
//        sportsCars.add("Koenigsegg");
//        sportsCars.add("Lamborghini");
//        sportsCars.add("Bugatti");
//
//        if(cars.containsAll(sportsCars)) {
//            System.out.println("All sports cars are in cars list!");
//        }
//
//        System.out.println(cars.indexOf("BMW"));
//        cars.removeAll(sportsCars);
//
//        for (String car : cars) {
//            System.out.println(car);
//        }
        // endregion

        // region Queues
        // Difference between Types - Queue type object does not have a get() method, whereas List type object does
//        Queue<String> queueCustomers = new LinkedList<>();
//        List<String> listCustomers = new LinkedList<>();
//
//        listCustomers.add("Tina");
//        listCustomers.add("Sabbir");
//
//        queueCustomers.add("Tina");
//        queueCustomers.add("Sabbir");
//        queueCustomers.add("Sami");
//
//        System.out.println(queueCustomers.remove()); // Remove Tina
//        System.out.println(queueCustomers.remove()); // Remove Sabbir
//        System.out.println(queueCustomers.peek()); // Peeking at the head of the queue --> Sami
//        System.out.println(queueCustomers.remove()); // Retrieving and removing the head of queue. Exception thrown if the queue is empty
//        System.out.println(queueCustomers.poll()); // Retrieving and removing the head of queue. No exception thrown if the queue is empty
//
        // endregion

        // region Sets
        List<String> animals = new ArrayList<>();
        Set<String> setAnimals = new HashSet<>();

        animals.add("Cat");
        animals.add("Camel");
        animals.add("Cow");
        animals.add("Capybara");
        animals.add("Crow");
        animals.add("Crocodile");
        animals.add("Crane");
        animals.add("Cheetah");
        animals.add("Camel");
        animals.add("Cat");
        animals.add("Cow");

        // Since animals (type List) contains duplicates, when we add this List to a Set collection, duplicates will be removed
        setAnimals.addAll(animals);

        for (String animal : setAnimals) {
            System.out.println(animal);
        }

        // Here, we clear the List (which previously contained dupes) and add the Set values back to the List
//        animals.clear();
//        animals.addAll(setAnimals);
//
//        for (String animal : animals) {
//            System.out.println(animal);
//        }

        // endregion


    }
}
