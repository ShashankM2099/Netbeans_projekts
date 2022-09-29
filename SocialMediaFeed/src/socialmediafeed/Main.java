
import java.util.ArrayList;
import javax.swing.JFrame;
import socialmediafeed.ImagePost;
import socialmediafeed.*;


/**
 *
 * @author [Shashank Mondrati]
 * @version [11/18/2020]
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        /*
            1. Creating some User objects...        
        */
        User user = new User("Savitar");
        User user2 = new User ("Miguel O'Hara");
        User user3 = new User("Optimus Prime");
        User user4 = new User(" BumbleBee");
        User user5 = new User(" Eivor ViKing");
        ArrayList<User> users = new ArrayList<>(); // and creating
        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
     
        PostGenerator posts = new PostGenerator(users);
        
        /*
            Create the GUI window
            DO NOT ADD OR CHANGE CODE BELOW THIS POINT EXCEPT WHERE SPECIFIED        
        */
        Window myGUI = new Window();
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGUI.pack();
        myGUI.setVisible(true);
        
        // ADD YOUR ARRAY OF POSTS AS AN ARGUMENT TO THIS METHOD CALL
        myGUI.displayPosts(posts.generatePost(users.size()));
    }
    
}
