/**
 *
 * @author [Shashank Mondrati]
 * version @ [10/15/2020]
 *
 */
package Lab4;

import java.io.*;
import java.util.InputMismatchException; // imported variables
import java.util.Scanner;

public class Lab4 { //class name

    static Scanner input; // static scanner variable input

    public static void main(String[] args) {
        Integer sum = addUserInput();
        System.out.println(sum); // method call
        System.out.println("The quotient is " + divideUserInput()); // method call
        divideFromFile();
    }

    public static int addUserInput() { // method
        boolean processCompleted = false;
        Integer var1 = null; //variables for userInput
        Integer var2 = null;
        while (!processCompleted) {
            input = new Scanner(System.in);
            try {
                if (var1 == null) {
                    var1 = getUserInput();
                }
                if (var2 == null) {
                    var2 = getSecondUserInput();
                }
                Integer sum = var1 + var2;
                processCompleted = true;
                return sum;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
            }
        }
        return 0;
    }

    private static Integer getUserInput() { // getUserInput
        Integer var = null;
        System.out.println(" Please enter an integer:");
        var = input.nextInt();
        return var;
    }

    private static Integer getSecondUserInput() { // get userInput
        Integer var = null;
        System.out.println(" Please enter a second integer:");
        var = input.nextInt();
        return var;
    }

    public static int divideUserInput() { // divide userInput
        boolean processCompleted = false;
        Integer div1 = null; //variables for userInput
        Integer div2 = null;
        while (!processCompleted) {
            input = new Scanner(System.in);
            try {
                if (div1 == null) {
                    div1 = getUserInput();
                }
                if (div2 == null) {
                    div2 = getSecondUserInput();
                }
                Integer div = (div1 / div2);
                processCompleted = true;
                return div;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
            } catch (ArithmeticException e1) {
                System.out.println("Invalid arithmetic.");
                div2 = null;
            }

        }

        return 0;
    }

    public static void divideFromFile() { // dividing from file method
        try {

            File file = new java.io.File("C:\\Users\\sudha\\OneDrive\\Documents\\dir\\myTestFile.txt");

            boolean fileMatched = false;

            while (!fileMatched) {
                System.out.println(" Enter the fileName:");
                String fileName = input.next();
                if (fileName != null && fileName.equals("myTestFile.txt")) {
                    fileMatched = true;
                }
            }

            Scanner x = new Scanner(file);

            if (!x.hasNext()) {
                System.out.println("The file did not contain valid data");
            }
            while (x.hasNext()) {
                String a = x.next();
                String[] doubles = a.split(",");
                try {
                    double double1 = Double.valueOf(doubles[0]);
                    double double2 = Double.valueOf(doubles[1]);
                    System.out.println(double1 / double2);
                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    System.out.println("The file did not contain valid data");
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(" File not Found ");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
