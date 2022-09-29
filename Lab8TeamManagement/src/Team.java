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
import java.util.*; // imported *

public class Team { //class name

    private String name;
    private String city; //private variables
    public ArrayList<Player> player = new ArrayList<>(); // private arrayList

    @Override
    public String toString() { // modified toString
        String output = name + "\n"
                + city +"\n"
                + "PLAYERS" +"\n";
          
        for (Player player: player) { // for spacing
            output = output + player;
        }
        return output;
    }

    public Team(String name, String city) { // constructor
        this.name = name;
        this.city = city;

    }
            //BELOW are setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Player> getPlayer() {
        return player;
    }

    public void setPlayer(ArrayList<Player> player) {
        this.player = player;
    }

    public void addPlayer(Player p) { // adding players to arrList
        player.add(p);
    }

    public void sortPlayers() { // sorting using collection.sort
        Collections.sort(player);
    }

}
