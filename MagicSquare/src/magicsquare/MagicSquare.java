/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquare;

import java.*;
import java.io.*;
import java.util.*; // imported variables
import magicsquare.MagicSqaureDetector;

/**
 *
 * @author [Shashank Mondrati]
 * @version [12/2/2020]
 */
public class MagicSquare { //class name and has main method

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in); // static scanner sc

    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException { // main method
        // TODO code application logic here
        
        // try catch block
        try {
            System.out.println("Enter your fileName: "); // fileName is "numbers.txt" as in its entirety
            String fileName = sc.next();

            File fileTxt = new File(fileName); // fileName
            sc = new Scanner(fileTxt); // reads the numbers in the file
            //int [][] matrix = new int[3][3];
            Integer[][] matrix = new Integer[3][3]; // shud add the numbers in the arrayList
            int rowIndex = 0;
            int columnIndex;
            while (sc.hasNext()) { // while loop true
                columnIndex = 0;
                String line = sc.nextLine(); // asking the line
                //numberInt.add(t);
                String[] values = line.split(" "); // using split
                for (String value : values) { // enchanced for loop
                    matrix[rowIndex][columnIndex] = Integer.valueOf(value);
                    columnIndex++;
                }
                rowIndex++;
            }
            
            System.out.println(MagicSqaureDetector.magicOrNot(matrix));// checking if its true or not
            if (MagicSqaureDetector.magicOrNot(matrix)) { // if statement
                System.out.println("The combination of numbers " + Arrays.deepToString(matrix) + " is a magic square of order " + MagicSqaureDetector.nbyN
                        + " .The magic constant is 15");

            } else { // else statement
                System.out.println("The combination of " + Arrays.deepToString(matrix) + " is not a magic square");
            }

        } catch (InputMismatchException e) {
            System.out.println(" Input MisMatch");
        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println("Not enough numbers for a magicSquare");
                                                    // catch blocks
        } catch (FileNotFoundException g) {
            System.out.println("File cannot be found");

        } catch (NullPointerException h) {
            System.out.println(" Nothing in the file worth 3x3 ");

        }

    }
}
