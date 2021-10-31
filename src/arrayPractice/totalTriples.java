package arrayPractice;
import java.util.Scanner;

public class totalTriples {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numsArray = new int[arraySize];
        int currentNum = 0;
        int ascendingSequenceCount = 0;
        int maxSequence = 2;
        int totalTriples = 0;
        for (int i = 0; i < arraySize; i++) {
            numsArray[i] = scanner.nextInt();
            if (currentNum == numsArray[i] - 1) {
                ascendingSequenceCount++;
            } else if (ascendingSequenceCount == maxSequence){
                totalTriples++;
                ascendingSequenceCount = 0;
            } else {
                currentNum = numsArray[i];
            }
        }
        System.out.println(ascendingSequenceCount);
    }
}
