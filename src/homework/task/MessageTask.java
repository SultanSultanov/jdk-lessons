package homework.task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        Map<MessagePriority, Integer> messegePrioritet = new HashMap<>();
        Integer count = 0;
        for (Message item : messageList) {
            if (messegePrioritet.containsKey(item.getPriority())){
                count = messegePrioritet.get(item.getPriority()) + 1;
            }else {
                count = 1;
            }
            messegePrioritet.put(item.getPriority(), count);

        }
        System.out.println(messegePrioritet);
    }

    // TODO:  Подсчитать количество сообщений для каждого приоритела
    //  Ответ в консоль

    public static void countEachCode(List<Message> messageList) {
        Map<MessagePriority, Integer> messagePriorityIntegerMap = new HashMap<>();

        }
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль


    private static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return messageList;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
    }

    public static void main(String[] args) {
       countEachPriority(MessageGenerator.generate(10));


    }
}