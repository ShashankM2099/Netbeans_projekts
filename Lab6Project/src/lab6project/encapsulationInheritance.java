/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6project;

import java.util.*;

/**
 *
 * @author [Shashank Mondrati]
 * @version [10/29/2020]
 */
public class encapsulationInheritance { // class name

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Person> list = new ArrayList<Person>();
        Person u = new Person("Alice", 1000);
        list.add(u);
        Person a = new Student("Keisha", 900, "CS", 3.5);
        list.add(a);
        Person b = new Student("Felipe", 901, "CS", 3.2);
        list.add(b);
        Person c = new Professor("Jamika", 300, "CS", 10100);
        list.add(c);
        Person d = new Person("Tala", 1001);
        list.add(d);
        Person e = new Professor("Julio", 400, "Math", 85000);
        list.add(e);
        Person f = new Student("Huan", 902, "CS", 3.6);
        list.add(f);
        Person g = new Student("Hank", 903, "Engineering", 3.9);
        list.add(g);
        Person h = new Student("Mike", 904, "Math", 2.8);
        list.add(h);
        Person i = new Professor("Azzari", 500, "CS", 10000);
        list.add(i);
        Person j = new Professor("Juan", 500, "CS", 98000);
        list.add(j);

        for (Person p : list) {
            System.out.println(p);
        }
    }
}
