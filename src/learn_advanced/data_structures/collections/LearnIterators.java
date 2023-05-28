package learn_advanced.data_structures.collections;

import java.util.*;

public class LearnIterators {

    public static void main(String[] args) {
//        Queue<String> customersInLine = new PriorityQueue<>();
//        customersInLine.add("Fazia");
//        customersInLine.add("Eric");
//        customersInLine.add("Sam");
//        customersInLine.add("Karima");
//
//        Iterator<String> customerIter = customersInLine.iterator();
//
//        while(customerIter.hasNext()) {
//            System.out.println(customerIter.next());
//        }
//
//        while(customerIter.hasNext()) {
//            System.out.printf("This is the next customer in line: %s\n", customerIter.next());
//        }


        List<String> footballTeams = new ArrayList<>();
        footballTeams.add("NE Patriots");
        footballTeams.add("GB Packers");
        footballTeams.add("KC Chiefs");
        footballTeams.add("NY Giants");

        ListIterator<String> teamsIter = footballTeams.listIterator();

        while(teamsIter.hasNext()) {
            if (teamsIter.next().equals("KC Chiefs")) {
                footballTeams.add("DEN Broncos");
            }

        }

        while(teamsIter.hasPrevious()) {
            System.out.println(teamsIter.previous());
        }



    }

}
