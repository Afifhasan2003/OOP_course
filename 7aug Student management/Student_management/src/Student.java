import java.util.Objects;

public class Student {
    private int studentId;
    private String studentName;
    private String major;

    public Student(int studentId, String studentName, String major) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "studentId=" + studentId + ", studentName=" + studentName  +", major='" + major ;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null)return false;
        if (this == object) return true;
        if (getClass() != object.getClass()) return false;
        
        Student studentq = (Student) object;
        return this.studentId == studentq.getStudentId() && Objects.equals(this.studentName, studentq.getStudentName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentId);
    }

}
