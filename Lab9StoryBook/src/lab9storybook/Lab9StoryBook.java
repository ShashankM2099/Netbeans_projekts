/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9storybook;

/**
 *
 * @author Shashank Mondrati
 * @version 12/3/2020
 */
public class Lab9StoryBook {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // main method
        // TODO code application logic here
        StorybookModel myModel = new StorybookModel();
        StartFrame myStartFrame = new StartFrame(myModel) ;
        myStartFrame.setVisible(true);
    }
    
}
