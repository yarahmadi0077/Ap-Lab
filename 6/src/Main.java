import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Enter details for Parrot:");
        animals.add(createParrot(scanner));

        System.out.println("Enter details for Eagle:");
        animals.add(createEagle(scanner));

        System.out.println("Enter details for Giraffe:");
        animals.add(createGiraffe(scanner));

        System.out.println("Enter details for Cheetah:");
        animals.add(createCheetah(scanner));

        for (Animal animal : animals) {
            animal.show();
        }

        System.out.println();

        Eagle eagle = (Eagle) animals.get(1);
        Parrot parrot = (Parrot) animals.get(0);
        Cheetah cheetah = (Cheetah) animals.get(3);
        Girafe giraffe = (Girafe) animals.get(2);

        eagle.hunt(parrot);
        cheetah.hunt(giraffe);

        scanner.close();
    }

    private static Parrot createParrot(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Attributes: ");
        String attributes = scanner.nextLine();
        System.out.print("Height of Flight: ");
        double heightOfFlight = scanner.nextDouble();
        scanner.nextLine();
        return new Parrot(name, age, attributes, heightOfFlight);
    }

    private static Eagle createEagle(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Attributes: ");
        String attributes = scanner.nextLine();
        System.out.print("Height of Flight: ");
        double heightOfFlight = scanner.nextDouble();
        scanner.nextLine();
        return new Eagle(name, age, attributes, heightOfFlight);
    }

    private static Girafe createGiraffe(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Attributes: ");
        String attributes = scanner.nextLine();
        System.out.print("Speed: ");
        double speed = scanner.nextDouble();
        scanner.nextLine();
        return new Girafe(name, age, attributes, speed);
    }

    private static Cheetah createCheetah(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Attributes: ");
        String attributes = scanner.nextLine();
        System.out.print("Speed: ");
        double speed = scanner.nextDouble();
        scanner.nextLine();
        return new Cheetah(name, age, attributes, speed);
    }
}




/*
Parrot parrot = new Parrot("parrot", 10, "beautiful", 10);
        Eagle eagle = new Eagle("eagle", 100, "alone", 1000);
        Girafe girafe = new Girafe("griafe", 20, "long",20);
        Cheetah cheetah = new Cheetah("cheetah", 5, "fastest",80);
 */
