import java.lang.Math;
/**
 * Write a description of class Guessgame here.
 *
 * @author (Omar Lara)
 * @version (12/4/18)
 */
import java.util.Scanner;
public class Guessgame
{
    // instance variables - replace the example below with your own
    public static void GuessGame(){
        int chances = 5;
        int randomnumber = (int)(Math.random() *101 +100);
        while (chances >0){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 100 and 200");
        int response = scanner.nextInt();
        if (response==randomnumber)
        {
            System.out.println("You guessed the correct number, which is:" +randomnumber);
            return;
        }
        else if (response >randomnumber)
        {
            System.out.println("Too high, buddy.");
            chances--;
        }
        else if (response<randomnumber)
        {
            System.out.println("Too low, buddy.");
            chances--;
        }
       
    }
        System.out.println("You ran out of guesses.  Sorry, you should try again." );
        return;
        }
}
    
 
    

    /**
     * Constructor for objects of class Guessgame
     */

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   
   

