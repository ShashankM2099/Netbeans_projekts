/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shashank Mondrati
 * @version 12/2/2021
 */
public class PhoneBookEntry {

    private String name;
    private String phoneNumber;

    public PhoneBookEntry(String name, String number) {
        this.name = name;
        this.phoneNumber = number;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhonenumber(String number) {
        phoneNumber = number;
    }

    public void printPhoneBookEntry() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
