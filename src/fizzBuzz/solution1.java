package fizzBuzz;

// Print integers 1 to N,
// but print “Fizz” if an integer is divisible by 3,
// “Buzz” if an integer is divisible by 5,
// and “FizzBuzz” if an integer is divisible by both 3 and 5. (Should not print "fizz" or "buzz" separately)

public class solution1 {
    public static void main(String[] args){
        int selectedNumber = 15;
        for(int i = 1; i <= selectedNumber; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0){
                System.out.println("Fizz");
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
            }
        }
    }
}
