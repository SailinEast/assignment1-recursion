import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the task (1-10): ");
        int task = scanner.nextInt();

        switch (task) {
            case 1:
                System.out.println("--- Task 1: Print Digits ---");
                System.out.print("Enter a number: ");
                int task1Num = scanner.nextInt();
                printDigits(task1Num);
                break;
            case 2:
                System.out.println("--- Task 2: Average of Elements ---");
                System.out.print("Enter the number of elements: ");
                int n2 = scanner.nextInt();
                int[] arr = new int[n2];
                System.out.print("Enter the elements: ");
                for (int i = 0; i < n2; i++) {
                    arr[i] = scanner.nextInt();
                }
                int sum = sumElements(arr, n2);
                System.out.println("Average: " + ((double) sum / n2));
                break;
            case 3:
                System.out.println("--- Task 3: Prime Number Check ---");
                System.out.print("Enter a number: ");
                int task3Num = scanner.nextInt();
                checkPrime(task3Num);
                break;
            case 4:
                System.out.println("--- Task 4: Factorial ---");
                System.out.print("Enter a number: ");
                int task4Num = scanner.nextInt();
                System.out.println(factorial(task4Num));
                break;
            case 5:
                System.out.println("--- Task 5: Fibonacci Number ---");
                System.out.print("Enter a number: ");
                int task5Num = scanner.nextInt();
                System.out.println(fibonacci(task5Num));
                break;
            case 6:
                System.out.println("--- Task 6: Power Function ---");
                System.out.print("Enter base (a) and power (n): ");
                int a = scanner.nextInt();
                int n6 = scanner.nextInt();
                System.out.println(power(a, n6));
                break;
            case 7:
                System.out.println("--- Task 7: Reverse Output ---");
                System.out.print("Enter the number of elements: ");
                int n7 = scanner.nextInt();
                System.out.print("Enter the elements: ");
                reverseOutput(n7, scanner);
                System.out.println();
                break;
            case 8:
                System.out.println("--- Task 8: Check Digits in String ---");
                System.out.print("Enter a string: ");
                String task8Str = scanner.next();
                System.out.println(checkDigits(task8Str));
                break;
            case 9:
                System.out.println("--- Task 9: Count Characters in a String ---");
                System.out.print("Enter a string: ");
                String task9Str = scanner.next();
                System.out.println(countCharacters(task9Str));
                break;
            case 10:
                System.out.println("--- Task 10: Greatest Common Divisor (GCD) ---");
                System.out.print("Enter two numbers: ");
                int gcdA = scanner.nextInt();
                int gcdB = scanner.nextInt();
                System.out.println(findGCD(gcdA, gcdB));
                break;
            default:
                System.out.println("Invalid task number.");
        }

        scanner.close();
    }

    // Task 1
    public static void printDigits(int n) {
        if (n % 10 == n) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    // Task 2
    public static int sumElements(int[] arr, int n) {
        if (n == 1) return arr[n - 1];
        return arr[n - 1] + sumElements(arr, n - 1);
    }

    // Task 3
    public static void checkPrime(int n) {
        // TODO: Implement recursive logic to check if prime
    }

    // Task 4
    public static int factorial(int n) {
        // TODO: Implement recursive logic to calculate factorial
        return 0;
    }

    // Task 5
    public static int fibonacci(int n) {
        // TODO: Implement recursive logic to find nth Fibonacci number
        return 0;
    }

    // Task 6
    public static int power(int a, int n) {
        // TODO: Implement recursive logic to calculate a^n
        return 0;
    }

    // Task 7
    public static void reverseOutput(int n, Scanner scanner) {
        // TODO: Implement recursive logic to read and print in reverse order
    }

    // Task 8
    public static String checkDigits(String s) {
        // TODO: Implement recursive logic to check if string contains only digits
        return "No";
    }

    // Task 9
    public static int countCharacters(String s) {
        // TODO: Implement recursive logic to count characters
        return 0;
    }

    // Task 10
    public static int findGCD(int a, int b) {
        // TODO: Implement recursive logic using Euclidean Algorithm
        return 0;
    }
}