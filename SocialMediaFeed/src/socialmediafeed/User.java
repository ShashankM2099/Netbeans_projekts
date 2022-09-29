/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmediafeed;

/**
 *
 * @author [Shashank Mondrati]
 * @version [11/18/2020]
 */
public class User { // class name
    
    String name; // String name
    // getters and setters below

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
    
}
