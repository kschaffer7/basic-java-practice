package stringInString;

//Create a function that takes 2 string input parameters and prints out the number of times the second string is found in the first string.
//Examples of input and output:
//— Passing in “His burrito has four kinds of cheese in it” for the first parameter” and “cheese” for the second parameter should print out “1”.
//— Passing in “The quick brown fox jumped over the lazy dog” for the first parameter and “the” for the second parameter” should print out “2”.

public class solution1 {
    public static void main(String[] args){
        String sentence = "The quick brown fox jumped over the lazy dog";
        String word = "the";
        int instancesOfWord = 0;
        String[] wordsInSentence = sentence.split(" ");
        for(int i = 0; i < wordsInSentence.length; i++){
            if(wordsInSentence[i].toLowerCase().contains(word)){
                instancesOfWord++;
            }
        }
        System.out.println(instancesOfWord);
    }

}
