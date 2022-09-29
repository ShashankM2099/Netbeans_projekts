/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6project;

/**
 *
 * @author [Shashank Mondrati]
 * @version [10/29/2020]
 */
public class Student extends Person {

    private String major;
    public double gpa;
    public String name;
    public int id;

    @Override
    public String toString() {
        return "Student{" + "major=" + major + ", gpa=" + gpa + ", name=" + name + ", id=" + id + '}';
    }

    public Student(String name, int id, String major, double gpa) {
        super(name, id);
        this.major = major;
        this.gpa = gpa;
        this.name = name;
        this.id = id;
    }

    /**
     * Get the value of major
     *
     * @return the value of major
     */
    public String getMajor() {
        return major;
    }

    /**
     * Get the value of gpa
     *
     * @return the value of gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Set the value of major
     *
     * @param major new value of major
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * Set the value of gpa
     *
     * @param gpa new value of gpa
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
