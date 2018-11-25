/*
 Victor Diaz
11/25/2018
CST-105
Lisa Hebert
 */
import javax.swing.JOptionPane;
import java.util.Random;

public class RandomGuessingGame {
    public static void main(String[] args) {
     
        Random random = new Random();
        int randomNumber = random.nextInt( 10001 );
        boolean userCorrect = false;
        String userInputString;
        int userGuessedNumber;
        int numberOfGuesses = 0;
        
        while( !userCorrect ) {
            numberOfGuesses = numberOfGuesses + 1;
            userInputString = JOptionPane.showInputDialog( "Enter a guess between 1 and 10000: " );
            userGuessedNumber = Integer.parseInt ( userInputString );
            if( userGuessedNumber > randomNumber ) {
                JOptionPane.showMessageDialog( null, "Lower" );
            } else if( userGuessedNumber < randomNumber ) {
                JOptionPane.showMessageDialog( null, "Higher" );
            } else{
                JOptionPane.showMessageDialog( null, "You Win! It took you " + numberOfGuesses + " guesses. " );
                userCorrect = true;
            }
        } 
         System.exit ( 0 ); 
        
    } 
}
