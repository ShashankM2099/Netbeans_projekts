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
public class Professor extends Person {

    private String department;
    private double salary;
    public String name;
    public int id;

    @Override
    public String toString() {
        return "Professor{" + "department=" + department + ", salary=" + salary + ", name=" + name + ", id=" + id + '}';
    }

    public Professor(String name, int id, String department, double salary) {
        super(name, id);
        this.department = department;
        this.salary = salary;
        this.id = id;
        this.name = name;
    }

    /**
     * Get the value of salary
     *
     * @return the value of salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Get the value of department
     *
     * @return the value of department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Set the value of department
     *
     * @param department new value of department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Set the value of salary
     *
     * @param salary new value of salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
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
