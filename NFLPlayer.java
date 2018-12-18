/*
Victor Diaz
12/8/2018
CST-105
Lisa Hebert
 */
package gcu.projects;

public class NFLPlayer {

    //properties of NFLPlayer
    private int id;
    private String name;
    private String teamName;
    private int score;
    
    //default constructor
    public NFLPlayer() {}
    
    //constructor with param
    //that initializes the all properties
    public NFLPlayer(int id, String name, String teamName, int score) {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.score = score;
    }

    //accesser and mutators for properties
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

 

