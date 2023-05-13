package learn_basics.control_flow;

public class LearnConditionals {

//    >= 90 -> A
//    >= 80 & < 90 -> B
//    >= 70 & < 80 -> C

    public static void main(String[] args) {
        if (true) {
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
        } else {
            return true;
        }
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

        String monthName;

        switch(monthNum) {
            case 1:
//                monthName = "January";
//                break;
                return "January";
            case 2:
//                monthName = "February";
//                break;
                return "February";
            case 3:
//                monthName = "March";
//                break;
                return "March";

            case 4:
//                monthName = "April";
//                break;
                return "April";
            case 5:
//                monthName = "May";
//                break;
                return "May";
            case 6:
//                monthName = "June";
//                break;
                return "June";
            case 7:
//                monthName = "July";
//                break;
                return "July";
            case 8:
//                monthName = "August";
//                break;
                return "August";
            case 9:
//                monthName = "September";
//                break;
                return "September";
            case 10:
//                monthName = "October";
//                break;
                return "October";
            case 11:
//                monthName = "November";
//                break;
                return "November";
            case 12:
//                monthName = "December";
//                break;
                return "December";
            default:
                return "ENTER A VALID VALUE, IDIOT";
//                monthName = "";
        }

//        return monthName;

    }



}
