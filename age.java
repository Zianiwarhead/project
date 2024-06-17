import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        int surnameLength = surname.length();

        String ageType = (age % 2 == 0) ? "even" : "odd";

        System.out.println("\nThe number of characters in your surname is " + surnameLength + ".");
        System.out.println("Your current age is an " + ageType + " number.");
        
        scanner.close();
    }
}
