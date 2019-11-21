package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTask {

    // хранит логин и город проживания
    // написать метод который принемает на вход мапи и город
    // и формирует список логинов. которые соответствуют переданному городу
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("qwe", "Tambov");
        map.put("asd", "Tambov");
        map.put("rty", "Tambov");
        map.put("gre", "Moscow");
        map.put("trh", "Maadan");
        String city = "Tambov";

        System.out.println(getPeopleCity(map, city));
        //-----------------------------------------------------------------------------------------\\

        HashMap<String, Integer> qwe = new HashMap<>();
        qwe.put("qwe", 12);
        qwe.put("ter", 15);
        qwe.put("hrt", 19);
        qwe.put("jty", 25);
        qwe.put("ngf", 43);

        System.out.println(getNewAgeMap(qwe, 16, 30));
        //-----------------------------------------------------------------------------------------\\

        List<String> words = new ArrayList<>();
        words.add("HELLO");
        words.add("HELLO");
        words.add("HELLO");
        words.add("HELLO1");
        words.add("HELLO");
        words.add("HELLO3");
        words.add("HELLO");
        words.add("HELLO2");
        words.add("HELLO");
        words.add("HELLO");

        System.out.println(getWordsCount(words));


    }

    public static List<String> getPeopleCity(Map<String, String> map, String city) {
        List<String> logins = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(city)) {
                logins.add(entry.getKey());
            }
        }
        return logins;
    }

    public static Map<String, Integer> getNewAgeMap(Map<String, Integer> map, int from, int to) {
        Map<String, Integer> newMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > from && entry.getValue() < to) {
                newMap.put(entry.getKey(), entry.getValue());
            }
        }
        return newMap;
    }

    public static Map<String, Integer> getWordsCount(List<String> words) {
        Map<String, Integer> newMap = new HashMap<>();
        for (String word : words) {
            if (newMap.containsKey(word)) {
                newMap.put(word, newMap.get(word) + 1);
            } else {
                newMap.put(word, 1);
            }
        }
        return newMap;
    }

}

