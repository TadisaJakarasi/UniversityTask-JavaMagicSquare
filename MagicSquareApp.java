/*
 * @author Tadisa Jakarasi
 * @date 06/08/2024
 * Week 10- Lab Task
 */


public class MagicSquareApp {
    public static void main(String[] args) {
        char[][] magicSquare = {
                { 'P', 'R', 'E', 'Y' },
                { 'L', 'A', 'V', 'A' },
                { 'O', 'V', 'E', 'R' },
                { 'T', 'E', 'N', 'D' }
        }; // declaring and initializing the 2D array
        displaySquare(magicSquare); // calling the displaySquare method
        System.out.println(); // for space in between
        int row = 2;
        displayRow(magicSquare, row); // to display row 2
        System.out.println(); // for space in between
        int column = 3;
        System.out.println();
        displayColumn(magicSquare, column); // to display column 4
    }

    static void displaySquare(char[][] magicSquare) // accepts and displays the magicSquare array
    {
        for (int row = 0; row < magicSquare.length; row++) // loop for row
        {
            for (int column = 0; column < magicSquare[row].length; column++) // loop for column
            {
                System.out.print(magicSquare[row][column] + " "); // displaying all the rows and columns
            }
            System.out.println(); // for space in between
        }
    }

    static void displayRow(char[][] magicSquare, int row) // accepts and displays the value in the row
    {
        for (int i = 0; i < magicSquare[row].length; i++) // loop condition
        {
            System.out.print(magicSquare[row][i]); // displaying the row and taking 1 off the row
        }
    }


    static void displayColumn(char[][] magicSquare, int column) // accepts and displays the value in the column
    {
        for (int i = 0; i < magicSquare.length; i++) // loop condition
        {
            System.out.println(magicSquare[i][column]); // displaying the desired column
        }
    }
}

