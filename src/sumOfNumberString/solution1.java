package sumOfNumberString;

//Create a function that takes a string input parameter of integers and prints out the sum of those integers.
//        Examples of input and output:
//        — Passing in “12” should print out “3”
//        — Passing in “1342345” should print out “22”
//        — Passing in “2020202” should print out “8”

public class solution1 {
    public static void main(String[] args){
        String numberString = "2020202";
        int numberSum = 0;
        // Loop through the numberString
        for(int i = 0; i < numberString.length(); i++){
            // Convert each character in numberString to a number
            int number = Character.getNumericValue(numberString.charAt(i));
            // Add each number together
            numberSum = numberSum + number;
        }
        System.out.println(numberSum);
    }
}
