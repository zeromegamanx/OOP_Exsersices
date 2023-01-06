import java.util.Scanner;
import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sumMagic(scanner));
        testArraytoString();
        System.out.println("Enter the Size of Arrays : ");
        int size = scanner.nextInt();
        int array1[] = new int[size];
        int array2[] = new int[size];
        int[] buffer = new int[size];
        swap(array1, array2);
    }

    static int exponent(int base, int exp){
        int expValue = 1;
        for (int i = 0; i < exp; i++) {
            expValue *= base;
        }

        return expValue;
    }

    static boolean hasEight(int number){
        //Dùng vòng lặp while khi không biết số lần lăp
        while(number > 0){
            int lastDigit = number % 10;
            if(lastDigit == 8){
                return true;
            }
            number /= 10;
        }
        return false;
    }

    static int sumMagic(Scanner scanner){
        int number;
        int sum = 0;
        //Vòng lặp do dùng khi vòng lặp xảy ra ít nhất 1 lần
        do {
            System.out.print("Enter a positive number (or -1 to end): ");
            number = scanner.nextInt();
            if (hasEight(number)){
                sum += number;
            }
        } while (number != -1);
        return sum;
    }

    static String arrayToString(int[] array){
        //String là 1 bất biến
        //StringBuilder là 1 biến có thể thay đổi
        StringBuilder arrayString = new StringBuilder("[");

        //Vòng lặp chỉ để đọc, không sửa các phần tử dữ liệu nên dùng for-each
        //element là giá trị của từng phần tử cua mảng array
        for (int element: array) {
            arrayString.append(element).append((", "));
        }
        //xóa 2 ký tự dấu "," và " " ở cuối
        arrayString.delete(arrayString.length()-2, arrayString.length());

//        //trim() là 1 API để loại bỏ các ký tự trắng (spacebar, tab) ở cuối
//        arrayString = arrayString.trim();
//        //substring() là 1 API đẻ lấy ra 1 string con (từ index nào đó cho đến 1 index nào đó)
//        arrayString = arrayString.substring(0, arrayString.length()-1);

        arrayString.append("]");
        return arrayString.toString();
    }

    public static void testArraytoString(){
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(arrayToString(array));
    }

    public static boolean contain(int[] array, int key){
        //ok được gán là fasle, khi đã chuyển sang true thì không thể chuyển sang false lần nữa
        boolean ok = false;

        //Vòng lặp chỉ để đọc, không sửa các phần tử dữ liệu nên dùng for-each
        for (int element: array) {
            if (element == key){
                ok = true;
                return true; // thuật toán đã tìm kiến thành công, không cần tìm kiếm nữa nên dùng return để break
            }
        }
        return false;
    }

    public static int search(int[] array, int key){
        //Nếu array bị lỗi, k sử dụng vòng lặp và thoát khỏi chương trình, in -1
        if (array == null){
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static boolean equal(int[] left, int[] right){
        if ((left == null) || (right == null)){
            return false;
        }

        if (left.length != right.length){
            return false;
        }

        for (int i = 0; i < left.length; i++) {
            if (left[i] != right[i]){
                return false;
            }
        }
        return true;
    }

    public static int[] copyOf(int[] array){
//       int[] newArray = array;  => Sai, không tạo ra mảng mới newArray sẽ trỏ tới Array (Array đổi tên thành newArray)

        int[] newArray = new int[array.length];  //cấp phát mảng mới
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];            //copy phần tử của array sang newArray
        }

        System.arraycopy(array,0, newArray,0, array.length);
        return newArray;
    }

    public static boolean swap (int[] array1, int[] array2) {
        int[] buffer = new int[array1.length];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Array of Elements: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter the Second Array of Elements: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }
        System.out.println("Before Swapping");
        System.out.println("First Array: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("\nSecond Array: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                buffer[i] = array1[i];
                array1[i] = array2[i];
                array2[i] = buffer[i];
            }
            System.out.println("\nArrays after Swapping");
            System.out.println("First Array: ");
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + " ");
            }
            System.out.println("\nSecond Array: ");
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array2[i] + " ");
            }
        } else {
            return false;
        }
        return true;
    }

    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

    public static String decToRadix(int decimal, int radix){
        final String DIGITS = "afdbf";
        StringBuilder radixString = new StringBuilder();
        while(decimal >0){
            int lastDigit = decimal % radix;
            radixString.insert(0, DIGITS.charAt(lastDigit));
            decimal /= radix;

        }
        return radixString.toString();
    }
}
