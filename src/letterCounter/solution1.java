package letterCounter;

// Build a function that takes in a word or multiple words.
// Have the function look for the letter "k" and output the total.

public class solution1 {
    public static void main(String[] args){
        int totalKs = 0;
        String[] kNames = {"Kirsti", "Kathy", "Kiki", "Niki"};
        for(int i = 0; i < kNames.length; i++){
            String[] letters = kNames[i].toLowerCase().split("");
            for(int l = 0; l < letters.length; l++){
                if(letters[l].equals("k")){
                    totalKs++;
                }
            }
        }
        System.out.println(totalKs);
    }
}
