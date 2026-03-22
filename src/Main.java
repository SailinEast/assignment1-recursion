public class Main {
    public static void main(String[] args) {
        int task = IOHandler.getTask();

        switch (task) {
            case 1: {
                IOHandler.showHeader(task, "Print Digits");
                int input = IOHandler.getInt();
                Solution.printDigits(input);
                break;
            }
            case 2: {
                IOHandler.showHeader(task, "Average of Elements");
                int[] arr = IOHandler.getArrayInput();
                int len = arr.length;
                int sum = Solution.sumElements(arr, len);
                double avg = (double) sum / len;
                System.out.println(avg);
                break;
            }
            case 3: {
                IOHandler.showHeader(task, "Prime Number Check");
                int n = IOHandler.getInt();
                if (Solution.isPrime(n)) System.out.println("Prime");
                else System.out.println("Composite");
                break;
            }
            case 4: {
                IOHandler.showHeader(task, "Factorial");
                int n = IOHandler.getInt();
                System.out.println(Solution.factorial(n));
                break;
            }
            case 5: {
                IOHandler.showHeader(task, "Fibonacci Number");
                int n = IOHandler.getInt();
                System.out.println(Solution.fibonacci(n));
                break;
            }
            case 6: {
                IOHandler.showHeader(task, "Power Function");
                int[] input = IOHandler.getTwoInts("Enter base (a) and power (n): ");
                int a = input[0];
                int n = input[1];
                System.out.println(Solution.power(a, n));
                break;
            }
            case 7: {
                IOHandler.showHeader(task, "Reverse Output");
                int len = IOHandler.getInt("Enter the number of elements: ");
                System.out.print("Enter the elements: ");
                Solution.reverseOutput(len);
                System.out.println();
                break;
            }
            case 8: {
                IOHandler.showHeader(task, "Check Digits in String");
                String s = IOHandler.getString();
                if (Solution.isNumeric(s)) System.out.println("Yes");
                else System.out.println("No");
                break;
            }
            case 9: {
                IOHandler.showHeader(task, "Count Characters in a String");
                String s = IOHandler.getString();
                System.out.println(Solution.countCharacters(s));
                break;
            }
            case 10: {
                IOHandler.showHeader(task, "Greatest Common Divisor (GCD)");
                int[] input = IOHandler.getTwoInts("Enter two numbers: ");
                int a = input[0];
                int b = input[1];
                System.out.println(Solution.findGCD(a, b));
                break;
            }
            default:
                System.out.println("Invalid task number.");
        }
    }
}