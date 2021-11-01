package arrayPractice;
import java.util.Scanner;

//        Write a program that reads an array of ints and outputs the number of "triples" in the array.
//        A "triple" is three consecutive ints in increasing order differing by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not).
//        Input data format:
//        The first line contains the size of an array.
//        The second line contains elements of the array separated by spaces.
//        Output data format:
//        Only a single integer value: the number of "triples".
//        Sample Input 1:
//        6
//        1 2 4 5 6 7
//        Sample Output 1:
//        2
//
//        Sample Input 2:
//        6
//        1 4 7 5 4 3
//        Sample Output 2:
//        0

public class totalTriples {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // reading length in
        int arraySize = scanner.nextInt();
        int[] numsArray = new int[arraySize];
        int totalTriples = 0;

        // reading array in
        for (int i = 0; i < arraySize; i++) {
            numsArray[i] = scanner.nextInt();
        }

        // counting triples
        for (int j = 1; j < arraySize - 1; j++) {
            // compares the value of a given index to the value of the index before and after it
            if (numsArray[j] == numsArray[j - 1] + 1 && numsArray[j] == numsArray[j + 1] - 1) {
                totalTriples++;
            }
        }
        System.out.println(totalTriples);
    }
}
