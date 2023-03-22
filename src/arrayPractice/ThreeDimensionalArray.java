package arrayPractice;

import java.util.Arrays;

// You need to implement the createCube method.
// It should create a 3x3x3 three-dimensional array with the following content:
//
//        [0, 1, 2]	[3, 4, 5] [6, 7, 8]
//        [0, 1, 2]	[3, 4, 5] [6, 7, 8]
//        [0, 1, 2]	[3, 4, 5] [6, 7, 8]

public class ThreeDimensionalArray {

    public static void main(String[] args) {
        createCube();
    }

    public static int[][][] createCube() {
        // write your code here
        // build cube
        final int rows = 3;
        final int columns = 3;
        final int itemsPerCell = 3;
        int[][][] cube = new int[rows][columns][itemsPerCell];
        int element = 0;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = element;
                    element++;
                }
            }
            element = 0;
        }
        // Print cube
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                System.out.print(Arrays.toString(cube[i][j]) + " ");
            }
            System.out.println();
        }
        return cube;
    }
}
