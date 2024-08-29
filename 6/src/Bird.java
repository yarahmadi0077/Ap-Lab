public abstract class Bird extends Animal {
    protected double heightOfFlight;

    public Bird(String name, int age, String attributes, double heightOfFlight) {
        super(name, age, attributes);
        this.heightOfFlight = heightOfFlight;
    }

    public double getHeightOfFlight() {
        return this.heightOfFlight;
    }

    public void setHeightOfFlight(double heightOfFlight) {
        if (heightOfFlight > 0) {
            this.heightOfFlight = heightOfFlight;
        }
    }

    public void show() {
        System.out.println("name: " + name + ", age: " + age + ", height of fly: " + heightOfFlight + " \"" + attributes + "\"");
    }

    public String toString() {
        return super.toString() + "\nHeight of Flight: " + this.heightOfFlight;
    }
}