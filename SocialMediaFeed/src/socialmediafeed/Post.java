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
public class Post {
    User user;
    String date; // variables
    String time;

    //getters and setters below
    public String getDateAndTime() {
        return date + ", "+ time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // default constructor
    public Post(User user, String date, String time) {
        this.user = user;
        this.date = date;
        this.time = time;
    }
    
}
