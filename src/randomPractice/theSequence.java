package randomPractice;
import java.util.Scanner;

public class theSequence {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int iLength = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                iLength++;
                if (iLength <= n) {
                    System.out.print(i + " ");
                } else {
                    break;
                }
            }
        }
    }
}
