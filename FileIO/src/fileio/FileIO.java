/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.*;

/**
 *
 * @author [Shashank Mondrati]
 * @version [11/12/2020]
 */
public class FileIO { // class name

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String fileName = "C:\\Users\\sudha\\OneDrive\\Documents\\NetBeansProjects\\FileIO\\src\\fileio\\english.txt";
//        String fileName2 = "C:\\Users\\sudha\\OneDrive\\Documents\\NetBeansProjects\\FileIO\\src\\fileio\\copy.txt";
//        String fileName3 = "C:\\Users\\sudha\\OneDrive\\Documents\\NetBeansProjects\\FileIO\\src\\fileio\\piglatin.txt";
        // TODO code application logic here
        copyFile("english.txt", "copy.txt");
        translateFile("english.txt", "piglatin.txt");
    }

    public static void copyFile(String fileName, String fileName2) { // method name
        BufferedReader reader = null; // using Buffer reader and writer to read and write files
        BufferedWriter writer = null;
        try { // try and catch block if any exceptions occur
            reader = new BufferedReader(new FileReader(fileName));
            writer = new BufferedWriter(new FileWriter(new File(fileName2)));
            String line = null; // a null string
            while ((line = reader.readLine()) != null) { // while loop
                // read next line
                writer.write(line);
                writer.newLine();
                System.out.println(line);
            }
            reader.close();
            writer.close();
        } catch (IOException e) { // catch statement
            e.printStackTrace();
        }

    }

    public static void translateFile(String fileName, String fileName2) { // translating to pigLatin
       
        BufferedReader reader = null; // same
        BufferedWriter writer = null;
        try { // try and catch block
            reader = new BufferedReader(new FileReader(fileName));
            writer = new BufferedWriter(new FileWriter(new File(fileName2)));
            String line = null;
            String modifiedLine;
            while ((line = reader.readLine()) != null) {
                //translate to pig latin version
                modifiedLine = "";
                String[] words = line.split(" ");
                if (words.length > 1) {
                    for (String word : words) {
                        char firstAlpha = word.charAt(0);
                        modifiedLine = modifiedLine + word.substring(1, word.length()) + firstAlpha + "ay" + " ";
                    }
                } else if (words.length == 1) {
                    char firstAlpha = line.charAt(0);
                    modifiedLine = line.substring(1, line.length()) + firstAlpha + "ay";
                } else {
                    System.out.println("Empty Line");
                }

                writer.write(modifiedLine);
                writer.newLine();
                System.out.println(modifiedLine);

            }
            reader.close();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
