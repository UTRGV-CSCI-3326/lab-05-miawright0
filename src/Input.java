
import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Get and store the user's name. (Store as text)
        System.out.print("Enter your name: ");
        String name;
        name = scanner.nextLine();

        //Get and store the user's age. (Store as a whole number)
        System.out.print("Enter your age: ");
        int age;
        age = scanner.nextInt();

        //Get and store the user's weight. (Store it as a real number)
        System.out.print("Enter your weight: ");
        double weight;
        weight = scanner.nextDouble();

        //Get and store if the user is a smoker. (Store it as either true or false)
        System.out.print("Are you a smoker? (true/false): ");
        boolean smoker;
        smoker = scanner.nextBoolean();
        //Output all of the information back to the user.
        System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight + ", Smoker: " + smoker);

        scanner.close();

    }
}

