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
public class TextPost extends Post{ // textPost extends post
    String text; // variable

    // getters and setters below
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    //default constructor
    public TextPost(String text, User user, String date, String time) {
        super(user, date, time);
        this.text = text;
    }
    
    
    
    
}
