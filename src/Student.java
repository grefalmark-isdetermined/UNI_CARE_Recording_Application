import java.io.File;

abstract class Student {
    private String studentLastName, studentFirstName, studentMiddleName, studentProgram, studentYearLevel;
    private final String studentId;

    public Student(String lastName, String firstName, String middleName, String studentId, String studentProgram, String studentYearLevel) {
        this.studentLastName = lastName;
        this.studentFirstName = firstName;
        this.studentMiddleName = middleName;
        this.studentId = studentId;
        this.studentProgram = studentProgram;
        this.studentYearLevel = studentYearLevel;
    }

    //Getters
    String getFirstName() { return this.studentFirstName; }
    String getLastName() { return this.studentLastName; }
    String getMiddleName() { return this.studentMiddleName; }
    char getShortMiddleName() { 
        return (this.studentMiddleName != null && !this.studentMiddleName.isEmpty()) 
                ? this.studentMiddleName.charAt(0) 
                : ' '; 
    }

    String getStudentProgram() { return this.studentProgram; }
    String getYearLevel() { return this.studentYearLevel; }
    String getStudentId() { return this.studentId; }

    String getComplete() {
        return this.studentLastName + ", " + this.studentFirstName + " " + getShortMiddleName() + ".";
    }

    //Setters
    void setStudentProgram(String studentProgram) { this.studentProgram = studentProgram; }
    void setStudentYearLevel(String studentYearLevel) { this.studentYearLevel = studentYearLevel; }
    void setStudentName(String lastN, String firstN, String middleN) {
        this.studentFirstName = firstN;
        this.studentLastName = lastN;
        this.studentMiddleName = middleN;
    }

    //Abstract methods 
    abstract String toFileString();
    abstract File fromFileString();
}