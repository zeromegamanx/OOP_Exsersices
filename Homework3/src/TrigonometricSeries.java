import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        double  x = Math.PI/6;
        int     numTerms = 10;

        TrigonometricSeries aTrigonometricSeries = new TrigonometricSeries();

        System.out.println("Calculated values:");
        System.out.printf("sin(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , aTrigonometricSeries.sin(x, numTerms));
        System.out.printf("cos(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , aTrigonometricSeries.cos(x, numTerms));

        System.out.println("java.lang.Math values:");
        System.out.printf("sin(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , Math.sin(x));
        System.out.printf("cos(%1$d) = %2$f \n", (int)Math.round(x*180/Math.PI)
                , Math.cos(x));
    }

    public static double factorial(double n, int nTerms){
        double factorialvalue = 1;
        for (int i = nTerms; i > 0; i--) {
            factorialvalue *= i;
        }
        return factorialvalue;
    }

    public static double sin(double x, int nTerms){
        double sin = 0;
//        double term = x;
        for (int i = 1; i < nTerms; i++) {
            //sử dụng công thức truy hồi
//            term *= (-1) * (x * x ) / ((2 * i) * (2 * i +1));
//            sin += term;
            sin += (i%2 == 0 ? 1 : -1) * factorial(x, 2*i+1);
        }
        return sin;
    }
    private double cos(double x, int numTerms)
    {
        double cos = 0D;
        for (int i = 0; i < numTerms; i++) {
            cos += (i%2 == 0 ? 1 : -1) * factorial(x, 2*i);
        }
        return cos;
    }
}

