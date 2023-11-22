import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DogExample {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("a",1));
        dogs.add(new Dog("z",4));
        dogs.add(new Dog("f",2));
        dogs.add(new Dog("d",3));
        Collections.sort(dogs);
        for (Dog dog:dogs){
            System.out.println(dog);
        }
        Collections.sort(dogs,new Dog());
        for (Dog dog:dogs){
            System.out.println(dog);
        }
    }
}
