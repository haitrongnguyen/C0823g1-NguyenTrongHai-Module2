package ss07_Abstractclass_Interface.thuc_hanh.abstract_interface;

import ss07_Abstractclass_Interface.thuc_hanh.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
