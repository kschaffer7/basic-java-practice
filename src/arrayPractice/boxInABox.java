package arrayPractice;
import java.util.Arrays;
import java.util.Scanner;

public class boxInABox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // determine length of each array
        // in this case, we have 2 boxes (arrays) with 3 dimensions to input (array length is 3)
        int arrayLength = 3;
        int[] box1 = new int[arrayLength];
        int[] box2 = new int[arrayLength];
        int box1Smaller = 0;
        int box2Smaller = 0;

        // build box1 array
        for (int i = 0; i < arrayLength; i++) {
            box1[i] = scanner.nextInt();

        }

        // build box2 array
        for (int j = 0; j < arrayLength; j++) {
            box2[j] = scanner.nextInt();

        }

        // Sort and compare the two arrays
        Arrays.sort(box1);
        Arrays.sort(box2);
        boolean incompatible = false;
        for (int k = 0; k < arrayLength; k++) {
            if (box1[k] < box2[k]) {
                box1Smaller++;
            } else if (box1[k] > box2[k]) {
                box2Smaller++;
            } else if (box1[k] == box2[k]) {
                incompatible = true;
            }
        }

        // Analyze and output the results of the comparison
        if (box1Smaller == 3) {
            System.out.println("Box 1 < Box 2");
        } else if (box2Smaller == 3) {
            System.out.println("Box 1 > Box 2");
        } else if (incompatible) {
            System.out.println("Incompatible");
        }
    }
}
