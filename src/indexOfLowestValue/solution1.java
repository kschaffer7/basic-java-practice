package indexOfLowestValue;
// Given an array (or list) of integers, you need to find and return the index of the lowest value in the array.
// indexOfLowest([-1, 0, 5, 1, 5, 3, 4, 3]) = 0
// Use of Function
// returns the first index of -1, which is 0.

public class solution1 {
    public static void main(String [] args){
        int[] numsArray = {-1, 0, 5, 1, 5, 3, 4, 3};
        int lowNum = numsArray[0];
        int lowIndex = 0;
        for(int i = 0; i < numsArray.length; i++){
            if(numsArray[i] < lowNum){
                lowNum = numsArray[i];
                lowIndex = i;
            }
        }
        System.out.println(lowIndex);
    }
}
