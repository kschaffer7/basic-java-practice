package integersInStringSum;

//Create a function that takes a string input parameter and prints out the sum of the integers inside of that string.
//        Examples of input and output:
//        — Passing in “Easy as 1, 2, 3” should print out “6”.
//        — Passing in “There are no numbers” should print out “0”.
public class solution1 {
    public static void main(String[] args){
        String string = "Easy as 1, 2, 3";
        int numberSum = 0;
        for(int i = 0; i < string.length(); i++){
            int number = Character.getNumericValue(string.charAt(i));
            if (number >= 0 && number <= 9) {
                numberSum = numberSum + number;
            }
        }
        System.out.println(numberSum);
    }
}
