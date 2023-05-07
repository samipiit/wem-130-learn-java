package learn_basics.oops.encapsulation;

public class Student {

    public Student(String studentFirstName, String studentLastName, int studentAge, String studentId, String batchNum,
                   String studentAddress, int studentSSN) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        setStudentAge(studentAge);
        this.studentId = studentId;
        this.batchNum = batchNum;
        this.studentAddress = studentAddress;
        this.studentSSN = studentSSN;
    }

    private String studentFirstName;
    private String studentLastName;
    private int studentAge;
    private String studentId;
    private String batchNum;
    private String studentAddress;
    private int studentSSN;

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        if (studentAge >= 0) {
            this.studentAge = studentAge;
        } else {
            this.studentAge = 1;
        }
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentSSN(int studentSSN) {
        this.studentSSN = studentSSN;
    }

    public String getStudentName() {
        return this.studentFirstName + " " + this.studentLastName;
    }
}