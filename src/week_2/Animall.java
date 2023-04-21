package week_2;

public abstract class Animall {
    abstract String makeSound();
}
class Cat extends Animall implements Edible{
    @Override
    String makeSound() {
        return "Cat : meow meow";
    }

    @Override
    public String howToEat() {
        return "Cat : Ăn bằng miệng";
    }
}
class Test{
    public static void main(String[] args) {
        Animall[] animalls = new Animall[1];
        animalls[0] = new Cat();
        for (Animall animal: animalls
             ) {
            System.out.println(animal.makeSound());
            if (animal instanceof Cat) {
                Edible edible = (Cat) animal;
                System.out.println(edible.howToEat());
            }
        }

    }

}
