package com.domain.lesson6.unit;

public class Knight extends BattleUnit {
    public Knight(String name, int speed, int hp, int attackScore) {
        super(name, speed, hp, attackScore);
    }

    @Override
    public void attack(Unit enemy) {
        System.out.println("Рыцарь атаковал " + enemy.getName());
    }
    public void rest(){
        System.out.println("Рыцарь отдыхает");
    }
}
