package lesson11.collection;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionLesson {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", 22);
        Student student2 = new Student("Ivan", "Ivanov", 22);
        Student student3 = new Student("Ivan", "Fedorov", 18);
        Student student4 = new Student("Alex", "Mihailov", 25);

        System.out.println("---LinkedList---");
        //связный список работает быстро, когда речь идет о вставке и удалении из середины списка
        // во всех остальных случаях необхоимо выбирать ArrayList
        // порядок элементов горантироан
        // можно хранить null
        // допускается хранить дублирующиеся элементы

        LinkedList<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        //   students.add(null);
        students.add(student4);

        System.out.println(students);
        System.out.println(students.get(0));
        // students.add(7,student3);             добавление на 7 позицию


        System.out.println("---ArrayList---");
        // порядок элементов горантироан
        // можно хранить null
        // допускается хранить дублирующиеся элементы
        ArrayList<Student> studentArrayList = new ArrayList<>(20);
        System.out.println(studentArrayList.size());
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(null);
        studentArrayList.add(student4);
        studentArrayList.trimToSize();
        System.out.println(studentArrayList);
        System.out.println(studentArrayList.subList(0, 2));

        // список из массивов
        Student[] studentsArr = {student1, student2, student3};
        studentArrayList.addAll(Arrays.asList(studentsArr));

        System.out.println(studentArrayList);
        System.out.println(studentArrayList.size());


        System.out.println("---HashSet---");
        // порядок элементов не может быть гарантирован
        // можно хранить null (null будет всегда на первом месте)

        HashSet<Student> studentHashSet = new HashSet<>(studentArrayList);
        System.out.println(studentHashSet.size());
        System.out.println(studentHashSet);


        System.out.println("---TreeSet---");
        // нельзя хранить null
        // элементы хранятся в отсартированном порядке


        // CLassCAstException
        TreeSet<Student> studentTreeSet = new TreeSet<>(Arrays.asList(studentsArr));
        studentTreeSet.add(student4);
        // задание сортировки:
        // 1 вариант: класс должен implements интерфейс Comparable
        System.out.println(studentTreeSet);


        // перебор коллекции
        for (Student student : students) {
            System.out.println(student);
//            System.out.println(student.getName());
        }

        students.removeIf(student -> student.getName().equals("Ivanov"));
        System.out.println(students);






    }
}
