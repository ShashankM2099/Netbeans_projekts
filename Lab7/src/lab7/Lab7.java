/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.*;

/**
 *
 * @author [Shashank Mondrati]
 * @version [11/15/2020]
 */
public class Lab7 { // class name

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException { // main method
        // TODO code application logic here
        BookChapter bookChapter1 = BookChapterReadWrite.loadBookChapterFromFile("slaughterhouse_five_chapter_1.txt");
        BookChapterReadWrite.writeBookChapterToFile(bookChapter1, "slaughterhouse_chapter.txt");

        BookChapter bookChapter2 = BookChapterReadWrite.loadBookChapterFromFile("game_of_thrones_chapter_1.txt");
        BookChapterReadWrite.writeBookChapterToFile(bookChapter2, "game_of_thrones_chapter.txt");
        
         

    }

}
