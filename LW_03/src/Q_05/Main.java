package Q_05;

public class Main {
    public static void main(String[] args) {
        Course oop = new Course();
        Lecturer kumar = new Lecturer();
        Student sanga = new Student();

        oop.setCourseName("Object Oriented Programming");
        oop.setCourseCode("CTEC-22043");

        kumar.setLecturerName("Kumar Yadew");
        kumar.setCourseTeaching("Object Oriented Programming");

        sanga.setStudentName("Sangakkara");
        sanga.setDegreeName("information Communication Technology");
        sanga.setCourseFollowing("Object Oriented Programming");

        oop.setLecturerInCharge(kumar);

        System.out.println("Student details  ");
        System.out.println("\tStudent Name : "+sanga.getStudentName());
        System.out.println("\tDegree Name  : "+sanga.getDegreeName());
        System.out.println("\tCourse Name  : "+sanga.getCourseFollowing());

        System.out.println("\nCourse details");
        System.out.println("\tCourse Name        : "+oop.getCourseName());
        System.out.println("\tCourse Code        : "+oop.getCourseCode());
        System.out.println("\tLecturer In Charge : "+oop.getLecturerInCharge().getLecturerName());

    }
}
