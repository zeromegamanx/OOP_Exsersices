import java.util.Scanner;

public class Homework4 {
    static int factorial(int n) {
        if (n == 0){
            return 1;
        }
        else
            return (n * factorial(n - 1));
    }

    public static int findFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return findFibonacci(n - 2) + findFibonacci(n - 1);
    }

    public static int lengthOfRunningNumberSequence(String str){
        if (str.equals(""))
            return 0;
        else
            return lengthOfRunningNumberSequence(str.substring(1)) + 1;
    }

    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        int gcd = a;
        return gcd;
    }

    public static int linearSearchIndex(int array[], int x)
    {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            if (array[i] == x)
                return i;
            break;
        }
        return 0;
    }

    public static boolean linearSearch(int array[], int x)
    {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            if (array[i] == x)
                return true;
            break;
        }
        return false;
    }

    public static boolean binarySearch(int[] array, int left, int right, int key){
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // Nếu phần tử có ở chính giữa
            if (array[mid] == key) {
                return true;
            }
            // Nếu phần tử nhỏ hơn giữa, thì nó chỉ có thể
            // hiện diện trong mảng con bên trái
            if (array[mid] > key)
                return binarySearch(array, left, mid - 1, key);

            // Ngược lại, phần tử chỉ có thể có mặt
            // trong mảng con bên phải
            return binarySearch(array, mid + 1, right, key);
        }

        // Nếu phầnt tử không có trong mảng
        return false;
    }

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printSortedArray(int array[]) {
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Factorial of 5: " + factorial(5));

        System.out.print("Enter the number of first digits in the fibonacci sequence "
                + "you want to output: ");
        int n = scanner.nextInt();
        System.out.print("The fibonacci are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(findFibonacci(i) + " ");
        }
        System.out.println();
        System.out.println();


        String runningNumberSequence = "1234567";
        System.out.println("The length of the number sequence " + runningNumberSequence
                + " is: " + lengthOfRunningNumberSequence(runningNumberSequence));
        System.out.println();

        System.out.print("Input a number: ");
        int a = scanner.nextInt();
        System.out.print("Input b number: ");
        int b = scanner.nextInt();
        System.out.println("GCD of " + a + " and " + b
                + " is: " + gcd(a, b));
        System.out.println();

        int firstArray[] = { 2, 3, 4, 5, 6 };
        int firstKey = 10;
        int firstResult = linearSearchIndex(firstArray, firstKey);
        if (firstResult == 0)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at index "
                    + firstResult);
        if (linearSearch(firstArray, firstKey) == true){
            System.out.println("Key is found in the array with linear search: True");
        } else {
            System.out.println("Key is found in the array with linear search: False");
        }
        System.out.println();

        int secondArray[] = { 2, 4, 9, 10, 11, 22, 24, 31, 48, 56, 76, 86 };
        int secondKey = 10;
        if (binarySearch(secondArray, 0, secondArray.length-1, secondKey ) == true) {
            System.out.println("Key is found in the array with binary search: True");
        } else {
            System.out.println("Key is found in the array with binary search: False");
        }
        System.out.println();

        int[] thirdArray = { 9, 6, 4, 1 ,5 };
        System.out.print("Array before selection sort: ");
        printSortedArray(thirdArray);
        selectionSort(thirdArray);
        System.out.print("Array after selection sort: ");
        printSortedArray(thirdArray);
        System.out.println();

        int forthArray[] = { 9, 2, 4, 1, 5 };
        System.out.print("Array before bubble sort: ");
        printSortedArray(forthArray);
        bubbleSort(forthArray);
        System.out.print("Array after bubble sort: ");
        printSortedArray(forthArray);

        int fifthArray[] = { 9, 6, 4, 1, 5, 2, 7 };
        System.out.print("Array before insertion sort: ");
        printSortedArray(fifthArray);
        bubbleSort(fifthArray);
        System.out.print("Array after insertion sort: ");
        printSortedArray(fifthArray);
    }
}
