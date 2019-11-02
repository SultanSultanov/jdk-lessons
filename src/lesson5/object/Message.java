package lesson5.object;

import java.time.LocalDateTime;

public final class Message { // final - это оператор от которого нельзя наследоваться
    public String from;
    private String to;
    private String text;
    private LocalDateTime dateSend;
    // для работы с датой и временем
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getDateSend() {
        return dateSend;
    }

    public Message(String from, String to, String text) {
        this.from = from;
        this.to = to;
        this.text = text;
        dateSend = LocalDateTime.now();


    }
}