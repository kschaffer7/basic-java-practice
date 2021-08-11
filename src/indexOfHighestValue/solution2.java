package indexOfHighestValue;

import java.util.ArrayList;

// Given an array (or list) of integers, you need to find and return the index of the highest value in the array.
// indexOfHighest([-1, 0, 5, 1, 5, 3, 4, 3]) => 2
// Use of Function
// Returns both indexes of 5 in an ArrayList, which are 2 and 4. Output: [2, 4]
public class solution2 {
    public static void main(String[] args){
        int[] numsArray = {-1, 0, 5, 1, 5, 3, 4, 3};
        int highNum = numsArray[0];
        ArrayList<Integer> highIndexArrayList = new ArrayList<>();
        for(int i = 0; i < numsArray.length; i++){
            if(numsArray[i] > highNum){
                highNum = numsArray[i];
            }
        }
        for(int i = 0; i < numsArray.length; i++){
            if(numsArray[i] == highNum){
                highIndexArrayList.add(i);
            }
        }
        System.out.println(highIndexArrayList);
    }
}
