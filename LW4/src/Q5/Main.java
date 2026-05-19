package Q5;

public class Main {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Dr. Nimal Silva");
        lecturer.setCourseTeaching("Object Oriented Programming");

        Course course = new Course();
        course.setCourseName("Object Oriented Programming");
        course.setCourseCode("CS204");
        course.setLecturer(lecturer);

        Student student = new Student();
        student.setStudentName("Kavindu Fernando");
        student.setDegreeName("BSc in Computer Science");
        student.setCourseFollowing(course.getCourseName());

        System.out.println("Course Registration Details");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());
        System.out.println("Teaching: " + course.getLecturer().getCourseTeaching());
        System.out.println("Student: " + student.getStudentName());
        System.out.println("Degree: " + student.getDegreeName());
        System.out.println("Following: " + student.getCourseFollowing());
    }
}
