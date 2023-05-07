package learn_basics.oops.encapsulation;

public class MainClass {

    public static void main(String[] args) {
        Student student1 = new Student("Abdul", "Awal", 34, "8680PA",
                "WEM-130", "123 Main St, Philadelphia PA 12345", 123456789);

        System.out.println(student1.getStudentFirstName());

        student1.setStudentFirstName("Mustapha");

        System.out.println(student1.getStudentFirstName());

        student1.setStudentSSN(987654321);

        System.out.println(student1.getStudentName());

        System.out.println(student1.getStudentAge()); // 1

    }

}
