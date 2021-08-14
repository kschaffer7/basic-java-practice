package sumOfAllEvens;

//Create a function that takes an integer input parameter and prints out the sum of all even numbers
// from 0 up to and including the integer passed in the parameter.
//Examples of input and output:
//— Passing in 5 should print out “6”.
//— Passing in 10 should print out “30”.
//— Passing in 15 should print out “56”.

public class solution1 {
    public static void main(String[] args){
        int number = 15;
        int evensSum = 0;
        for(int i = 0; i <= number; i++){
            if(i%2 == 0){
                //System.out.println(i);
                evensSum = evensSum + i;
            }
        }
        System.out.println(evensSum);
    }
}
