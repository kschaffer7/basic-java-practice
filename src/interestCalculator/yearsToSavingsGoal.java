package interestCalculator;
import java.util.Scanner;

// Ann puts M money in the bank. The bank increases Ann's deposit by P percent every year.
// Ann wants to know how many years should pass until her deposit in the bank reaches K money. Can you help her to answer this question?
// The input contains three integers M, P,K. It is guaranteed that all numbers are positive and K ≥ M.
// Output the answer to Ann's question.
// Sample input 1: 1 100 8 ; Sample output 1: 3
// Sample input 1: 100 15 120 ; Sample output 1: 2
public class yearsToSavingsGoal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mPrincipal = 1; // principal
        int pRate = 100; // annual rate
        int kGoal = 8; // goal amount
        double currentAmount = mPrincipal;
        int years = 0;
        while (currentAmount <= kGoal && kGoal != mPrincipal) {
            currentAmount = currentAmount * (1 + (pRate * .01));
            years++;
            if (currentAmount >= kGoal) {
                break;
            }
        }
        System.out.println(years);
    }
}
