package homework;

import java.util.Scanner;

public class homework {


    public static void main(String[] args) {
       homework1();
       homework2();
       homework3();
    }

    private static void homework1() {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = s.nextInt();
        System.out.print("Введите второе число: ");
        int b = s.nextInt();

        for (; ; ) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            if (a == 0) {
                System.out.println("НОД = " + b);
                break;
            }
            if (b == 0) {
                System.out.println("НОД = " + a);
                break;
            }
        }

    }

    private static void homework2() {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число: ");
        int d = s.nextInt();
        StringBuilder str = new StringBuilder();

        int x = 1;
        for (int i = 0; i < d; i++) {
            str.append((d & x) == 0 ? "0" : "1");
            x <<= 1;
        }

        System.out.println("Результат = " + str.reverse());

    }

    private static void homework3() {
        int arr[] = {1, 3, 5, 4, 2, 9, 6, 7, 8};

        for (int i = 0; i < arr.length; i++) {
           for (int x = 0; x < arr.length; x++){

               if (arr[i]+arr[x]==7){
                   System.out.printf("%d %d\n", arr[i],arr[x]);


               }
           }
        }
    }
}