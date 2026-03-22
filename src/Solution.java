import java.util.Scanner;

public class Solution {
    // Task 1
    public static void printDigits(int n) {
        printDigitsLogic(Math.abs(n));
    }
    private static void printDigitsLogic(int n) {
        if (n % 10 == n) {
            System.out.println(n);
            return;
        }
        printDigitsLogic(n / 10);
        System.out.println(n % 10);
    }

    // Task 2
    public static int sumElements(int[] arr, int n) {
        if (n == 1) return arr[n - 1];
        return arr[n - 1] + sumElements(arr, n - 1);
    }
    public static void fillArray(int[] arr, int i, Scanner scanner) {
        if (i == arr.length) return;
        arr[i] = scanner.nextInt();
        fillArray(arr, i + 1, scanner);
    }

    // Task 3
    public static boolean isPrime(int n) {
        if (n <= 1) throw new IllegalArgumentException("Number must be greater than 1!");
        return checkPrime(n, 2);
    }
    private static boolean checkPrime(int n, int div) {
        if (n <= 1) {
            return false;
        }
        if (div * div > n) {
            return true;
        }
        if (n % div == 0) {
            return false;
        }
        return checkPrime(n, div + 1);
    }

    // Task 4
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("No negatives allowed!");
        return computeFactorial(n);
    }
    private static int computeFactorial(int n) {
        if (n <= 1) return 1;
        return n * computeFactorial(n - 1);
    }

    // Task 5
    public static int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("No negatives allowed!");
        return computeFibonacci(n);
    }
    private static int computeFibonacci(int n) {
        if (n <= 1) return n;
        return computeFibonacci(n - 1) + computeFibonacci(n - 2);
    }

    // Task 6
    public static int power(int a, int n) {
        if (n < 0) throw new IllegalArgumentException("No negatives allowed!");
        return computePower(a, n);
    }
    private static int computePower(int a, int n) {
        if (n == 0) return 1;
        return a * computePower(a, n - 1);
    }

    // Task 7
    public static void reverseOutput(int n) {
        reverseOutputLogic(n, IOHandler.getScanner());
    }
    private static void reverseOutputLogic(int n, Scanner scanner) {
        if (n == 0) return;
        int num = scanner.nextInt();
        reverseOutputLogic(n - 1, scanner);
        System.out.print(num + " ");
    }

    // Task 8
    public static boolean isNumeric(String s) {
        return isNumericLogic(s, 0);
    }
    private static boolean isNumericLogic(String s, int i) {
        if (s.length() == i) return true;
        if (Character.isDigit(s.charAt(i))) return isNumericLogic(s, i + 1);
        return false;
    }

    // Task 9
    public static int countCharacters(String s) {
        return countCharactersLogic(s, 0);
    }
    private static int countCharactersLogic(String s, int i) {
        if (s.length() == i) return 0;
        return 1 + countCharactersLogic(s, i + 1);
    }

    // Task 10
    public static int findGCD(int a, int b) {
        return computeGCD(Math.abs(a), Math.abs(b));
    }
    private static int computeGCD(int a, int b) {
        if (b == 0) return a;
        return computeGCD(b, a % b);
    }
}
