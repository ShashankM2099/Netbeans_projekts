/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitydriver;

/**
 *
 * @author Shashank Mondrati
 * @version [10/8/2020]
 *
 */
public class UniversityDriver { // class name

    /**
     * @param args the command line arguments
     * Lab-III
     */
    public static void main(String[] args) { // main method
        System.out.println("@@@@@");
        // TODO code application logic here
        Student mary = new Student("Joan", 'J', "HAra", "8002323", 21, true);
        Student torrance = new Student("Torrance", 'J', "DeLeon",
                "800234567", 19, false);
        System.out.println("Object torrance first name is " + torrance.getFirstName());
        torrance.setFirstName("Michel");
        System.out.println("Object torrance first name is " + torrance.getFirstName());
        Student maria = new Student("Maria", 'L', "Garces", "800555555", 19, true);
        System.out.println(maria.firstName);
        System.out.println(maria.middleInitial);
        System.out.println(maria.lastName);
        System.out.println(maria.studentId);
        System.out.println(maria.age);
        System.out.println(maria.liveOnCampus);
        maria.transferToCard(500);
        maria.transferToCard(250);
        maria.payFromCard(149);
        System.out.println(maria.getBalance());

    }

}
