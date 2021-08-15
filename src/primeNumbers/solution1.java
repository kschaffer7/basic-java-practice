package primeNumbers;

//Create a function that takes an integer input parameter and prints out whether or not the integer is a prime number.
//        Examples of input and output:
//        — Passing in 7 should print out “7 is a prime number”.
//        — Passing in 6 should print out “6 is not a prime number”.
//        — Passing in 2 should print out “2 is a prime number”.
//        — Passing in 1 should print out “1 is not a prime number”.
//        — Passing in 0 should print out “0 is not a prime number”.
// A Prime number must be greater than 1
// A prime number must not be divisible by two smaller numbers
// Prime numbers are the numbers that have only two factors, that are, 1 and the number itself.
public class solution1 {
    public static void main(String[] args){
        int number = 2;
        // establishes that a prime number must be greater than 1.
        if(number <= 1){
            System.out.println(number + " is not a prime number.");
        }
        // establishes 2 as a prime number prior to setting up the loop.
        if(number == 2){
            System.out.println(number + " is a prime number.");
        }
        // loop through numbers greater than 1 and less than the number.
        for(int i = 2; i < number; i++){
            // checks if the number is divisible by a number greater than 1, but less than itself, if yes then it is not prime.
            if(number%i == 0){
                System.out.println(number + " is not a prime number.");
                break;
            }
            // checks if the number is divisible by 1 and the number itself.
            else if(number%1 == 0 && number%number == 0){
                System.out.println(number + " is a prime number.");
                break;
            }
        }
    }
}
