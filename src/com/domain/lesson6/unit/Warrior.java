package com.domain.lesson6.unit;

public class Warrior extends BattleUnit {
    public Warrior(String name, int speed, int hp, int attackScore) {
        super(name, speed, hp, attackScore);
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println("Воин атаковал " + enemy.getName());
    }
    public void rest(){
        System.out.println("Воин отдыхает");
    }
}


// в интерфейсах мы перечиляем методы без реализации, которые должны быть реализованы в классах, расширяющих данный
// интерфейс