package arrayPractice;

public class ReverseTwoDimensionalArray {

//    In this task, you need to implement reverseElements method.
//    It should reverse all rows of the twoDimArray as in the example below.
//    It is guaranteed that twoDimArray has at least 1 row.
//    P.S. You don't need to print anything in this task or create a new array:
//    just modify the existing twoDimArray

//    0 0 9 9              9 9 0 0
//    1 2 3 4 will become: 4 3 2 1
//    5 6 7 8              8 7 6 5

    public static void main(String[] args) {

        int[][] twoDimArray = {
                {0, 0, 9, 9}, // first array of ints
                {1, 2, 3, 4}, // second array of ints
                {5, 6, 7, 8}  // third array of ints
        };

        reverseElements(twoDimArray);
    }
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length / 2; j++) {
                int temp = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[i][twoDimArray[i].length - j - 1];
                twoDimArray[i][twoDimArray[i].length - j - 1] = temp;
            }
        }

        // print
        for (int i = 0; i < twoDimArray.length; i++) {
                for (int j = 0; j < twoDimArray[i].length; j++) {
                    System.out.print(twoDimArray[i][j] + " ");
                }
                System.out.println();
        }
    }
}
