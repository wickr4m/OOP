package Q_05;

public class Course {

    private String courseName,courseCode;
    Lecturer lecturerInCharge = new Lecturer();

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturerInCharge() {
        return lecturerInCharge;
    }

    public void setLecturerInCharge(Lecturer lecturerInCharge) {
        this.lecturerInCharge = lecturerInCharge;
    }
}
