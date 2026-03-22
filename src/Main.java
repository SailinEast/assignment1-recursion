import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the task (1-10): ");
        int task = scanner.nextInt();

        switch (task) {
            case 1: {
                System.out.println("--- Task 1: Print Digits ---");
                System.out.print("Enter a number: ");
                int input = scanner.nextInt();
                printDigits(input);
                break;
            }
            case 2: {
                System.out.println("--- Task 2: Average of Elements ---");
                System.out.print("Enter the number of elements: ");
                int len = scanner.nextInt();
                int[] arr = new int[len];
                System.out.print("Enter the elements: ");
                for (int i = 0; i < len; i++) {
                    arr[i] = scanner.nextInt();
                }
                int sum = sumElements(arr, len);
                System.out.println("Average: " + ((double) sum / len));
                break;
            }
            case 3: {
                System.out.println("--- Task 3: Prime Number Check ---");
                System.out.print("Enter a number: ");
                int n = scanner.nextInt();
                checkPrime(n, 2);
                break;
            }
            case 4: {
                System.out.println("--- Task 4: Factorial ---");
                System.out.print("Enter a number: ");
                int n = scanner.nextInt();
                System.out.println(factorial(n));
                break;
            }
            case 5: {
                System.out.println("--- Task 5: Fibonacci Number ---");
                System.out.print("Enter a number: ");
                int n = scanner.nextInt();
                System.out.println(fibonacci(n));
                break;
            }
            case 6: {
                System.out.println("--- Task 6: Power Function ---");
                System.out.print("Enter base (a) and power (n): ");
                int a = scanner.nextInt();
                int n = scanner.nextInt();
                System.out.println(power(a, n));
                break;
            }
            case 7: {
                System.out.println("--- Task 7: Reverse Output ---");
                System.out.print("Enter the number of elements: ");
                int len = scanner.nextInt();
                System.out.print("Enter the elements: ");
                reverseOutput(len, scanner);
                System.out.println();
                break;
            }
            case 8: {
                System.out.println("--- Task 8: Check Digits in String ---");
                System.out.print("Enter a string: ");
                String s = scanner.next();
                System.out.println(checkDigits(s, 0));
                break;
            }
            case 9: {
                System.out.println("--- Task 9: Count Characters in a String ---");
                System.out.print("Enter a string: ");
                String s = scanner.next();
                System.out.println(countCharacters(s, 0));
                break;
            }
            case 10: {
                System.out.println("--- Task 10: Greatest Common Divisor (GCD) ---");
                System.out.print("Enter two numbers: ");
                int gcdA = scanner.nextInt();
                int gcdB = scanner.nextInt();
                System.out.println(findGCD(gcdA, gcdB));
                break;
            }
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
    public static void checkPrime(int n, int div) {
        if (n <= 1) {
            System.out.println("Composite");
            return;
        }
        if (div * div > n) {
            System.out.println("Prime");
            return;
        }
        if (n % div == 0) {
            System.out.println("Composite");
            return;
        }
        checkPrime(n, div + 1);
    }

    // Task 4
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Task 5
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Task 6
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Task 7
    public static void reverseOutput(int n, Scanner scanner) {
        if (n == 0) return;
        int num = scanner.nextInt();
        reverseOutput(n - 1, scanner);
        System.out.print(num + " ");
    }

    // Task 8
    public static String checkDigits(String s, int i) {
        if (s.length() == i) return "Yes";
        if (Character.isDigit(s.charAt(i))) return checkDigits(s, i + 1);
        return "No";
    }

    // Task 9
    public static int countCharacters(String s, int i) {
        if (s.length() == i) return 0;
        return 1 + countCharacters(s, i + 1);
    }

    // Task 10
    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}