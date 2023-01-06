public class ReverseInt {
    static int rev = 0;

    // Function to reverse the number
    static void reverse(int n){
        if (n<=0)
            return ;
        int rem = n%10;  // remainder
        rev = (rev*10) + rem;
        reverse(n/10);
    }

    // Driver Function
    public static void main (String[] args) {
        int n = 4526;
        reverse(n);
        System.out.print("Reversed Number is "+ rev);
    }
}
