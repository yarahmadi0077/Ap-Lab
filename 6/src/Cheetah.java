public class Cheetah extends Mammal implements Hunter {
    public Cheetah(String name, int age, String attributes, double speed) {
        super(name, age, attributes, speed);
    }

    public String toString() {
        return super.toString();
    }

    public void hunt(Prey prey) {
        Animal animal = (Animal) prey;
        System.out.println(name + " hunted " + animal.getName());
    }

}