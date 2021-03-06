/*
Victor Diaz
12/9/2018
CST-105
Lisa Hebert
 */

import java.util.ArrayList;

import java.util.List;

 

//This class is used to create , display and manage NFLPlayers

public class NFLPlayerManager {

//List of NFLPlayers

private List<NFLPlay> list=null;

 

public NFLPlayerManager() {

list=new ArrayList<>();

}

//This method creates atleast 6 players of Type NFLPlayer

public void createPlayers(){

NFLPlay player1=new NFLPlay();

player1.setId(1);

player1.setName("John");

player1.setAddress("Arizona");

NFLPlay player2=new NFLPlay();

player2.setId(2);

player2.setName("Marcus");

player2.setAddress("New York");

NFLPlay player3=new NFLPlay();

player3.setId(3);

player3.setName("Jim");

player3.setAddress("Pennsylvania");

NFLPlay player4=new NFLPlay();

player4.setId(4);

player4.setName("Kevin");

player4.setAddress("Utah");

NFLPlay player5=new NFLPlay();

player5.setId(5);

player5.setName("Mike");

player5.setAddress("Nevada");

NFLPlay player6=new NFLPlay();

player6.setId(6);

player6.setName("Andrew");

player6.setAddress("Washington");

list.add(player1);

list.add(player2);

list.add(player3);

list.add(player4);

list.add(player5);

list.add(player6);

}

 

//This method is used to dislay all 6 players 

public void driver(){

    list.forEach((nflPlayer) -> {
        System.out.println("Player id :"+nflPlayer.getId()+" Name :"+nflPlayer.getName()+" Address :"+nflPlayer.getAddress());
    });

}

 

@Override

public String toString() {

return "NFLPlayerManager [list=" + list + "]";

}

 

public static void main(String[] args) {

NFLPlayerManager manager=new NFLPlayerManager();

manager.createPlayers();

manager.driver();

}

 

}
