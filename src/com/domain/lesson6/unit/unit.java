package com.domain.lesson6.unit;

public class unit {
    protected String name; // мы можем обратиться к свойству внутри данного класса и у его дочерних классов
    protected int hp;  //когда не указываем свойство это называется пекедж приват,т.е свойсто доступно внутри пакета
    protected int speed;

    public unit(String name, int hp) {
        setName(name);
        setHp(hp);
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
}
