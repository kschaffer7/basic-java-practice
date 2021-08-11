package wwtInterviewProblems.problem1;

//Scrabble Score
//        Write a program that, given a word, computes the scrabble score for that word.
//
//        Letter Values
//        You'll need these:
//        Letter                                       Value
//        A, E, I, O, U, L, N, R, S, T       1
//        D, G                                         2
//        B, C, M, P                                3
//        F, H, V, W, Y                            4
//        K                                             5
//        J, X                                         8
//        Q, Z                                        10
//
//        Example: "cabbage" should be scored as worth 14 points:
//
//        3 points for C
//        1 point for A, twice
//        3 points for B, twice
//        2 points for G
//        1 point for E
//        And to total:
//
//        3 + 2*1 + 2*3 + 2 + 1
//        = 3 + 2 + 6 + 3
//        = 5 + 9
//        = 14

public class solution1 {
    public static void main(String[] args){
        String[] word = {"cabbage"};
        String onePoint = "aeioulnrst";
        String twoPoint = "dg";
        String threePoint = "bcmp";
        String fourPoint = "fhvwy";
        String fivePoint = "k";
        String eightPoint = "jx";
        String tenPoint = "qz";
        int wordScore = 0;
        for(int i = 0; i < word.length; i++){
            String[] letters = word[i].toLowerCase().split("");
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
        }
        System.out.println(wordScore);
    }
}
