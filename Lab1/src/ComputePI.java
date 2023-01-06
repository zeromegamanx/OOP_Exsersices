public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        int max = 1000;
        for (int i = 1; i <= max; i += 2) {
            if (i % 4 == 1) {
                sum += (double) 1/i;
            } else if (i % 4 == 3) {
                sum -= (double) 1/i;
            } else {
                System.out.println("Impossible!");
            }
        }
        System.out.println("The value of PI is: " + 4 * sum);
    }
}
