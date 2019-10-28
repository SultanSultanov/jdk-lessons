package com.domain.lesson6.unit;

abstract public class Unit implements Rest {
    protected String name; // мы можем обратиться к свойству внутри данного класса и у его дочерних классов
    protected int hp;  //когда не указываем свойство это называется пекедж приват,т.е свойсто доступно внутри пакета
    protected int speed;

    public Unit(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    protected boolean isAlive() {
        return hp > 0;
    }

    public void run() {
        System.out.println("Юнит перемещается со скоростью " + speed);
    }

}
