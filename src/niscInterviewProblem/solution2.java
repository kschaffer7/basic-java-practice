package niscInterviewProblem;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class solution2 {
    public static void main(String[] args){
        int totalTwos = 0;
        for(int i = 0; i <= 23; i++){
//            System.out.println(Integer.toString(i).split(""));
            String[] digits = Integer.toString(i).split("");
            for(int j = 0; j < digits.length; j++){
                if(digits[j].equals("2")){
                    totalTwos++;
                }
            }
        }
        System.out.println(totalTwos);
    }
}
