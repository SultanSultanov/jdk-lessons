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

        Fox fox = new Fox("Liza", 20, 20, 14);
        Bear bear = new Bear("Misha", 50, 11, 15);
        Wolf wolf = new Wolf("Volodia", 25, 17, 11);

        Ferma ferma = new Ferma();
        ferma.addHomeAnimals(cat);
        ferma.addHomeAnimals(cow);
        ferma.addHomeAnimals(chicken);
        ferma.addHomeAnimals(rabbit);

        ferma.addWildAnimals(fox);
        ferma.addWildAnimals(bear);
        ferma.addWildAnimals(wolf);

        ferma.addFermer(fermer);


        for (int i = 1; ; i++) {
            fermer.resFermer = fermer.resFermer - 10; // фермер тратит ресурсы

            if (fermer.resFermer <= 0){
                System.out.println("Ресурсы кончились. Конец! :(");
                return;
            }


            System.out.println("День " + i + ". Живём");

            WildAnimal randomnoeDikoeGivotnoe = ferma.getRandomWildAnimal(ferma.getWildAnimals()); // рандомное дикое

            HomeAnimal randomoneDomashneeGivotnoe = ferma.getRandomHomeAnimal(ferma.getHomeAnimals());  // рандомное домашнее

            for (; randomoneDomashneeGivotnoe.getHp() <= 0; ) {  // првоерка хп домашнего животного
                randomoneDomashneeGivotnoe = ferma.getRandomHomeAnimal(ferma.getHomeAnimals());
                if (randomoneDomashneeGivotnoe.getHp() > 0) return;
            }


            fermer.gonit = ferma.getRandomBoolean();
            if (!fermer.gonit) {                               // дикое бьет домашее животное
                if (randomnoeDikoeGivotnoe.speed > randomoneDomashneeGivotnoe.speed) {
                    if (randomoneDomashneeGivotnoe.getHp() > 0) {
                        randomoneDomashneeGivotnoe.setHp(randomoneDomashneeGivotnoe.getHp() - randomnoeDikoeGivotnoe.getDmg());
                    }
                }
            }


            if (chicken.getHp() > 0) {
                chicken.Kormlenie();   // кормим животных
            }
            if (cow.getHp() > 0) {
                cow.Kormlenie();
            }
            if (cat.getHp() > 0) {
                cat.Kormlenie();
            }
            if (rabbit.getHp() > 0) {
                rabbit.Kormlenie();
            }


            for (; randomoneDomashneeGivotnoe.getHp() <= 0; ) {  // првоерка хп домашнего животного
                randomoneDomashneeGivotnoe = ferma.getRandomHomeAnimal(ferma.getHomeAnimals());
                if (randomoneDomashneeGivotnoe.getHp() > 0) return;
            }


            if (chicken.getHp() + cow.getHp() < 0) {              // првоерка хп ресурсных животных, если меньше 0, то съедаем рандомное
                fermer.resFermer += randomoneDomashneeGivotnoe.getHp();
            }


            if (chicken.getHp() > 0) {      // фермер собирает ресурсы
                fermer.CollectRes(chicken);
            }
            if (cow.getHp() > 0) {
                fermer.CollectRes(cow);
            }

            System.out.println();
        }
    }
}
