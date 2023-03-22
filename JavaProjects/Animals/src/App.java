import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String dog = "dog";
        String cat = "cat";
        String bear = "bear";

        System.out.println("Enter an animal");
        String animal = input.nextLine();

        if (animal.equals(dog)) {
            System.out.println("bark!");
        } else if (animal.equals(cat)) {
            System.out.println("meow");
        } else if (animal.equals(bear)) {
            System.out.println("Rawr!");
        } else {
            System.out.println("I don't know that animal");
        }

    }
}
