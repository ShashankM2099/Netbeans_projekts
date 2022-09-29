/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author [Shashank Mondrati]
 * @version [11/15/2020]
 */
public class BookChapterReadWrite {

    /**
     *
     * @param slaughterhouse_five_chapter_1
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static BookChapter loadBookChapterFromFile(String filename)
            throws FileNotFoundException, IOException {
        BookChapter book = new BookChapter(0);
        ArrayList<Page> pages = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        BufferedReader countReader = new BufferedReader(new FileReader(filename));
        book.setTitle(reader.readLine());
        book.setAuthor(reader.readLine());
        book.setLinesPerPage(Integer.valueOf(reader.readLine()));
        Page page = getPage(reader, (int) countReader.lines().count() - 3);
        pages.add(page);
        book.setPages(pages);
        reader.close();
        return book;

    }

    public static void writeBookChapterToFile(BookChapter book, String filename) throws FileNotFoundException, IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (Page page : book.getPages()) {
            for (String line : page.getLines()) {
                writer.write(line);
                writer.newLine();
            }
        }
        writer.close();

    }

    private static Page getPage(BufferedReader reader, int numLines) { // getting page
        try {
            Page page = new Page(numLines);
            String[] lines = new String[numLines];
            for (int i = 0; i < numLines; i++) {
                lines[i] = reader.readLine();
            }
            page.setLines(lines);
            return page;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }

}
