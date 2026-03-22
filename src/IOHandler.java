import java.util.Scanner;

public class IOHandler {
    public static final Scanner scanner = new Scanner(System.in);

    public static int getTask() {
        System.out.print("Enter the task (1-10): ");
        int task = scanner.nextInt();
        scanner.nextLine();
        return task;
    }

    public static void showHeader(int taskNum, String taskName) {
        System.out.println("--- Task " + taskNum + ": " + taskName + " ---");
    }

    public static int getInt() {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public static int getInt(String text) {
        System.out.print(text);
        return scanner.nextInt();
    }

    public static int[] getTwoInts(String text) {
        System.out.print(text);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        return new int[] {first, second};
    }

    public static String getString() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public static int[] getArrayInput() {
        System.out.print("Enter the number of elements: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the elements: ");
        // fills an array recursively without loops
        Solution.fillArray(arr, 0, scanner);
        return arr;
    }

    public static Scanner getScanner() {
        return scanner;
    }
}
