package lastLetterRemove;

//Create a function that takes a string input parameter and prints out that string with its last letter missing.
//        Examples of input and output:
//        — Passing in “laboratory” should print out “laborator”
//        — Passing in “proof” should print out “proo”
//        — Passing in “interference” should print out “interferenc”

public class solution1 {
    public static void main(String[] args){
        String word = "interference";
        String lastLetterRemove = "";
        for(int i = 0; i < word.length(); i++){
            if(i < (word.length() - 1)){
                lastLetterRemove += word.charAt(i);
            }
        }
        System.out.println(lastLetterRemove);
    }
}
