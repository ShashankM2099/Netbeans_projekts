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
import java.awt.*;
public class ImagePost extends Post{ //extending post
    Image image;
    String caption;// variables
    
//getters and setters
    //below

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    // default constrctor
    public ImagePost(Image image, String caption, User user, String date, String time) {
        super(user, date, time); // super class
        this.image = image;
        this.caption = caption;
    }
    
}
