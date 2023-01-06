public class HarmonicSum {
    public static void main(String[] args) {
        double sumL2R = 0;
        double sumR2l = 0;
        double different;
        for (int i = 1; i <= 50000; i++) {
            sumL2R += (double) 1/i;
        }
        System.out.println("The sum from the left to right is: " + sumL2R);
        for (int i = 50000; i >= 1 ; i--) {
            sumR2l += (double) 1/i;
        }
        System.out.println("The sum from the right to left is: " + sumR2l);
    }
}
