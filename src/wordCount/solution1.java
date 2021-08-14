package wordCount;

//Create a function that takes in a sentence as a string input parameter and prints out the number of words in the sentence.
//        Examples of input and output:
//        — “Hello, my name is Doug.” should print out “5”.
//        — “What’s up dude?” should print out “3”.
//        — “Yes.” should print out “1”.

public class solution1 {
    public static void main(String[] args){
        String sentence = "What’s up dude?";
        String[] words = sentence.split(" ");
        System.out.println(words.length);
    }
}
