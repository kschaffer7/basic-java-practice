package integersInStringSum;

//Create a function that takes a string input parameter and prints out the sum of the integers inside of that string.
//        Examples of input and output:
//        — Passing in “Easy as 1, 2, 3” should print out “6”.
//        — Passing in “There are no numbers” should print out “0”.
//        - Passing in "My friends are age 28, 30, 33, 37" should print out "128"

// eliminate words, punctuation, and spacing.
public class solution3 {
    public static void main(String[] args){
        String string = "My friends are age 28, 30, 33, 37.";
        int numberSum = 0;
        String[] words = string.replace(",", "").replace(".", "").split(" ");

        for (String word: words) {
            try {
                int number = Integer.valueOf(word);
                numberSum += number;
            } catch (Exception e) {}
        }

        System.out.println(numberSum);
    }
}
