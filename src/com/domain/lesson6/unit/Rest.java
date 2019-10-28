package com.domain.lesson6.unit;

public interface Rest {
    void rest();

    default void escapeBattleField() {      // когда класс разширяет несколько инферфейсов
        System.out.println("Юнит сбежал с поля боя");
    }
}