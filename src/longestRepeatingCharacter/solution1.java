package longestRepeatingCharacter;

// Given a string of alphabetic characters, you need to find the length of the longest substring of repeating characters.
// Example: longRepeat("hellooworrrld") => 3
// The string will always have only lowercase alphabetic characters. It can be an empty string.
// The function should return 3 per this example

public class solution1 {
    public static void main(String[] args){
        String charString = "hellooworrrld";
        char currentChar = charString.charAt(0);
        int currentCharacterRepititions = 0;
        int longestRepeater = 0;

        for(int i = 0; i < charString.length(); i++){
            if(charString.charAt(i) == currentChar){
                currentCharacterRepititions++;
            }
            else{
                currentChar = charString.charAt(i);
                currentCharacterRepititions = 1;
            }
            if(currentCharacterRepititions > longestRepeater){
                longestRepeater = currentCharacterRepititions;
            }

        }
        System.out.println(longestRepeater);
    }
}
