package ss05_AccessModifier_Static.thuc_hanh;

public class CarRun {
    public static void main(String[] args) {
        Car mec = new Car("Mec","C200");
        System.out.println(mec.toString());
        System.out.println(Car.numberOfCar);
        Car honDa = new Car("Honda"," City");
        System.out.println(honDa.toString());
        System.out.println(Car.getNumberOfCar());
    }
}
