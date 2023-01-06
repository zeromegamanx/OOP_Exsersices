import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ITEMS = 5;
        System.out.println("Number of items: " + NUM_ITEMS);
        int [] items = new int[NUM_ITEMS];
        System.out.print("Enter the value of items: ");
        if (NUM_ITEMS > 0) {
            for (int i = 0; i < NUM_ITEMS; i++) {
                items[i] = sc.nextInt();
            }
        }
        System.out.print("The value are: ");
        for (int i = 0; i < NUM_ITEMS; i++) {
            if (i == 0){
                System.out.print("[" + items[i] + " ");
            } else if (i < NUM_ITEMS - 1){
                System.out.print(items[i] + " ");
            } else {
                System.out.print(items[i] + "]");

            }
        }
    }
}
