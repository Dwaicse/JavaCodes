import java.util.List;

public class PrintAllCourses {
    public static void main(String[] args) {
        List<String> courses = List.of("Docker", "Kubernates", "Java", "SpringBoot", "AWS", "Azure","Spring");
        //courses.forEach(System.out::println);
        //courses.stream().filter(a->a.contains("Spring")).forEach(System.out::println);
        courses.stream().filter(a->a.length()>3).forEach(System.out::println);
    }
}
