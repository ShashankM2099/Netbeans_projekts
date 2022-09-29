/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author [Shashank Mondrati]
 * @version [11/15/2020]
 */
public class Page { // class name

    private String[] lines;
// getters and setters
    public Page(int numLines) {
        this.lines = new String[numLines];
    }

    public Page(String[] l) {
        this.lines = l;
    }

    public String[] getLines() {
        return lines;
    }

    public void setLines(String[] lines) {
        this.lines = lines;
    }

}
