import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        Student student = new Student("Kenny", 23, 140);

        Person person = student;
        Object object = student;

        System.out.print(student + ", ");
        System.out.print(person + ", ");
        System.out.println(object);
    }
}
