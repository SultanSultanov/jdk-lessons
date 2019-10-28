package com.domain.lesson6.unit;

public class Doctor extends BattleUnit {
    public Doctor(String name, int speed, int hp, int attackScore) {
        super(name, speed, hp, attackScore);
    }

    @Override
    public void attack(Unit friend) {
        System.out.println("Доктор увеличил очки здоровья" + friend.getName());
    }
    public void rest(){
        System.out.println("Доктор отдыхает");
    }
}
