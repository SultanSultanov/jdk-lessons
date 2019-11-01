package object;

public class Writer {

    public final String ip;// = "444.444.444";  значение final переменной не можем изменить

    public Writer(String ip){
        this.ip = ip;
    }
    // когда final перед методом, метод не может быть переопределен через дочерний класс
    public final void sendMessage(final Message message) {// final аргументы доступны только для чтения
        message.from = "new from";
        System.out.println("Отправка сообщений ... " + "от: " + message.getFrom() +
                "для: " + message.getTo() + " " + message.getDateSend());



    }
}
