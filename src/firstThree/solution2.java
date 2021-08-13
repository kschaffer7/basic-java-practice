package firstThree;

//Create a function that takes a string input parameter and prints out the first 3 letters of that string.
//
//        Examples of input and output:
//        — Passing in “discreet” should print out “dis”
//        — Passing in “flourish” should print out  “flo”
//        — Passing in “do” should print out “do”

public class solution2 {
    public static void main(String[] args){
        String word = "do";
        if(word.length() > 3){
            System.out.println(word.substring(0,3));
        }
        else {
            System.out.println(word);
        }
    }
}
