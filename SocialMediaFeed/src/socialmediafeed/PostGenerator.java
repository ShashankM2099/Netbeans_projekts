
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.imageio.ImageIO;
import socialmediafeed.*;

/**
 *
 * @author [Shashank Mondrati]
 * @version [11/18/2020]
 */
public class PostGenerator { // class name

    private final ArrayList<User> users; // arrList
    private final Random rng; // final random var

    private File[] images;
    private String[] captions; // pvt variables initialized
    private String[] texts;

    public PostGenerator(ArrayList<User> users) { // constructor
        // Assign users field
        this.users = users;

        // Instantiate the Random object
        rng = new Random();

        /*
        Get the images, image captions, and texts        
         */
        // Get the images
        File imageDirectory = new File("resources/images");
        images = imageDirectory.listFiles();
        // Strip off the 1st one because that's the caption file
        images = Arrays.copyOfRange(images, 1, images.length);

        // Get the captions
        captions = new String[images.length];
        try {
            Scanner scan = new Scanner(new File("resources/images/captions.txt"));
            for (int i = 0; i < captions.length; i++) {
                captions[i] = scan.nextLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        // Get the texts
        try {
            Scanner scan = new Scanner(new File("resources/text_posts.txt"));
            int count = 0;
            while (scan.hasNextLine()) {
                count++;
                scan.nextLine();
            }
            texts = new String[count];
            scan = new Scanner(new File("resources/text_posts.txt"));
            for (int i = 0; i < count; i++) {
                texts[i] = scan.nextLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    // getters and setters below
    public File[] getImages() {
        return images;
    }

    public void setImages(File[] images) {
        this.images = images;
    }

    public String[] getCaptions() {
        return captions;
    }

    public void setCaptions(String[] captions) {
        this.captions = captions;
    }

    public String[] getTexts() {
        return texts;
    }

    public void setTexts(String[] texts) {
        this.texts = texts;
    }
    // getting month based on numbers if 1= month=january
    private String getMonthStr(int month) {
        if (month == 1) {
            return "January";
        } else if (month == 2) {
            return "February";
        } else if (month == 3) {
            return "March";
        } else if (month == 4) {
            return "April";
        } else if (month == 5) {
            return "May";
        } else if (month == 6) {
            return "June";
        } else if (month == 7) {
            return "July";
        } else if (month == 8) {
            return "August";
        } else if (month == 9) {
            return "Septemeber";
        } else if (month == 10) {
            return "October";
        } else if (month == 11) {
            return "November";
        } else if (month == 12) {
            return "December";
        }
        return null;
    }
    // generating textPost using random variables
    public Post generateTextPost(String date, String time) {
        int textIndex = rng.nextInt(texts.length);
         int userIndex = rng.nextInt(users.size());
         TextPost textPost = new TextPost(texts[textIndex], users.get(userIndex), date, time);
    return textPost;
    
    }
    //generating imagePost using random variables and throws IOexcepttion
    public Post generateImagePost(String date, String time)throws IOException{
        int imagetIndex = rng.nextInt(images.length); // images length
        int capIndex = rng.nextInt(captions.length); // caption length
         int userIndex = rng.nextInt(users.size());
    ImagePost imagePost = new ImagePost(ImageIO.read(images[imagetIndex]), captions[capIndex], users.get(userIndex), date, time);
    return imagePost;
    }
    
    public Post generatePost() throws IOException { // generating post using random of Users
        int postIndex = rng.nextInt(2);
        int month = rng.nextInt(11);
        String date = getMonthStr(month + 1) + " " + (rng.nextInt(30) + 1); // Month + date and time AM or PM
        String time = String.valueOf(rng.nextInt(12)) + ":"
                + String.valueOf(rng.nextInt(60)) + " " + (rng.nextInt(2) == 1 ? "PM": "AM"); 
        if (postIndex == 0) {
         return generateTextPost(date, time);
        }  else {
            return generateImagePost(date, time);
        }
    }
    
    public Post[] generatePost(int num) throws IOException { // generating Array of Posts using for loop
        //User user, String date, String time,String dateAndTime
        Post[] posts = new Post[num];
    for (int i=0;i<num;i++) {
        posts[i] = generatePost();
    }
    return posts;
    
    }
   

}
