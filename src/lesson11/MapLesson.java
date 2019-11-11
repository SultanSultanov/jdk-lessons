package lesson11;

import java.util.*;

public class MapLesson {
    public static void main(String[] args) {
        User user1 = new User("qwe", "123", Role.USER);
        User user2 = new User("asd", "345", Role.ADMIN);
        User user3 = new User("zxc", "968", Role.USER);
        User user4 = new User("rty", "345", Role.ADMIN);

        System.out.println("---GashMap---");
        // для объектов, которые используются в качестве ключей обязательно
        // должны быть переопределены метод equalse  и hasCode
        // null можно использовать в качествее ключа

        HashMap<String, User> userHashMap = new HashMap<>();
        userHashMap.put(user1.getLogin(), user1);
        userHashMap.put(user2.getLogin(), user2);
        userHashMap.put(user3.getLogin(), user3);
        userHashMap.put(user4.getLogin(), user4);
        userHashMap.put(null, null);


        userHashMap.remove("zxc");
        userHashMap.remove("htr");

        System.out.println(userHashMap);
        System.out.println(userHashMap.get("asd"));
        System.out.println(userHashMap.get("hhh"));

        // перебор
        for (Map.Entry<String, User> entry : userHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("---EnumMap---");
        // enum используется в качетсве ключей
        // null нельзя исполюзовать в качестве ключа
        EnumMap<Role, ArrayList<User>> enumMap = new EnumMap<>(Role.class);
        enumMap.put(Role.USER, new ArrayList<>(Arrays.asList(user1, user3)));
        enumMap.put(Role.ADMIN, new ArrayList<>(Arrays.asList(user2, user4)));

        System.out.println(enumMap);
        System.out.println(enumMap.get(Role.USER));

        User user5 = new User("newUser", "444", Role.USER);
        enumMap.get(user5.getRole()).add(user5);



    }
}
