package lesson17;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        // StreamAPI начиная с 8 версии
        // Для работы с потоками данных
        // промежуточные операции обрабатывают данные и возвращают stream объект
        // терминальные, не возвращают stream объект и завершает цепочку
        // stream.metod1.metod2.metod3.терминальный

        // методы получения стрим объектов
        // из коллекций collection.stream();
        // из массива Arrays.stream(массив);
        // из файла Files.lines(path_to_file);
        // из строки string.chars();
        // используя builder
        // Stream.builder().add(obj).add(obj2).add(objN).build();
        // Stream.of(1, 4, 7);

        Stream<Integer> integerStream = Stream.of(6, 8, 90, -34, 0, -12);
        integerStream.filter(num -> num < 0).map(num -> num * 10).limit(1).forEach(System.out::println);

        integerStream = Stream.of(5, 7, 89, 89, 21, 34, 21, -89);
        integerStream.distinct().sorted().forEach(System.out::println);

        //annMatch | allMatch | noneMatch


        // возвращает true если хотя бы один элемент из потока соотвествует условию
        integerStream = Stream.of(6, 8, 90, -34, 0, -12);
        System.out.println(integerStream.anyMatch(num -> num == 0));


        // возвращает true если все элементы соотвествуют условию
        integerStream = Stream.of(6, 8, 90, -34, 0, -12);
        System.out.println(integerStream.allMatch(num -> num == 0));

        String[] stringArr = {"aa", "bb", "cc", "dd"};

        //findFirst | findAny


        // findFirst берет первый возвращает объект типо Optional
        Arrays.stream(stringArr).findFirst().get();  // Optional<T>
        Arrays.stream(stringArr).findFirst().orElse("default");  // Optional<T>
        Arrays.stream(stringArr).findFirst().isPresent();
        // findAny берет любой и возвращает объекст типа Optional


        // skip пропускает указанное количество элементов
        Arrays.stream(stringArr)
                .skip(2).filter(str -> str.startsWith("c"))
                .forEach(System.out::println);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("qwe", 34));
        users.add(new User("asd", 56));
        users.add(new User("zxc", 18));
        users.add(new User("qwe", 34));
        users.add(new User("tyu", 22));

        // массив пользователей старше 25
        User[] userArr = users.stream().filter(user -> user.getAge() > 25)
                .toArray(User[]::new); // new User[]


        List<User> userList = users.stream()
                .filter(user -> user.getAge() > 25)
                .peek(user -> user.setActive(true))
                .collect(Collectors.toList()); // получим List

        Set<User> userSet = users.stream()
                .filter(user -> user.getAge() > 25)
                .collect(Collectors.toSet()); // получим Set

        ArrayList<User> userArrayLists = users.stream()
                .distinct()
                .filter(user -> user.getAge() > 25)
                .sorted(Comparator.comparing(User::getAge)) // сортировка по возрасту
                .collect(Collectors.toCollection(ArrayList::new)); // к конкретной колекции, передать колекцию

        users.stream().min(Comparator.comparing(User::getName)).orElse(new User("default", 0));
        // вернет обект с минимальным значением

        users.stream().max(Comparator.comparing(User::getName)).orElse(new User("default", 100));

        String[] stringArr2 = {"aaa", "cc", "cc", "dddd", "f"};

        Map<String, Integer> map = Arrays.stream(stringArr2)
                .collect(Collectors.toMap(
                        Function.identity(), // формирование ключей
                        String::length, // формирование значений
                        (item1, item2) -> item1)); // выбор при повторе ключей


    }
}

class User {
    private String name;
    private Integer age;
    private boolean active;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return active == user.active &&
                Objects.equals(name, user.name) &&
                Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, active);
    }
}

