import java.util.Scanner;

public class AverageMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int[] marks = new int[5];

        System.out.println("Enter marks for five units:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Unit " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        double average = sum / 5;

        System.out.printf("Average marks: %.2f\n", average);
        
        scanner.close();
    }
}
