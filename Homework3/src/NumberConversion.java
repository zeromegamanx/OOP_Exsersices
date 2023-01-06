import java.util.Scanner;
public class NumberConversion {
    public static void main(String[] args) {

        //String binary = toBinaryString(number);
        Scanner input = new Scanner(System.in);

        System.out.println("Number Conversion Systems \n");

        // Display the menu
        System.out.println("1.\t Decimal to Binary");
        System.out.println("2.\t Decimal to Hexadecimal");
        System.out.println("3.\t Binary to Decimal");
        System.out.println("4.\t Hexadecimal to Decimal \n");
        System.out.println("Your choice?");

        //Get user's choice
        int choice = -1;
        while (choice < 0 || choice > 4) {
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter Decimal Number");
                    break;
                case 2:
                    System.out.println("\nEnter Decimal Number");
                    break;
                case 3:
                    System.out.println("\nEnter Binary");
                    break;
                case 4:
                    System.out.println("\nEnter Hexadecimal");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please choose a number between 1 and 4.");
                    break;

            }
        }

        switch (choice) {
            case 1: System.out.println("\nEnter Decimal Number");
                break;
            case 2: System.out.println("\nEnter Decimal Number");
                break;
            case 3: System.out.println("\nEnter Binary");
                break;
            case 4: System.out.println("\nEnter Hexadecimal");
                break;
            default:
                System.out.println("\nInvalid choice. Please choose a number between 1 and 4.");
                choice = input.nextInt();
                break;

        }

        if (choice == 1) {
            int number = input.nextInt();
            String binary = toBinaryString(number);
            binary = recursive(number);
            System.out.printf("Decimal to Binary (%d) = %s", number, binary);
        }

        else if (choice == 2) {
            int number2 = input.nextInt();
            String hexadecimal = toHexString(number2);
            hexadecimal = recursiveDecHex(number2);
            System.out.printf("Decimal to Hexadecimal (%d) = %s ", number2, hexadecimal);
        }

        else if (choice == 3 ) {
            String binary2 = input.next();
            int decimal = toDecimalUsingParseInt(binary2);
            decimal = recursiveBin(binary2);
            System.out.printf("\n2. Binary to decimal - recursive(%s) = %d ", binary2, decimal);
        }

        else {
            String hex = input.next();
            int decimal = toHexUsingParseInt(hex);
            decimal = recursiveHexDec(hex);
            System.out.printf("Hexadecimal to Decimal (%s) = %d ", hex, decimal);
        }

        input.close();
    }

    private static String toBinaryString(int number) {
        return Integer.toBinaryString(number);
    }

    private static String toHexString(int number) {
        return Integer.toHexString(number);
    }

    private static int toDecimalUsingParseInt(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }

    private static int toHexUsingParseInt(String number) {
        return Integer.parseInt(number, 16);
    }

    private static String recursive(int number) {
        StringBuilder builder = new StringBuilder();

        if (number > 0) {
            String binaryNumber = recursive(number / 2);
            int digit = number % 2;
            builder.append(binaryNumber + digit);
        }
        return builder.toString();
    }

    private static String recursiveDecHex(int number) {
        StringBuilder builder = new StringBuilder();
        if (number > 0) {
            String hexNumber = recursiveDecHex(number / 16);
            String hexCode = "0123456789ABCDEF";
            int hexDigit = number % 16;
            builder.append(hexNumber + hexCode.charAt(hexDigit));
        }
        return builder.toString();
    }

    private static int recursiveBin(String binaryNumber) {
        int decimal = 0;
        int length = binaryNumber.length();
        if (length > 0) {
            String substring = binaryNumber.substring(1);
            int digit = Character.getNumericValue(binaryNumber.charAt(0));
            decimal = digit * (int) Math.pow(2, length - 1) + recursiveBin(substring);
        }
        return decimal;

    }

    private static int recursiveHexDec(String hexNumber) {
        int decimal = 0;
        String hexCode = "0123456789ABCDEF";
        hexNumber = hexNumber.toUpperCase();
        int length = hexNumber.length();
        if (length > 0) {
            char ch = hexNumber.charAt(0);
            int digit = hexCode.indexOf(ch);
            String substring = hexNumber.substring(1);
            decimal = digit * (int) Math.pow(16, length - 1) + recursiveHexDec(substring);
        }
        return decimal;
    }
}
