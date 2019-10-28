package com.domain.lesson6.unit;

public abstract class BattleUnit extends Unit implements AttackAble {//наследственность реализуется связью extends

    protected int attackScore;

    public BattleUnit(String name, int speed, int hp, int attackScore) {
        super(name, speed); // вызов конструктора родителя
        this.hp = hp;
        this.attackScore = attackScore;


    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    @Override
    public String toString() {
        return "BattleUnit{" +
                "attackScore=" + attackScore +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void attack(Unit enemy) {

    }

    @Override
    public void rest() {

    }

    @Override
    public void escapeBattleField() {
        System.out.println("Юнит" + this.name + " сбежал с поля боя");

    }
}
