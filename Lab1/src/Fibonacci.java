public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(10);
    }
    public static void fibonacci(int maxNumber) {
        int previousNumber = 1, nextNumber = 1;
        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");
        int i = 1;
        while (i <= maxNumber) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }
}

