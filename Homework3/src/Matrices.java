import java.util.Random;
import java.util.Scanner;

public class Matrices {
    static Scanner sc = new Scanner((System.in));

    public static void createRandomMatrix(int [][] matrix) {
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++) {
                //random trong khoảng từ 50 đến 100
                matrix[row][column] = (int) (Math.random() * (100 - 50) + 50);
            }
        }
    }

    public static int[][] createRandomMatrix(int row, int col) {
        int matrix[][] = new int[row][col];
        for (row = 0; row < matrix.length; row++) {
            for (col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void print1(int[][] matrix) {
        System.out.println("Nhập vào số dòng của mảng: ");
        int rowSize = sc.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        int colSize = sc.nextInt();
        matrix = new int[rowSize][colSize];
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                System.out.print( matrix[rowSize][colSize] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void print2(double[][] matrix) {
        System.out.println("Nhập vào số dòng của mảng: ");
        int rowSize = sc.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        int colSize = sc.nextInt();
        matrix = new double[rowSize][colSize];
        for (double row = 0; row < rowSize; row++) {
            for (double col = 0; col < colSize; col++) {
                System.out.print( matrix[rowSize][colSize] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        matrix1 = new int[rowSize][colSize];
        matrix2 = new int[rowSize][colSize];
        if(matrix1[rowSize][colSize] == matrix2[rowSize][colSize]) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        int[][] matrix3 = new int[rowSize][colSize];
        matrix1 = new int[rowSize][colSize];
        matrix2 = new int[rowSize][colSize];
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                matrix3[row][col] = matrix1[row][col] + matrix2[row][col];
            }
            System.out.println("\n");
        }
        return matrix3;
    }

    public static int[][] sub(int[][] matrix1, int[][] matrix2) {
        int rowSize = sc.nextInt();
        int colSize = sc.nextInt();
        int[][] matrix3 = new int[rowSize][colSize];
        matrix1 = new int[rowSize][colSize];
        matrix2 = new int[rowSize][colSize];
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                matrix3[row][col] = matrix1[row][col] - matrix2[row][col];
            }
            System.out.println("\n");
        }
        return matrix3;
    }

    public static int[][] multi(int[][] matrix1, int[][] matrix2) {
        int rowSize1 = sc.nextInt();
        int colSize1 = sc.nextInt();
        int rowSize2 = sc.nextInt();
        int colSize2 = sc.nextInt();
        int[][] matrix3 = new int[rowSize1][colSize2];
        matrix1 = new int[rowSize1][colSize1];
        matrix2 = new int[rowSize2][colSize2];
        for (int row = 0; row < rowSize1; row++) {
            for (int col = 0; col < colSize2; col++) {
                matrix3[row][col] = 0;
                for (int i = 0; i < colSize1; i++) {
                    matrix3[row][col] = matrix3[row][col] + matrix1[row][i] * matrix2[i][col];
                }
            }
            System.out.println("\n");
        }
        return matrix3;
    }

    public static void main(String[] args) {
        int[][] argMatrix = new int[5][5];
        createRandomMatrix(argMatrix);
    }
}
