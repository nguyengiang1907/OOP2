package week_2;

import java.util.Timer;

 abstract class Animal {
    abstract String makeSound();
}
 class Tiger extends Animal{
    @Override
    String makeSound() {
        return "Con hổ kêu :Gâu Gâu......gừưưưư ......";
    }
}
 class Chicken extends Animal implements Edible{
    @Override
    String makeSound() {
        return "Con gà kêu : Ò Ó O O  O  O  O";
    }

     @Override
     public String howToEat() {
         return "Con gà có thể được chiên lên";
     }
 }
interface Edible{
    String howToEat();
}
abstract class Fruit implements Edible{ }
class Apple extends Fruit{
    @Override
    public String howToEat() {
        return "Táo có thể ăn được";
    }
}
class Orange extends Fruit{
    @Override
    public String howToEat() {
        return "Cam có thể ăn được";
    }
}

class Test_Animal{
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal:animals
             ) {
            System.out.println(animal.makeSound());


            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit:fruits
             ) {
            System.out.println(fruit.howToEat());
        }
    }
}

