package lastLetterRemove;
//Create a function that takes a string input parameter and prints out that string with its last letter missing.
//        Examples of input and output:
//        — Passing in “laboratory” should print out “laborator”
//        — Passing in “proof” should print out “proo”
//        — Passing in “interference” should print out “interferenc”
//        Must use substring() method
public class solution2 {
    public static void main(String[] args){
        String word = "interference";
        System.out.println(word.substring(0, word.length()-1));
    }
}
