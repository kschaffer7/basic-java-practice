package integersInStringSum;

//Create a function that takes a string input parameter and prints out the sum of the integers inside of that string.
//        Examples of input and output:
//        — Passing in “Easy as 1, 2, 3” should print out “6”.
//        — Passing in “There are no numbers” should print out “0”.
//        - Passing in "My friends are age 28, 30, 33, 37" should print out "128"

// eliminate words, punctuation, and spacing.
public class solution2 {
    public static void main(String[] args){
        String string = "My friends are age 28, 30, 33, 37";
        int numberSum = 0;
        String newString = "";

        for(int i = 0; i < string.length(); i++){
            if(Character.getNumericValue(string.charAt(i)) <= 9) {
                newString += string.charAt(i);
            }
        }

        String[] numbers = newString.replace(",", "").split(" ");
        for(int j = 0; j < numbers.length; j++){
//            System.out.println(numbers[j]);
//            int number = Integer.valueOf(numbers[j]);
//            System.out.println(number);
            try{
                int number = Integer.valueOf(numbers[j]);
                //System.out.println(number);
                numberSum = numberSum + number;
            }
            catch (NumberFormatException ex){
//                ex.printStackTrace();
            }

        }
        System.out.println(numberSum);
    }
}
