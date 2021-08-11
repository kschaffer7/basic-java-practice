package wwtInterviewProblems.problem1;

public class solution2 {
    public static void main(String[] args){
        String word = "cabbage";
        String onePoint = "aeioulnrst";
        String twoPoint = "dg";
        String threePoint = "bcmp";
        String fourPoint = "fhvwy";
        String fivePoint = "k";
        String eightPoint = "jx";
        String tenPoint = "qz";
        int wordScore = 0;
        String[] letters = word.split("");
        for(int j = 0; j < letters.length; j++){
            if(onePoint.contains(letters[j])){
                wordScore++;
            }
            if(twoPoint.contains(letters[j])){
                wordScore = wordScore + 2;
            }
            if(threePoint.contains(letters[j])){
                wordScore = wordScore + 3;
            }
            if(fourPoint.contains(letters[j])){
                wordScore = wordScore + 4;
            }
            if(fivePoint.contains(letters[j])){
                wordScore = wordScore + 5;
            }
            if(eightPoint.contains(letters[j])){
                wordScore = wordScore + 8;
            }
            else if(tenPoint.contains(letters[j])){
                wordScore = wordScore + 10;
            }
        }
        System.out.println(wordScore);
    }
}
