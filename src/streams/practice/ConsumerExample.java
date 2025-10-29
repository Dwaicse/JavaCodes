package streams.practice;

import streams.practice.data.Student;
import streams.practice.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = student -> System.out.print(student.getName());  // I created the consumer here.
    static Consumer<Student> c3 = student -> System.out.println(student.getActivities());
    static Consumer<Student> c4 = student -> System.out.println(student.getActivities());

    public static void printName(){

        List<Student> studentList = StudentDataBase.getAllStudents();
       // studentList.forEach(System.out::println);
        studentList.forEach(c2); // Use this for the forEach as forEach accepts a consumer.
    }

    public static void printNameandActivities() {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4));

    }

    public static void printNameandActivitiesUsingCondition() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
                c3.andThen(c4).andThen(c2).accept(student);
            }
        }));

    }


    public static void main(String[] args) {
        //printName();
        //printNameandActivities();
        printNameandActivitiesUsingCondition();
    }
}
