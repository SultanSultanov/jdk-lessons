package lesson16;

import java.util.function.Consumer;

public class UserConsumer {
    public static void main(String[] args) {
        UserFactory<User> factory = User::new; // ссылка на конструктор
        User tom = factory.create("Tom", 44);

        Consumer<User> update = user -> {
            user.setAge(22);
            user.setName("Paul");
        } ;

        update.accept(tom);
    }
}

@FunctionalInterface
interface UserFactory<T extends User> {
    T create(String name, int age);
}


class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
}

