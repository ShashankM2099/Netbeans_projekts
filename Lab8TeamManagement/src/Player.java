/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author [Shashank Mondrati]
 * @version [11/19/2020]
 */
import java.util.Comparator; // java comparator

public class Player implements Comparable<Player> { // class name

    private String name;
    private int age;
    private int jerseyNumber;
    Position position;

    public Player(String name, int age, int jerseyNumber, Position position) { // default constructor
        this.name = name;
        this.age = age;
        this.jerseyNumber = jerseyNumber; // this variables
        this.position = position;
    }

    @Override
    public String toString() { // toString method
        return name +"\t"+ age +"\t"+ jerseyNumber +"\t"+ position + "\n";
    }

    public Position getPosition() { // getting positions
        return position;
    }

    public void setPosition(Position position) { // setting positions
        this.position = position;
    }

    public String getName() { // getting Name
        return name;
    }

    public void setName(String name) { // setting name
        this.name = name;
    }

    public int getAge() { // getting age
        return age;
    }

    public void setAge(int age) { // setAge
        this.age = age;
    }

    public int getJerseyNumber() {// get Jersey NUm
        return jerseyNumber;
    }

    public void setJerseyNumber(int number) { // setting jersery #
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public int compareTo(Player player) { // comparing method
        
        //compare by position and jersey number
        int positionOrder = this.position.compareTo(player.position);
        if (positionOrder == 0) { // if position equals 0
            if(this.jerseyNumber == player.getJerseyNumber()) { //if jerseyNum equals same number
                return 0; // return 0
            } else if (this.jerseyNumber < player.getJerseyNumber()) { // if less
                return -1; // return -1
            } else {
            return 1; // or return 1
            } 
        } else if (positionOrder < 1) {
            return -1;
        } else {
            return 1;
        }
    }

}
