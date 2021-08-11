package indexOfLowestValue;

// Given an array (or list) of integers, you need to find and return each index of the lowest value in the array.
// indexOfLowest([-1, 0, 5, -1, 5, 3, 4, 3]) = 0
// Use of Function
// returns each index of -1, which is 0 and 3.

public class solution2 {
    public static void main(String[] args){
        int[] numsArray = {-1, 0, 5, -1, 5, 3, 4, 3};
        int lowNum = numsArray[0];
        for(int i = 0; i < numsArray.length; i++){
            if (numsArray[i] < lowNum) {
                lowNum = numsArray[i];
            }
        }
        for(int i = 0; i < numsArray.length; i++){
            if (numsArray[i] == lowNum) {
                System.out.println(i);
            }
        }
    }
}
