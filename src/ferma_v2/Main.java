package ferma_v2;

import ferma_v2.homeAnimal.*;
import ferma_v2.wildAnimal.Bear;
import ferma_v2.wildAnimal.Fox;
import ferma_v2.wildAnimal.WildAnimal;
import ferma_v2.wildAnimal.Wolf;

public class Main {
    public static void main(String[] args) {

        Fermer fermer = new Fermer("Vasia", 50);

        Chicken chicken = new Chicken("koko", 3, 13, 30, 5);
        Cow cow = new Cow("mymy", 40, 5, 50, 10);
        Cat cat = new Cat("pushok", 5, 15, 30, 0);
        Rabbit rabbit = new Rabbit("rabbit", 7, 18, 30, 0);

        Fox fox = new Fox("Liza", 20, 20, 10);
        Bear bear = new Bear("Misha", 50, 11, 12);
        Wolf wolf = new Wolf("Volodia", 25, 17, 13);

        Ferma ferma = new Ferma();
        ferma.addHomeAnimals(cat);
        ferma.addHomeAnimals(cow);
        ferma.addHomeAnimals(chicken);
        ferma.addHomeAnimals(rabbit);

        ferma.addWildAnimals(fox);
        ferma.addWildAnimals(bear);
        ferma.addWildAnimals(wolf);

        ferma.addFermer(fermer);



        for (int i = 1; ;i++) {
            fermer.resFermer = fermer.resFermer - 10; // фермер тратит ресурсы
            System.out.println("День" + i);

            if (fermer.resFermer < 0) {   // првоерка осталось ли ресурсов у фермера для продолжения
                System.out.println("У фермера закончились ресурсы. Конец!!!");
                return;
            }
            WildAnimal randomnoeDikoeGivotnoe = ferma.getRandomWildAnimal(ferma.getWildAnimals()); // рандомное дикое
            HomeAnimal randomoneDomashneeGivotnoe = ferma.getRandomHomeAnimal(ferma.getHomeAnimals());  // рандомное домашнее
            fermer.gonit  = ferma.getRandomBoolean();

            if (fermer.gonit == false) {
                if (randomnoeDikoeGivotnoe.speed > randomoneDomashneeGivotnoe.speed){
                randomoneDomashneeGivotnoe.setHp(randomoneDomashneeGivotnoe.getHp() - randomnoeDikoeGivotnoe.getDmg()); // дикое бьет домашее животное
            }}


            chicken.Kormlenie();   // кормим животных
            cow.Kormlenie();
            cat.Kormlenie();
            rabbit.Kormlenie();







            if (chicken.getHp() > 0){
                fermer.CollectRes(chicken);} // фермер собирает ресурсы
            if (cow.getHp() > 0) {
                fermer.CollectRes(cow);
            }

            System.out.println();
        }
    }
}