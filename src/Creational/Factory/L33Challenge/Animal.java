package Creational.Factory.L33Challenge;

interface Animal {

    void poke();
}

class Tiger implements Animal {

    @Override
    public void poke() {
        System.out.println("You poke the tiger... Bad idea");
    }
}

class Rabbit implements Animal {

    @Override
    public void poke() {
        System.out.println("You poke the rabbit... it jumps away");
    }
}

class Turtle implements Animal {

    @Override
    public void poke() {
        System.out.println("You poke the turtle... Your last memory before waking up was his sinister laughing");
    }
}
