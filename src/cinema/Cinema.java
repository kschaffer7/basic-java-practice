package cinema;

import java.util.Scanner;

public class Cinema {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // User Input
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = scanner.nextInt();

        // method calls
        seatingArrangement(seatsPerRow, rows);
//        profit(rows, seatsPerRow);
    }

     // Stage 1
     public static void seatingArrangement(int seatsPerRow, int rows) {
        // Title row
         System.out.println("Cinema:");

         // First theater row
         String[] seatsPerRowInfoArray = new String[seatsPerRow + 1];
         for (int i = 0; i < seatsPerRow + 1; i++) {
             if (i == 0) {
                 seatsPerRowInfoArray[i] = " ";
             } else {
                 seatsPerRowInfoArray[i] = Integer.toString(i);
             }
             System.out.print(seatsPerRowInfoArray[i] + " ");
         }
         System.out.println();

         // Preceding theater rows
         String[][] rowsArray = new String[rows][seatsPerRow + 1];
         for (int i = 0; i < rowsArray.length; i++) {
             for (int j = 0; j < rowsArray[i].length; j++) {
                 if (j == 0) {
                     rowsArray[i][j] = Integer.toString(i + 1);
                 } else {
                     rowsArray[i][j] = "S";
                 }
                 System.out.print(rowsArray[i][j] + " ");
             }
             System.out.println();
         }
     }

     // Stage 2
     public static void profit(int rows, int seatsPerRow) {

         int totalSeats = rows * seatsPerRow;
         int totalProfit;

         // If totalSeats are less than 60, each ticket is 10 dollars
         // Otherwise, tickets are 10 dollars for the front half of the rows and 8 dollars for the back half
         if (totalSeats < 60) {
             totalProfit = totalSeats * 10;
         } else {
             int totalFrontSeats = (rows / 2) * seatsPerRow;
             int totalBackSeats = rows * seatsPerRow - totalFrontSeats;
             int frontProfit = totalFrontSeats * 10;
             int backProfit = totalBackSeats * 8;
             totalProfit = frontProfit + backProfit;
         }

         System.out.println("Total income: $" + totalProfit);
     }

     // Stage 3

}
