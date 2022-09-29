/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitydriver;

/**
 *
 * @author Shashank MOndrati
 * @version [10/8/2020] Description: Student CLASS file
 * Lab - III
 */
public class Student {

    String firstName;
    char middleInitial;
    String lastName;
    String studentId;
    int age;
    boolean liveOnCampus;
    double balance;

    /**
     * @param fName is the first name of the student
     * @param lName is the last name
     * @param mInitial is the mid-initials
     * @param ID is the student id
     * @param studentAge is the student's age
     * @param isLiveOnCampus is if the student lives on campus or not
     */
    public Student(String fName, char mInitial, String lName, String ID, int studentAge, boolean isLiveOnCampus) {
        firstName = fName;
        middleInitial = mInitial;
        lastName = lName;
        studentId = ID;
        age = studentAge;
        liveOnCampus = isLiveOnCampus;
    }

    /**
     * @return statement to get the student's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return statement to get middle initial
     */
    public char getMiddleInitial() {
        return middleInitial;
    }

    /**
     * @return statement to get last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return statement to get the student's student id number
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @return statement to get the age of the student
     */
    public int getAge() {
        return age;
    }

    /**
     * @return statement to determine if the student lives on campus or not
     */
    public boolean isLiveOnCampus() {
        return liveOnCampus;
    }

    /**
     *
     * @param fName constructor that creates and initializes the objects with
     * the values passed to get the student's first name
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * @param mInitial constructor that creates and initializes students middle
     * initial
     */
    public void setMiddleInitial(char mInitial) {
        middleInitial = mInitial;
    }

    /**
     * @param lName constructor that creates and initializes the students
     * LastName
     */
    public void setLastName(String lName) {
        lastName = lName;
    }

    /**
     * @param ID that creates student ID
     */
    public void setStudentId(String ID) {
        studentId = ID;
    }

    /**
     * @param studentAge constructor that creates and initializes the objects
     * with the values passed to get the student's age
     */
    public void setAge(int studentAge) {
        age = studentAge;
    }

    /**
     *
     * @param isLiveOnCampus constructor that creates and initializes the
     * objects with the values passed to get the student's living situation
     */
    public void setLiveOnCampus(boolean isLiveOnCampus) {
        liveOnCampus = isLiveOnCampus;
    }

    /**
     *
     * @return statement to get the student's balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param amount transferToCard to call the amount of money being
     * transferred from the object created
     */
    public void transferToCard(double amount) { // transfer to card method returns nothing

        if (amount > 0) { // if statement
            balance += amount;
            System.out.println("Balance : " + balance);
        } else { // else statement
            System.out.println("The transfer amount must be greater than 0");
        }
    }

    /**
     * @param amount payFromCard to call the amount of money being transferred
     * from the object created
     */
    public void payFromCard(double amount) { // pay from card method
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Sorry, your balance is too low!");
        }
    }
}
