public abstract class Mammal extends Animal {
    protected double speed;

    public Mammal(String name, int age, String attributes, double speed) {
        super(name, age, attributes);
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public void show() {
        System.out.println("name: " + name + ", age: " + age + ", speed: " + speed + " \"" + attributes + "\""); 
    }

    public String toString() {
        return super.toString() + "\nSpeed: " + this.speed;
    }
}