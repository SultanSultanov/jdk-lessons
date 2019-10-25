package lesson2;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArreysLesson {
    public static void main(String[] args) {
        //  Массив - это набор данных определенного типа
        // ОБъявление массива
        int[] arr;
        int arr1[];

        arr = new int[5]; //  объявляем массив в котором будет 5 элементов, размер массива изменить няльзя
        System.out.println(Arrays.toString(arr)); // вывести все значения массива
        System.out.println("Размер массива: " + arr.length); // свойство с помошью которого можно узнать длину массива

        int[] arr2 = {5, 67, 12, -12, 0, 1};// наполнение массива при иницилизации

        // доступ к элементам массива
        System.out.println(arr2[3]); // 12
        System.out.println(arr2[1 + 2]); // -12
        // System.out.println(arr[15]);

        arr2[1] = 853;
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {23, 78, 12};
        int[] arr4 = arr3; // это не копия, это ссылка!!

        int[] cloneArr = arr3.clone(); // это копия!

        System.out.println(Arrays.toString(cloneArr));

        int[] arr5 = new int[15];
        System.arraycopy(arr3, 1, arr5, 3, 1);
        System.out.println(Arrays.toString(arr5));


        int[] copyArr = Arrays.copyOf(arr3, 7);
        System.out.println(Arrays.toString(copyArr));

        // перебор массива
        for (int elem : arr3) {
            elem *= 2;
            System.out.println(elem);
        }

        //Сравнение массивов
        arr3 = new int[]{2, 47, 123};
        arr4 = new int[]{2, 47, 123};

        System.out.println(Arrays.equals(arr3, arr4));

        // Сортировка массивов
        arr4 = new int[]{2, 47, 123, -304, 0, 13};
        Arrays.sort(arr4); // Arrays.sort(arr4, 1, 5) сортировка от 1 до 5 элемента
        // быстрая сортировка , сложность - О(n log n)

        // бинарный поиск - это поиск элесента в массиве
        arr4 = new int[]{2, 67, 123, -304, 0, 13};
        System.out.println(Arrays.binarySearch(arr4, 67));
        System.out.println(Arrays.binarySearch(arr4, 14));

        // О(1) - константное время
        // О (log n) - логорифмическая сложность
        // считается высокоэффективным
        // О (т) - линейная сложность
        // O (n log n) - квазилорифмическая сложность

    }

}

