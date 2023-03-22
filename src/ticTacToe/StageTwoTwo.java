package ticTacToe;
import java.util.Scanner;

public class StageTwoTwo {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // User Input
        System.out.println(">");
        String userInput = scanner.next();
        // Multidimensional Array of Board
        Character[][] boardArray = {
                {userInput.charAt(0), userInput.charAt(1), userInput.charAt(2)},
                {userInput.charAt(3), userInput.charAt(4), userInput.charAt(5)},
                {userInput.charAt(6), userInput.charAt(7), userInput.charAt(8)}

        };
        // Method Calls
        printBoard(userInput, boardArray);
    }

    public static void printBoard(String userInput, Character[][] boardArray) {
        System.out.println("Enter cells: " + userInput);
        System.out.println("---------");
        System.out.println("| " + boardArray[0][0] + " " + boardArray[0][1] + " " + boardArray[0][2] + " |");
        System.out.println("| " + boardArray[1][0] + " " + boardArray[1][1] + " " + boardArray[1][2] + " |");
        System.out.println("| " + boardArray[2][0] + " " + boardArray[2][1] + " " + boardArray[2][2] + " |");
        System.out.println("---------");
    }
}