package indexOfHighestValue;
// Given an array (or list) of integers, you need to find and return the index of the highest value in the array.
// indexOfHighest([-1, 0, 5, 1, 5, 3, 4, 3]) => 2
// Use of Function
// returns the first index of 5, which is 2.
public class solution1 {
    public static void main(String[] args){
        int[] numsArray = {-1, 0, 5, 1, 5, 3, 4, 3};
        int highNum = numsArray[0];
        int highIndex = 0;
        for(int i = 0; i < 8; i++){
            if(numsArray[i] > highNum){
                highNum = numsArray[i];
                highIndex = i;
            }
        }
        System.out.println(highIndex);
    }
}
