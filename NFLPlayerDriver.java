/*
Victor Diaz
12/8/2018
CST-105
Lisa Hebert
 */
package gcu.projects;

//NFLPlayerDriver.java

public class NFLPlayerDriver {

    
    public static void main(String[] args) {
        /*
         * No arg testing
         */
        System.out.println("No arg constructor test ");
        NFLPlayer nfl_player1 =new NFLPlayer();//player with no param created
                                            //so all value will be default
        System.out.println("Player1 ID :Actual "+nfl_player1.getId()+", Expeted : 0");
        System.out.println("Player1 name :Actual "+nfl_player1.getName()+", Expeted : null");
        
        /*
         * Player with param constructor testing
         */
        System.out.println("\nparamter constructor test ");
        //player with values created
        NFLPlayer nfl_player2 =new NFLPlayer(12,"smith","team1",11);
        //testing the properties of player that given above
        System.out.println("Player2 name :Actual "+nfl_player2.getName()+", Expeted : smith");
        System.out.println("Player2 ID :Actual "+nfl_player2.getId()+", Expeted : 12");
        
        /*
         * using setter and getter
         */
        System.out.println("\nSetters and getters function testing");
        //setting the player 1 id to 13 initially was 0
        System.out.println("Player1 ID set to 13");
        nfl_player1.setId(13);//seted the id to 13
        System.out.println("Player1 ID :Actual "+nfl_player1.getId()+", Expeted : 13");
        
    }
}

