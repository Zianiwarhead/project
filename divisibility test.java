public class DivisibilityCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        checkDivisibility(number);
    }

    public static void checkDivisibility(int number) {
        if (number == 0) {
            System.out.println("The number is 0, and divisibility by 0 is undefined.");
            return;
        }

        System.out.println("The number is divisible by 1 because any number is divisible by 1.");

        if (number % 2 == 0) {
            System.out.println("The number is divisible by 2 because it is even.");
        } else {
            System.out.println("The number is not divisible by 2 because it is odd.");
        }

        if (sumOfDigits(number) % 3 == 0) {
            System.out.println("The number is divisible by 3 because the sum of its digits is divisible by 3.");
        } else {
            System.out.println("The number is not divisible by 3 because the sum of its digits is not divisible by 3.");
        }

        if (number % 4 == 0) {
            System.out.println("The number is divisible by 4 because the last two digits form a number divisible by 4.");
        } else {
            System.out.println("The number is not divisible by 4 because the last two digits do not form a number divisible by 4.");
        }

        if (number % 10 == 0 || number % 10 == 5) {
            System.out.println("The number is divisible by 5 because it ends with a 0 or a 5.");
        } else {
            System.out.println("The number is not divisible by 5 because it does not end with a 0 or a 5.");
        }

        if (number % 2 == 0 && sumOfDigits(number) % 3 == 0) {
            System.out.println("The number is divisible by 6 because it is divisible by both 2 and 3.");
        } else {
            System.out.println("The number is not divisible by 6 because it is not divisible by both 2 and 3.");
        }

        if (number % 7 == 0) {
            System.out.println("The number is divisible by 7.");
        } else {
            System.out.println("The number is not divisible by 7.");
        }

        if (number % 8 == 0) {
            System.out.println("The number is divisible by 8 because the last three digits form a number divisible by 8.");
        } else {
            System.out.println("The number is not divisible by 8 because the last three digits do not form a number divisible by 8.");
        }

        if (sumOfDigits(number) % 9 == 0) {
            System.out.println("The number is divisible by 9 because the sum of its digits is divisible by 9.");
        } else {
            System.out.println("The number is not divisible by 9 because the sum of its digits is not divisible by 9.");
        }
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

