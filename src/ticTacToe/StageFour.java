package ticTacToe;
import java.util.Scanner;

public class StageFour {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initial User Input
        System.out.println(">");
        String userInput = scanner.nextLine().toUpperCase();
        // Multidimensional array of board
        Character[][] boardArray = {
                {userInput.charAt(0), userInput.charAt(1), userInput.charAt(2)},
                {userInput.charAt(3), userInput.charAt(4), userInput.charAt(5)},
                {userInput.charAt(6), userInput.charAt(7), userInput.charAt(8)}
        };
        printBoard(userInput, boardArray);
        // Next Move
        nextMove(boardArray);
    }

    public static void printBoard(String userInput, Character[][] boardArray) {
        System.out.println("Enter cells: " + userInput);
        System.out.println("---------");
        System.out.println("| " + boardArray[0][0] + " " + boardArray[0][1] + " " + boardArray[0][2] + " |");
        System.out.println("| " + boardArray[1][0] + " " + boardArray[1][1] + " " + boardArray[1][2] + " |");
        System.out.println("| " + boardArray[2][0] + " " + boardArray[2][1] + " " + boardArray[2][2] + " |");
        System.out.println("---------");
    }

//    Analyze the game state and print the result.
//    In this stage, we will assume that either X or O can start the game.
//    You can choose whether to use a space or underscore _ to print empty cells.
    public static void gameState(String userInput,Character[][] boardArray) {

        // Checking for X wins or O wins
        // diagonal wins
        boolean xNWToSEWin = boardArray[0][0] == 'X' && boardArray[1][1] == 'X' && boardArray[2][2] == 'X';
        boolean xSWToNEWin = boardArray[2][0] == 'X' && boardArray[1][1] == 'X' && boardArray[0][2] == 'X';
        boolean oNWToSEWin = boardArray[0][0] == 'O' && boardArray[1][1] == 'O' && boardArray[2][2] == 'O';
        boolean oSWToNEWin = boardArray[2][0] == 'O' && boardArray[1][1] == 'O' && boardArray[0][2] == 'O';
        boolean xDiagonalWin = xNWToSEWin || xSWToNEWin;
        boolean oDiagonalWin = oNWToSEWin || oSWToNEWin;
        // horizontal wins
        boolean xRow1Win = userInput.regionMatches(true, 0, "XXX", 0, 3);
        boolean xRow2Win = userInput.regionMatches(true, 3, "XXX", 0, 3);
        boolean xRow3Win = userInput.regionMatches(true, 6, "XXX", 0, 3);
        boolean oRow1Win = userInput.regionMatches(true, 0, "OOO", 0, 3);
        boolean oRow2Win = userInput.regionMatches(true, 3, "OOO", 0, 3);
        boolean oRow3Win = userInput.regionMatches(true, 6, "OOO", 0, 3);
        boolean xHorizontalWin = xRow1Win || xRow2Win || xRow3Win;
        boolean oHorizontalWin = oRow1Win || oRow2Win || oRow3Win;
        // vertical wins
        boolean xColumn1Win = boardArray[0][0] == 'X' && boardArray[1][0] == 'X' && boardArray[2][0] == 'X';
        boolean xColumn2Win = boardArray[0][1] == 'X' && boardArray[1][1] == 'X' && boardArray[2][1] == 'X';
        boolean xColumn3Win = boardArray[0][2] == 'X' && boardArray[1][2] == 'X' && boardArray[2][2] == 'X';
        boolean oColumn1Win = boardArray[0][0] == 'O' && boardArray[1][0] == 'O' && boardArray[2][0] == 'O';
        boolean oColumn2Win = boardArray[0][1] == 'O' && boardArray[1][1] == 'O' && boardArray[2][1] == 'O';
        boolean oColumn3Win = boardArray[0][2] == 'O' && boardArray[1][2] == 'O' && boardArray[2][2] == 'O';
        boolean xVerticalWin = xColumn1Win || xColumn2Win || xColumn3Win;
        boolean oVerticalWin = oColumn1Win || oColumn2Win || oColumn3Win;
        // X wins when the grid has three X’s in a row (including diagonals).
        boolean xWins = xDiagonalWin || xVerticalWin || xHorizontalWin;
        // O wins when the grid has three O’s in a row (including diagonals).
        boolean oWins = oDiagonalWin || oVerticalWin || oHorizontalWin;

        // Impossible when the grid has three X’s in a row as well as three O’s in a row,
        // or there are a lot more X's than O's or vice versa (the difference should be 1 or 0;
        // if the difference is 2 or more, then the game state is impossible).
        // xWins && oWins || x - o > 1 || o - x > 1
        // x counter
        int xTotal = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'X') {
                xTotal++;
            }
        }
        // o counter
        int oTotal = 0;
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'O') {
                oTotal++;
            }
        }
        boolean impossible = xWins && oWins || xTotal - oTotal > 1 || oTotal - xTotal > 1;

        //Game not finished when neither side has three in a row but the grid still has empty cells.
        // contains "_" or " " && !xWins && !oWins
        boolean gameNotFinished = userInput.contains(" ") || userInput.contains("_") && !impossible && !xWins && !oWins;

        // Draw when no side has a three in a row and the grid has no empty cells.
        // does NOT contain "_" || " " && !xWins && !oWins
        boolean draw = !xWins && !oWins && (!userInput.contains(" ") || !userInput.contains("_"));

        // game state output
        if (gameNotFinished) {
            System.out.println("Game not finished");
        } else if (impossible) {
            System.out.println("Impossible");
        } else if (draw) {
            System.out.println("Draw");
        } else if (xWins) {
            System.out.println("X wins");
        } else if (oWins) {
            System.out.println("O wins");
        }
    }
//    1. Get the initial 3x3 grid from the input as in the previous stages.
//    Here the user should input 9 symbols representing the field, for example, _XXOO_OX_.
//    Output this 3x3 grid as in the previous stages.
    public static void nextMove(Character[][] boardArray) {
        //    2. Prompt the user to make a move.
        //    The user should input 2 coordinate numbers that represent the cell where they want to place their X, for example, 1 1.
        System.out.println(">");
        String nextUserInput = scanner.nextLine();
        //    3. Analyze user input. If the input is incorrect, inform the user why their input is wrong:
        //    Print This cell is occupied! Choose another one! if the cell is not empty.
        //    Print You should enter numbers! if the user enters non-numeric symbols in the coordinates input.
        //    Print Coordinates should be from 1 to 3! if the user enters coordinates outside the game grid.
        //    Keep prompting the user to enter the coordinates until the user input is valid.
        int coordinate1 = Character.getNumericValue(nextUserInput.charAt(0)) - 1;
        int coordinate2 = Character.getNumericValue(nextUserInput.charAt(2)) - 1;
        char selectedCellContents = boardArray[coordinate1][coordinate2];
        boolean cellOccupied = selectedCellContents == 'X' || selectedCellContents == 'O';
        boolean notNumbers = !Character.isDigit(nextUserInput.charAt(0)) && !Character.isDigit(nextUserInput.charAt(2));
        boolean outOfRange = coordinate1 > 3 || coordinate1 < 1 || coordinate2 > 3 || coordinate2 < 1;
        if (notNumbers) {
            System.out.println("You should enter numbers!");
            System.out.println(">");
            String validInput = scanner.nextLine();
        } else if (cellOccupied) {
            System.out.println("This cell is occupied! Choose another one!");
            System.out.println(">");
            String validInput = scanner.nextLine();
        } else if (outOfRange) {
            System.out.println("Coordinates should be from 1 to 3!");
            System.out.println(">");
            String validInput = scanner.nextLine();
            boardArray[validInput.charAt(0) - 1][validInput.charAt(2) - 1] = 'X';
        } else {
            boardArray[coordinate1][coordinate2] = 'X';
        }
        //    4. If the input is correct, update the grid to include the user's move and print the updated grid to the console.
        //    To summarize, you need to output the field 2 times:
        //    once before the user's move (based on the first line of input) and
        //    once after the user has entered valid coordinates (then you need to update the grid to include that move).
        System.out.println("---------");
        System.out.println("| " + boardArray[0][0] + " " + boardArray[0][1] + " " + boardArray[0][2] + " |");
        System.out.println("| " + boardArray[1][0] + " " + boardArray[1][1] + " " + boardArray[1][2] + " |");
        System.out.println("| " + boardArray[2][0] + " " + boardArray[2][1] + " " + boardArray[2][2] + " |");
        System.out.println("---------");
    }
}
