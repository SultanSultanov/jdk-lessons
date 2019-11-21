package lesson13;

public class ExceptionLesson {
    public static void main(String[] args) throws Exception {
        int a = 9;
        int b = 0;
        // System.out.println(a / b);   ArithmeticException: / by zero

        int[] arr = new int[3];
        // arr[10] = 44;   ArrayIndexOutOfBoundsException

        String string = null;
        //string.equals("str");   NullPointerException


        //   Integer.parseInt("string");   NumberFormatException

        Object someDAte = "123";
        // Integer someInt = (Integer) someDAte;   ClassCastException


        // try catch
        try {
            Integer someInt = (Integer) someDAte;
            System.out.println("код после ClassCastException");
        } catch (ClassCastException e) {
            System.out.println("catch ClassCastException");
            e.printStackTrace();
        }
        System.out.println("код после try catch");

        // объединение catch блоков
        try {

        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        // 2 вариант
        try {

        } catch (ClassCastException | ArithmeticException e) {
            e.printStackTrace();
        }
        // 3 вариант
        try {

        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            // используется для освобождения ресурсов
        }
        System.out.println("код после try catch");

        Message message = null;
        try {
            message = new Message("Title", "Text");
        } catch (CheckedException e){
            e.printStackTrace();
        }
        System.out.println(message);




    }
}
