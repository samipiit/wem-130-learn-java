package learn_basics.control_flow;

public class LearnConditionals {

//    >= 90 -> A
//    >= 80 & < 90 -> B
//    >= 70 & < 80 -> C

    public static void main(String[] args) {
        if (false) {
            System.out.println("Hello, world!");
        } else if (false) {
            System.out.println("Hello, universe!");
        } else {
            System.out.println("Hello, multiverse!");
        }

        System.out.println(isOld(20));
        System.out.println(isOld(67));


        String monthName = getMonthName(5);
        System.out.println(monthName); // May
    }

    public static boolean isOld(int age) {
        // Assuming age arg is between 1-100
        if (age < 67) {
            return false;
        }
        return true;
    }

    public static String getMonthName(int monthNum) {
        // Assume the monthNum arg is always 1-12
//        if (monthNum == 1) {
//            return "January";
//        } else if (monthNum == 2) {
//            return "February";
//        } else if (monthNum == 3) {
//            return "March";
//        } else if (monthNum == 4) {
//            return "April";
//        } else if (monthNum == 5) {
//            return "May";
//        } else if (monthNum == 6) {
//            return "June";
//        } else if (monthNum == 7) {
//            return "July";
//        } else if (monthNum == 8) {
//            return "August";
//        } else if (monthNum == 9) {
//            return "September";
//        } else if (monthNum == 10) {
//            return "October";
//        } else if (monthNum == 11) {
//            return "November";
//        } else {
//            return "December";
//        }

        switch(monthNum) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "ENTER A VALID VALUE, IDIOT";
        }

    }



}
