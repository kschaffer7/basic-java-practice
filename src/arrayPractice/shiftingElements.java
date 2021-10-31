package arrayPractice;
import java.util.Scanner;

// Write a program that reads an array of ints
// the program then places the last element to the front
// and cyclically shift the elements of the array to the right
// Input data format:
// The first line of the input contains the number of elements in the array. The second line contains the elements of the array.
// Output data format:
// The single line should contain all shifted elements of the array. Elements must be separated by the space character.
//        Sample Input 1:
//        5
//        1 2 3 4 5
//        Sample Output 1:
//        5 1 2 3 4
//
//        Sample Input 2:
//        6
//        4 5 3 4 2 3
//        Sample Output 2:
//        3 4 5 3 4 2

public class shiftingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int arrayLength = scanner.nextInt();
        int[] numsArray = new int[arrayLength];
        // Iterates the elements of the array
        for (int i = 0; i < arrayLength; i++) {
            numsArray[i] = scanner.nextInt();
        }
        // Prints the last element
        System.out.print(numsArray[arrayLength - 1] + " ");
        // Then prints the remaining elements shifted by the new first element
        for (int k = 0; k < arrayLength - 1; k++) {
            System.out.print(numsArray[k] + " ");
        }
    }
}
