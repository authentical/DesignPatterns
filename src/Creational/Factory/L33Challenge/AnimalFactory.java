package Creational.Factory.L33Challenge;

public class AnimalFactory extends AbstractAnimalFactory {


    @Override
    public Animal getAnimal(String animal) throws Exception {
        if(animal.equals(AnimalNames.TIGER)){

            return new Tiger();

        }else if(animal.equals(AnimalNames.RABBIT)){

            return new Rabbit();

        }else if(animal.equals(AnimalNames.TURTLE)){

            return new Turtle();

        } else {
            throw new Exception("Animal name: "+ animal + " cannot be instantiated.");
        }
    }

}
