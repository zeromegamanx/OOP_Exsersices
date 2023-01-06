import java.text.NumberFormat;
import java.util.Scanner;

public class PerfectNumberList {
    public static boolean isPerfect(int a){
        int sum = 0;
        //sử dụng vòng lặp for từ 1 đến a/2 (vì ước số của a luôn luôn nhỏ hơn a/2)
        for(int i = 1; i <= a/2; i++){
            if(a % i == 0) {
                sum += i;
            }
        }
        if (sum == a){
            return true;
        }
        return false;
    }

    public static boolean isDeficient (int a){
        int sum = 0;
        //sử dụng vòng lặp for từ 1 đến a/2 (vì ước số của a luôn luôn nhỏ hơn a/2)
        for(int i = 1; i <= a/2; i++){
            if(a % i == 0) {
                sum += i;
            }
        }
        if (sum < a){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPerfect = 0;
        int countNotDeficient = 0;

        System.out.print("Enter upper bound: ");
        int boundNumber = scanner.nextInt();
        System.out.println();

        System.out.print("These number are perfect: ");
        for (int i = 1; i <= boundNumber; i++) {
            if(isPerfect(i)){
                countPerfect++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(countPerfect + " perfect numbers found " );

        System.out.print("These number are deficient: ");
        for (int i = 1; i <= boundNumber; i++) {
            if(!isDeficient(i) && !isPerfect(i)){
                countNotDeficient++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(countNotDeficient + " deficient numbers found " );
    }
}
