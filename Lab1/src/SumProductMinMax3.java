public class SumProductMinMax3 {
    public static void main(String[] args) {
        int first = 3;
        System.out.println("First int is: " + first);
        int second = 1;
        System.out.println("Second int is: " + second);
        int third = 7;
        System.out.println("Third int is: " + third);
        int sum = first + second + third;
        System.out.println("The sum is: " + sum);
        int product = first * second * third;
        System.out.println("The product is: " + product);

        int min = first;
        if (min > second) {
            min = second;
        }
        if (min > third) {
            min = third;
        }
        System.out.println("The min int is: " + min);

        int max = first;
        if (max < second) {
            max = second;
        }
        if (max < third) {
            max = third;
        }
        System.out.println("The max int is: " + max);

    }
}
