public abstract class Animal {
    protected String name;
    protected int age;
    protected String attributes;

    public Animal (String name, int age, String attributes) {
        this.name = name;
        this.age = age;
        this.attributes = attributes;

    }

    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }

    public String getAttributes() {
        return this.attributes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public void show() {
        System.out.println("name:  " + name + ", age: " + age + " \"" + attributes + "\"");
    }

    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nAttributes: " + this.attributes;
    }
}