package firstThree;

//Create a function that takes a string input parameter and prints out the first 3 letters of that string.
//
//        Examples of input and output:
//        — Passing in “discreet” should print out “dis”
//        — Passing in “flourish” should print out  “flo”
//        — Passing in “do” should print out “do”

public class solution1 {
    public static void main(String[] args){
        String word = "flourish";
        String firstThree = "";
        for(int i = 0; i < word.length(); i++){
            if(i < 3){
                firstThree += word.charAt(i);
            }
        }
        System.out.println(firstThree);
    }
}
