import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Student linda = new Student("Linda", Gender.FEMALE);
        Student bob = new Student("Bob", Gender.MALE);
        Student solider = new Student("Solider", Gender.MALE);
        Student cindy = new Student("Cindy", Gender.FEMALE);

        ArrayList<Student> students = new ArrayList<>();
        students.add(linda);
        students.add(bob);
        students.add(solider);
        students.add(cindy);

        for (Student student : students) {
            if (student.getGender() == Gender.FEMALE) {
                System.out.println(student);
            }
        }
    }

}
