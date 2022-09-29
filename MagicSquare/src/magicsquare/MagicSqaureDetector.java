/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquare;

/**
 *
 * @author [Shashank Mondrati]
 * @version [12/2/2020]
 *
 */
import java.util.*;


public class MagicSqaureDetector { // class name

    static int nbyN = 3; // 2D array n by n arrays cant be changed so fixing to 3 by 3 2D arr
    static int sumOfRows;
    static int sumOfCols;

    static boolean magicOrNot(Integer matrix[][]) { // boolean if the num is 15 or not
        int sum1st = 0;
        int sum2nd = 0;

        //first diagonal sum if they equal 15 or not
        for (int i = 0; i < nbyN; i++) {
            sum1st += matrix[i][i]; // for diagonal no 1
            //System.out.println("## sum1st1 "+sum1st + ", D1 "+i);
        }
        // secondary diagonal
        for (int i = 0; i < nbyN; i++) {
            sum2nd += matrix[i][nbyN - 1];
            //System.out.println("## sum2nd "+sum2nd + ", D2 "+i);
        }

        if (sum1st != sum2nd) { // if sum of 1st diagonal doesnt equal 2nd diagonal
            return false;
        }

        // summing up the rows
        for (int i = 0; i < nbyN; i++) { // row i
            int sumOfRows = 0;
            for (int j = 0; j < nbyN; j++) { // row j
                sumOfRows += matrix[i][j];
                //System.out.println("## sumOfRows "+sumOfRows + ", i "+i);
                // was just testing the results

            }
        }
        // shud sum up the columns in the 3x3
        for (int i = 0; i < nbyN; i++) {
            int sumOfCols = 0;
            for (int j = 0; j < nbyN; j++) {
                sumOfCols += matrix[j][i];
                //System.out.println("## sumOfCols "+sumOfCols + ", i "+i);
            }

        }
        if (sum1st == 15 && sum2nd == 15) { // if sum of 1st and sum of 2nd equal 15
            if (sumOfRows == 15 && sumOfCols == 15) { // they shud match
                System.out.println("Magic Square");
            }
        } else {
            System.out.println("Not a magicSquare"); // if not they dont    
        }

        return true;

    }

}
