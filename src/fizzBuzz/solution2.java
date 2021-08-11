package fizzBuzz;

// Print integers 1 to N,
// but print “Fizz” if an integer is divisible by 3,
// “Buzz” if an integer is divisible by 5,
// and “FizzBuzz” if an integer is divisible by both 3 and 5. (Should not print "fizz" or "buzz" separately)

public class solution2 {
    public static void main(String[] args){
        int selectedNumber = 15;
        for(int i = 1; i <= selectedNumber; i++){
            String word = i + " - ";
            if(i%3 == 0){
                word += "Fizz";
            }
            if(i%5 == 0){
                word += "Buzz";
            }
            System.out.println(word);
        }
    }
}
