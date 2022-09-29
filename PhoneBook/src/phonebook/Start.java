/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

/**
 *
 * @author Shashank Mondrati
 * @version 12/2/2021
 */
import java.util.*;

public class Start { // class name

    static Scanner sc = new Scanner(System.in).useDelimiter("\n"); // tried it..seems to work
    static int choice;

    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();
        initialize(book);
        try {
            while (true) {
                displayMenu();
                if (choice == 0) {
                        System.out.println("Thanks for using PhoneBook");
                    break;

                }

                switch (choice) {
                    case 1:
                        System.out.println("1. Adding an entry");
                        System.out.println(" Enter the Name");
                        String addName = sc.next();
                        System.out.println(" Enter the number");
                        String addNum = sc.next();
                        book.addEntry(addName, addNum);
                        break;
                    case 2:
                        System.out.println("2. Editing an entry");
                        System.out.println(" What's the name you wish to EDIT?");
                        String editName = sc.next();
                        System.out.println(" What's the number you wish to EDIT?");
                        String editNum = sc.next();
                        book.editEntry(editName, editNum);
                        break;

                    case 3:
                        System.out.println("3. LookingUP phone number");
                        System.out.println(" What's the name you wish to lookUp?: ");
                        String lookName = sc.next();
//                        System.out.println(lookName);
                        System.out.println("Your number: " + book.searchPhoneNumber(lookName));
//                        System.out.println("Your number is " + book.searchPhoneNumber(lookName));

                        break;

                    case 4:
                        System.out.println("4.Removing an entry");
                        System.out.println("What's the name you wish to remove?: ");
                        String remName = sc.next();
                        book.removeEntry(remName);
                        break;

                    case 5:
                        System.out.println("5. Printing out phone book");
                        book.printBook();

                        break;

                }
                continue;

            }

        } catch (InputMismatchException e) {
            System.out.println(" Invalid Input");
            //e.printStackTrace();
        }
    }

    public static void initialize(PhoneBook book) {
        book.addEntry("Roxanne Hughes", "443-555-2864");
        book.addEntry("Juan Alberto Jr.", "410-555-9385");
        book.addEntry("Rachel Phillips", "310-555-6610");
        book.addEntry("Shashank Mondrati", "888-888-9999");

    }

    public static void displayMenu() {
        System.out.println("1. Add an entry");
        System.out.println("2. Edit an entry");
        System.out.println("3. Lookup phone number");
        System.out.println("4. Remove an entry");
        System.out.println("5. Print out phone book");
        System.out.println("0. Exit");
        choice = sc.nextInt();

    }
}
