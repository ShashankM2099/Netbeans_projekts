package lab7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author [Shashank Mondrati]
 * @version [11/15/2020]
 */
import java.util.*;

public class BookChapter {

    public BookChapter(int l) { // constructor
        this.linesPerPage = l;
    }
    // getters and setters below
    public BookChapter(int l, ArrayList<Page> p) {
        this.linesPerPage = l;
        this.pages = p;
    }

    public BookChapter(int l, ArrayList<Page> p, String t, String a) {
        this.linesPerPage = l;
        this.pages = p;
        this.title = t;
        this.author = a;
    }

//    @Override
//    public String toString() {
//        return "BookChapter{" + "linesPerPage=" + linesPerPage + ", pages=" + pages + ", title=" + title + ", author=" + author + '}';
//    }

    @Override
    public String toString(){ // constructor
    return "Title: "+title + "\n"
            + "Author: " + author + "\n"
            + "Pages: " +pages.size() + "\n"
            + "LinesPerPage: " +linesPerPage;   
    }
    
    

    private int linesPerPage;
    private ArrayList<Page> pages;
    private String title;
    private String author;
    

    public int getLinesPerPage() {
        return linesPerPage;
    }

    public void setLinesPerPage(int linesPerPage) {
        this.linesPerPage = linesPerPage;
    }

    public ArrayList<Page> getPages() {
        return pages;
    }

    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
}
