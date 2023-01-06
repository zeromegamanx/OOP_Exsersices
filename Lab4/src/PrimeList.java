import java.util.Scanner;

public class PrimeList {
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter upper bound: ");
        int boundNumber = scanner.nextInt();
        System.out.println();
        System.out.print("These number are prime: ");
        for (int i = 1; i <= boundNumber; i++) {
            if(isPrime(i)){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(count + " prime numbers found " );
    }
}
