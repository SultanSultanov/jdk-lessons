package com.domain.lesson6;

import com.domain.lesson6.unit.BattleUnit;
import com.domain.lesson6.unit.Doctor;
import com.domain.lesson6.unit.Knight;
import com.domain.lesson6.unit.Warrior;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите тип персонажа");

        String userChoice = in.nextLine();

        //warrior knight doctor

        BattleUnit battleUnit;
        if ("warrior".equals(userChoice)) {
            battleUnit = new Warrior("Воин", 3, 20, 15);
        } else if ("knight".equals(userChoice)) {
            battleUnit = new Knight("Рыцарь", 4, 22, 18);
        } else if ("doctor".equals(userChoice)) {
            battleUnit = new Doctor("Доктор", 2, 40, 5);
        }
    }
}
// ООП
// 1. наследование - для расширения функционала родителя
// 2. инкапсуляция - скрытие деталей реализации
// 3. абстракция - интерфейс и абстракцные классы
// 4. полиморфизм - работа через общий тип данных