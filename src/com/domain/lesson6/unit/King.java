package com.domain.lesson6.unit;

public class King extends Unit {


    public King(String name, int speed, int hp) {
        super(name, speed);
        this.hp = hp;
    }
    public void rest(){
        System.out.println("Король отдыхает");
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", speed=" + speed +
                '}';
    }
}