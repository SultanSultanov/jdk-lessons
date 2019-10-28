package com.domain.lesson6.unit;

public interface AttackAble { // на основе интерфейса нельзя создать объект, все методы без реализации в интерфесе
    void attack(Unit enemy);  // по умолчанию публичные, реализация это {все, что здесь написано}
    // начиная с 9 версии доступно модификатор прайм

    default void escapeBattleField(){
        System.out.println("Юнит сбежал с поля боя");
    }
}
