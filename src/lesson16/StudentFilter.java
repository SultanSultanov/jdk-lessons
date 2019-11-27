package lesson16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StudentFilter {
    public static void main(String[] args) {
        // фильтры:
        // 1. по стране (например, студенты из России)
        // 2. старше 30
        // 3. старше 30 и по стране (например, студенты из России)

        Student student1 = new Student("Tom", 25, "Canada");
        Student student2 = new Student("Tim", 33, "Russia");
        Student student3 = new Student("Alex", 19, "China");
        Student student4 = new Student("Robert", 36, "Russia");
        Student student5 = new Student("Paul", 30, "China");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        University university = new University(students);

        Predicate<Student> russiaFilter = rus -> "Russia".equals(rus.getCountry());
        System.out.println(university.getFilterStudents(russiaFilter));

        Predicate<Student> thirtyFilter = age -> 30 <= age.getAge();
        System.out.println(university.getFilterStudents(thirtyFilter));

        System.out.println(university.getFilterStudents(russiaFilter.and(thirtyFilter)));


        Comparator<Student> byName = (std1, std2) -> std1.getName().compareTo(std2.getName());
        byName = Comparator.comparing(Student::getName);
        students.sort(byName);

        Comparator<Student> byAge = Comparator.comparing(Student::getAge);
        students.sort(byAge);





    }

}

class University{
    private List<Student> studentList;

    public University(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getFilterStudents(Predicate<Student> filter) {
        List<Student> students = new ArrayList<>();
        for (Student student: studentList){
            if (filter.test(student)){
                students.add(student);
            }
        }

        return students;
    }
}

class Student {
    private String name;
    private int age;
    private String country;

    public Student(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}