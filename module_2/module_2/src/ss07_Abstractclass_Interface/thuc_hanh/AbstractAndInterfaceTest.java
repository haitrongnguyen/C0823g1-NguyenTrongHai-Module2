package ss07_Abstractclass_Interface.thuc_hanh;

import ss07_Abstractclass_Interface.thuc_hanh.abstract_interface.Animal;
import ss07_Abstractclass_Interface.thuc_hanh.abstract_interface.Chicken;
import ss07_Abstractclass_Interface.thuc_hanh.abstract_interface.Tiger;
import ss07_Abstractclass_Interface.thuc_hanh.edible.Edible;
import ss07_Abstractclass_Interface.thuc_hanh.fruit.Apple;
import ss07_Abstractclass_Interface.thuc_hanh.fruit.Fruit;
import ss07_Abstractclass_Interface.thuc_hanh.fruit.Orange;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
