package Creational.Factory.L33Challenge;

public class L33Challenge {

    public static void main(String[] args) throws Exception{



        AbstractAnimalFactory factory = new AnimalFactory();


        Animal animal_1 = factory.getAnimal(AnimalNames.TIGER);

        animal_1.poke();

        Animal animal_2 = factory.getAnimal(AnimalNames.RABBIT);

        animal_2.poke();

        Animal animal_3 = factory.getAnimal(AnimalNames.TURTLE);

        animal_3.poke();


    }
}
