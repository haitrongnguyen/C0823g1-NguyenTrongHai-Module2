package ss110_DSA_Stack_Queue.bai_tap.demerging;

import java.util.*;

public class Demerging {
    public static void main(String[] args) {
        List<Person> personArrayList = new ArrayList<>();
        Person person1 = new Person("A", "Male", "15/01/1890");
        Person person2 = new Person("B", "FeMale", "16/01/1890");
        Person person3 = new Person("C", "Male", "17/01/1890");
        Person person4 = new Person("D", "Male", "18/01/1890");
        Person person5 = new Person("E", "FeMale", "19/01/1890");
        Person person6 = new Person("F", "FeMale", "20/01/1890");
        Person person7 = new Person("G", "Male", "21/01/1890");
        Person person8 = new Person("H", "Male", "22/01/1890");
        Person person9 = new Person("I", "FeMale", "23/01/1890");
        Person person10 = new Person("M", "Male", "24/01/1890");
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);
        personArrayList.add(person5);
        personArrayList.add(person6);
        personArrayList.add(person7);
        personArrayList.add(person8);
        personArrayList.add(person9);
        personArrayList.add(person10);
        Queue<Person> female = new ArrayDeque<>();
        Queue<Person> male = new ArrayDeque<>();
        for (int i = 0; i < personArrayList.size(); i++) {
            if (personArrayList.get(i).getGender().equals("Male")) {
                male.add(personArrayList.get(i));
            } else {
                female.add(personArrayList.get(i));
            }
        }
        personArrayList.clear();
        while (!male.isEmpty()) {
            personArrayList.add(male.poll());
        }
        while (!female.isEmpty()) {
            personArrayList.add(female.poll());
        }
        for (int i = 0; i < personArrayList.size(); i++) {
//            System.out.println(personArrayList.get(i).getName() + " " + personArrayList.get(i).getGender()+" "
//            +personArrayList.get(i).getDayOfBirth());
            Person person = personArrayList.get(i);
            System.out.println(person.getName() + " " + person.getGender() + " " + person.getDayOfBirth());
        }

    }
}
