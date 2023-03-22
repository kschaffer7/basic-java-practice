package arrayPractice;
import java.util.Scanner;

//Given the number n, not greater than 100,
// create a matrix of size n×n and fill it using the following rule.
// Numbers 0 should be stored on the primary (main) diagonal.
// The two diagonals, adjacent to the primary one, should contain numbers 1.
// The next two diagonals should contain numbers 2; etc.
// Note: the primary diagonal runs from the top left corner to the bottom right corner.
// Sample Input 1:
// 5
// Sample Output 1:
// 0 1 2 3 4
// 1 0 1 2 3
// 2 1 0 1 2
// 3 2 1 0 1
// 4 3 2 1 0

public class FillTheMatrix {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What size array?");
        int matrixSize = scanner.nextInt();
        matrixArray(matrixSize);
    }

    public static void matrixArray(int matrixSize) {
        final int rows = matrixSize;
        final int columns = matrixSize;

        int[][] rowsArray = new int[rows][columns];
        for (int i = 0; i < rowsArray.length; i++) {
            for (int j = 0; j < rowsArray[i].length; j++) {
                rowsArray[i][j] = Math.abs(i - j);
                System.out.print(rowsArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
