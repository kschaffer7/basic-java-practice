package ticTacToe;
import java.util.Scanner;

public class StageTwo {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // User Input
        System.out.println(">");
        String userInput = scanner.next();
        printBoard(userInput);
    }

    public static void printBoard(String userInput) {
        System.out.println("Enter cells: " + userInput);
        System.out.println("---------");
        System.out.println("| " + userInput.charAt(0) + " " + userInput.charAt(1) + " " + userInput.charAt(2) + " |");
        System.out.println("| " + userInput.charAt(3) + " " + userInput.charAt(4) + " " + userInput.charAt(5) + " |");
        System.out.println("| " + userInput.charAt(6) + " " + userInput.charAt(7) + " " + userInput.charAt(8) + " |");
        System.out.println("---------");
    }
}