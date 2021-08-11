package niscInterviewProblem;

public class solution3 {
    public static void main(String[] args){
        String word = "cabbage";
        int wordScore = 0;
        String[] letters = word.split("");
        for(int j = 0; j < letters.length; j++){
            if("aeioulnrst".contains(letters[j])){
                wordScore++;
            }
            if("dg".contains(letters[j])){
                wordScore = wordScore + 2;
            }
            if("bcmp".contains(letters[j])){
                wordScore = wordScore + 3;
            }
            if("fhvwy".contains(letters[j])){
                wordScore = wordScore + 4;
            }
            if("k".contains(letters[j])){
                wordScore = wordScore + 5;
            }
            if("jx".contains(letters[j])){
                wordScore = wordScore + 8;
            }
            else if("qz".contains(letters[j])){
                wordScore = wordScore + 10;
            }
        }
        System.out.println(wordScore);
    }
}
