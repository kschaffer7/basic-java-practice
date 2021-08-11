package findingDuplicates;

// Given a string of alphabetic characters, you need to find all of the duplicates.
// Example: "hellooworrrld" Duplicates: l, o, o, r, r, l
// The string will always have only lowercase alphabetic characters. It can be an empty string.
// Print a list of letters that are duplicates


import java.util.ArrayList;

public class problem1 {
    public static void main(String[] args){
        String charString = "hellooworrrld";
        ArrayList<Character> charList = new ArrayList<Character>();
        for(int i = 0; i < charString.length(); i++){
            if(charList.contains(charString.charAt(i))){
                System.out.println(charString.charAt(i));
            }
            else{
                charList.add(charString.charAt(i));
            }
        }
    }
}
