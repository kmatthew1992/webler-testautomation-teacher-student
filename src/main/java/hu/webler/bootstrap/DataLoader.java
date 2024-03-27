package hu.webler.bootstrap;

import hu.webler.model.Course;
import hu.webler.model.Student;
import hu.webler.model.Teacher;
import hu.webler.value.Gender;

public class DataLoader {

    public static void loadData() {

        Course javaCourse = new Course("Java Programming");
        Student student = new Student("John", "Karl", "Doe", Gender.MALE, 2000);
        System.out.println(student);
        String learning = student.doSomething();
        System.out.println(learning);
        Teacher teacher = new Teacher("Csaba", null, "Vadász", Gender.MALE);
        System.out.println(teacher);
        String teaching = teacher.doSomething();
        System.out.println(teaching);
        System.out.println("------------");
        javaCourse.addStudent(student);
        javaCourse.printStudentList(javaCourse);
        javaCourse.addStudent(student);
        javaCourse.printStudentList(javaCourse);
        Student szandi = new Student("Szandi", null, "Leopold", Gender.FEMALE, 1990);
        javaCourse.addStudent(szandi);
        System.out.println(javaCourse);
        Student csaba = new Student("Csaba", null, "Vadász", Gender.MALE, 1979);
        javaCourse.addStudent(csaba);
        System.out.println(javaCourse);
        javaCourse.removeStudent(csaba);
        System.out.println(javaCourse);
    }
}