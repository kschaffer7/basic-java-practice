package niscInterviewProblem;

// input (int) -> 23
//{2,12,20,21,22,23}
//output -> 7
// iterate from 0 to 23 and return the number of 2s that occurred

import java.util.ArrayList;

public class solution1 {
    public static void main(String[] args){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        int totalTwos = 0;
        for(int i = 0; i < 24; i++){
            myNumbers.add(i);
        }
        // Check to see if each number in the arraylist contains a 2
        // If yes then add 1 to total number of twos which should be 7 and then print 7
        // This logic does not work since "22' contains two "2"s, prints 6 since the logic only counts one "2" in "22"
        for(int i = 0; i < myNumbers.size(); i++){
            String[] digits = myNumbers.get(i).toString().split("");
            for(int j = 0; j < digits.length; j++){
                if(digits[j].equals("2")){
                    totalTwos++;
                }
            }
        }
        System.out.println(totalTwos);
    }
}
