import model.Student;

public class Main {

    public static void main (String[] args){
        // Import modelStudent and create new Student.
        Student student = new Student();

        // Setting the attributes of the Student
        student.setStudentName("CHARLIE BORBE");
        student.setStudentAge(22);
        student.setStudentGender("MALE");
        student.setStudentIdNo(12345689);

        // Printing the attributes of Student
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentAge());
        System.out.println(student.getStudentGender());
        System.out.println(student.getStudentIdNo());
    }

}
