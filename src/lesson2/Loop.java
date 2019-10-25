package lesson2;

import javax.swing.*;
import java.util.Scanner;

public class Loop {


    public static void main(String[] args) {
        //         цикл while

//          while (условие)    выполняется до тех пор пока условие не будет ложным
//         тело цикла;
//        if (условие) break; позволяет выйти из цикла
//        if (условие) continue; позволяет перейти на следующую итерацию


        // программа загадывает число в диапазоне [1;5]
        // пользовалеть вводит числло
        // программа в зависимости от того что ввел пользователь
        // выводит следующее
        // 1. загаданое число меньше
        // 2. загаданое число больше
        // 3. вы угадали
        // 0 для выхода из программы

        int programNum = (int) (Math.random() * 5) + 1;
        Scanner in = new Scanner(System.in);
        while (true) {

            System.out.println("Введите число");
            int scan = in.nextInt();
            if (scan == 0) {
                System.out.println("Вы выходите из программы,");
                break;
            } else if (scan < programNum) {
                System.out.println("Вы ввели меньшее значение,");
            } else if (scan > programNum) {
                System.out.println("Вы ввели большее значение,");
            } else {
                System.out.println("Вы угадали");
                break;
            }

        }


        //  Цикл do while
//  do {
//        тело цикла
//    } while (условие);

//    do {
//        System.out.println("Итерация цикла do while");
//    } while (false);

        // наибольший общий делитель НОД
        // цил for
        int n = 5;
        int res = 1;
        for (int i = 1; i < n; i++) {
            res *= i;
        }
        System.out.println(res);
    }

//     loopName: while(condition)
//         while(condition)
//             break loopName;


}
