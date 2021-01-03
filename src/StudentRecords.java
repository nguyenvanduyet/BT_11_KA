import org.omg.CORBA.StringHolder;

public class StudentRecords {
    private Student student;
    private String classS;
    private String course;
    private int semester;

    public StudentRecords(Student student, String classS, String course, int semester) {
        this.student = student;
        this.classS = classS;
        this.course = course;
        this.semester = semester;
    }

    public Student getStudent() {
        return student;
    }

    public String getClassS() {
        return classS;
    }

    @Override
    public String toString() {
        return "StudentRecords{" +
                "student=" + student +
                ", classS='" + classS + '\'' +
                ", course='" + course + '\'' +
                ", semester=" + semester +
                '}';
    }
}
