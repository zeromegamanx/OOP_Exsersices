public class SpecialSeries {
    public static double sumOfSeries(double x, int numTerms){
        double sum = x;
        //System.out.println("u["+0+"] = "+x);
        for (int k = 1; k < numTerms; k++) {
            double uk = Math.pow(x,2*k+1)/(double)(2*k+1);
            for (int i = 2*k-1; i >0; i-=2) {
                uk *= i/(double)(i+1);
            }
            //System.out.println("u["+k+"] = "+uk);
            sum += uk;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSeries(1, 5));
    }
}