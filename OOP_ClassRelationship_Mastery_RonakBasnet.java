/**
 * File: [OOP_ClassRelationship_Mastery_RonakBasnet].
 * By: [Ronak Basnet]
 * Date: [3/31/2024]
 * Description: [This program prints OOP Part D]
 */

public class OOP_ClassRelationship_Mastery_RonakBasnet {
    public static void main(String[]args) {


        Jungle jungle = new Jungle();
        jungle.getLake();
        jungle.getGrass();
        jungle.getTrees();


        Tiger tiger = new Tiger();
        tiger.jungle();

        Wolf wolf = new Wolf();
        wolf.jungle();

        Snake snake = new Snake();
        snake.jungle();

        Crocodile crocodile = new Crocodile();
        crocodile.jungle();

        Fox fox = new Fox();
        fox.jungle();

        Bison bison = new Bison();
        bison.Jungle();

        Eagle eagle = new Eagle();
        eagle.Jungle();

        Carnivorous carnivorous = new Carnivorous();
        carnivorous.animalTraits();

        Lion lion = new Lion();
        lion.lionTraits();

        HungryLion hungryLion = new HungryLion();
        hungryLion.hungryLion();




    }
}

