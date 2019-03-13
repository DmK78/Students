package Student;

public class Student {
    private int id;
    private String faculty;
    private String surname;
    private String name;
    private String avrGradePoint;

    public Student() {
    }

    public Student(int id, String faculty, String surname, String name, String avrGradePoint) {
        this.id = id;
        this.faculty = faculty;
        this.surname = surname;
        this.name = name;
        this.avrGradePoint = avrGradePoint;
    }

    public Student(String faculty, String surname, String name, String avrGradePoint) {
        this.faculty = faculty;
        this.surname = surname;
        this.name = name;
        this.avrGradePoint = avrGradePoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvrGradePoint() {
        return avrGradePoint;
    }

    public void setAvrGradePoint(String avrGradePoint) {
        this.avrGradePoint = avrGradePoint;
    }
}
