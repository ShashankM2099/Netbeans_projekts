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
import java.util.*;
import java.io.*;

public class Start { //class name

    public static void main(String[] args) { // main method

        //Part-A
//        Player p1 = new Player("Miles Bridges", 21, 0, Position.FORWARD);
//        Player p2 = new Player("Nicholas Batum", 24, 5, Position.FORWARD);
//        Player p3 = new Player("Malik Monk", 21, 1, Position.GUARD);
//        System.out.println(p1.compareTo(p2));
//        System.out.println(p1.compareTo(p3));
//        System.out.println(p2.compareTo(p3));
        //Part-B
//        Player p1 = new Player("Miles Bridges", 21, 0, Position.FORWARD);
//        Player p2 = new Player("Nicholas Batum", 24, 5, Position.FORWARD);
//        Player p3 = new Player("Malik Monk", 21, 1, Position.GUARD);
//        Team team = new Team("Hornets", "Charlotte");
//        team.addPlayer(p3);
//        team.addPlayer(p1);
//        team.addPlayer(p2);
//        System.out.println(team);
//        System.out.println("Sorting the players\n");
//        team.sortPlayers();
//        System.out.println(team);
//        loadTeamFromFile("C:\\Users\\sudha\\OneDrive\\Desktop\\team.txt");
        String inputFileName = "team.txt"; // filename
        Team team = loadTeamFromFile(inputFileName); // loading team from file

        if (team != null) { // if statement

            System.out.println(team); //sysout team
        }
        team.sortPlayers(); // sorting players
        String outputFileName = "sortedteam.txt";
        writeTeamToFile(team, outputFileName);

    }

    public static Team loadTeamFromFile(String fileName) { //loading team from file
        try {
            File teamTxt = new File(fileName); // file called teamTxt
            Scanner scnr = new Scanner(teamTxt); // scanner scnr in teamTxt
            String teamName = scnr.nextLine(); // nextLIne
            String city = scnr.nextLine(); // citynName
            Team team = new Team(teamName, city); // sorting out
            while (scnr.hasNextLine()) { // while loop
                String line = scnr.nextLine();
                String playerData[] = line.split("\\t"); // splitting the gaps
                Player player = new Player(playerData[0], Integer.valueOf(playerData[1]),
                        Integer.valueOf(playerData[2]), Position.valueOf(playerData[3]));
                team.addPlayer(player);
            }
            return team;
        } catch (FileNotFoundException e) { // catch block
            System.out.println("The file cannot be found");
        }

        return null;

    }

    public static void writeTeamToFile(Team team, String fileName) { // writing team to sortedteam.txt
        try {
            PrintWriter writer1 = null; // making printewriter equals null for basic
            writer1 = new PrintWriter(new File(fileName)); // then giving the fileName as parameter

            writer1.println(team.getName()); // writing teamName and teamCity using println()
            writer1.println(team.getCity());
            for (Player player : team.getPlayer()) { // enhanced for loop
                writer1.println(player);

            }
            writer1.close();

        } catch (FileNotFoundException e) { // catch block
            System.out.println("The file cannot be found");
            e.printStackTrace();
        }
    }

}
