package findingDuplicates;

// Given a string of integers, you need to find all of the duplicates.
// Example: "1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5" Duplicates: 2,3,3,4,4,4,5,5,5,5
// Print a list of integers that are duplicates

import java.util.ArrayList;

public class problem2 {
    public static void main(String[] args){
        int[] numList = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        for(int i = 0; i < numList.length; i++){
            if(integerList.contains(numList[i])){
                System.out.println(numList[i]);
            }
            else{
                integerList.add(numList[i]);
            }
        }
    }
}
