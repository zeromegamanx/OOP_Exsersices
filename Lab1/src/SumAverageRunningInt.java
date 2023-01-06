public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

//        int i = 1;
//        while (i<100){
//            sum += i;
//            i++;
//        }
//
//        do {
//            sum += i;
//            i++;
//        } while (i <= 100);

        average = (double) sum / 100 ;
        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
        System.out.println("The average of numbers from 1 to 100 is: " + average);
    }
}
