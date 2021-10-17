package calculatingSlope;
import java.util.Scanner;

// You are given coordinates of two queens on a chess board. Find out whether or not they can capture each other.
// Input data format: Four Integer Numbers x1, y1, x2, y2
// Output data format
// Type "YES" (uppercase) if they hit each other or "NO" if they don't.
//        Sample Input 1:
//        1 1 3 3
//        Sample Output 1:
//        YES

//        Sample Input 2:
//        1 1 4 3
//        Sample Output 2:
//        NO

//        Sample Input 3:
//        2 2 5 2
//        Sample Output 3:
//        YES

public class chessQueens {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        // queen A has x1 and y1 coordinates
        // queen B has x2 and y2 coordinates
        int x1queenA = scanner.nextInt();
        int y1queenA = scanner.nextInt();
        int x2queenB = scanner.nextInt();
        int y2queenB = scanner.nextInt();

        // queen A and B can hit each other if they share either an x or a y coordinate, or slope = 1

        // slope must have an absolute value of 1 and can't have a remainder
        int slope = Math.abs((y2queenB - y1queenA) / (x2queenB - x1queenA));
        int slopeRemainder = Math.abs((y2queenB - y1queenA) % (x2queenB - x1queenA));
        boolean slopeEqualsOne = slope == 1 && slopeRemainder <= 0;

        boolean canCapture = x1queenA == x2queenB || y1queenA == y2queenB || slopeEqualsOne;

        if (canCapture) {
             System.out.println("YES");
        } else {
             System.out.println("NO");
        }
    }
}
