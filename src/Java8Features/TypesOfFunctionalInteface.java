package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TypesOfFunctionalInteface {
    public static void main(String[] args) {
        Student s1 = new Student("Mary", 90, 8);
        Student s2 = new Student("George", 85, 7);
        Student s3 = new Student("Kevin", 70, 8);
        Student s4 = new Student("Kale", 75, 7);
        Student s5 = new Student("Gini", 99, 8);
        Student s6 = new Student("Harry", 80, 7);

        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6);

        //Predicate example
        Predicate<Student> isTopper = (Student s) -> s.marks>=85;
        List<Student> topperStudents = students.stream().filter(isTopper).collect(Collectors.toList());

        System.out.println("Topper Students are: ");
        topperStudents.forEach(s-> System.out.println(s.name));
        System.out.println("----------------------------------------------");

        //Consumer example
        Consumer<Student> c = (Student s)-> System.out.println(s.name.toUpperCase());
        for(Student s: students){
            c.accept(s);
        }
        System.out.println("----------------------------------------------");
        //Function Example
        Function<Student,String> func = (Student s)-> s.name + " TOPPER";
        for(Student s: students){
            if(isTopper.test(s))
                s.name = func.apply(s);
        }
        System.out.println("----------------------------------------------");
        //Supplier Example get()
        Student student_with_highest_marks = students.stream().filter(s->s.marks == 99).findFirst().get();

        System.out.println("Student with highest marks is:  "+student_with_highest_marks.name);
    }
}

class Student{
    String name;
    float marks;
    int standard;

    public Student(String name, float marks, int standard) {
        this.name = name;
        this.marks = marks;
        this.standard = standard;
    }

}
