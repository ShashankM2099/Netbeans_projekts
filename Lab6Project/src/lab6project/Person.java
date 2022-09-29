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
public class Person {

    public String name;
    public int id;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", id=" + id + '}';
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

}
