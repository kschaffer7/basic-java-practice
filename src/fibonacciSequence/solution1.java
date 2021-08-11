package fibonacciSequence;

// The Fibonacci sequence is one of the most famous formulas in mathematics.
// Each number in the sequence is the sum of the two numbers that precede it.
// So, the sequence goes: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on.
// Print the sequence that occurs between 0 and 34.

import java.util.ArrayList;

public class solution1 {
    public static void main(String[] args){
        int fibonacciNum = 0;
        ArrayList<Integer> fibonacciSequence = new ArrayList<Integer>();
        for(int i = 0; fibonacciNum < 34; i++){
            if(fibonacciNum < 1){
                fibonacciSequence.add(0);
                fibonacciSequence.add(1);
                fibonacciNum = 1;
            }
            if(fibonacciNum >= 1){
                fibonacciNum = fibonacciSequence.get(i) + fibonacciSequence.get(i+1);
                fibonacciSequence.add(fibonacciNum);
            }
        }
        System.out.println(fibonacciSequence);
    }
}
