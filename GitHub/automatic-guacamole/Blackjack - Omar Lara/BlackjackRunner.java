import java.util.Scanner;
/**
 * Write a description of class BlackjackRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlackjackRunner
{
    
    public static void play_game(){
        boolean game_win = false;
        boolean player_bust = false;
        Hand players_hand = new Hand();
        Hand dealers_hand = new Hand();
        System.out.println("Welcome to the game known as Blackjack."); 
        System.out.println("The way to win the game is to get the closest to 21 without busting, or having the dealer reach it first.");
        System.out.println("Your first hand is " + players_hand.getCardOne() + " and a " + players_hand.getCardTwo()) ;
        System.out.println("The total of your first hand is " + players_hand.grab_total());
        System.out.println("The dealers shown card is " + dealers_hand.getCardOne());
        System.out.println("If you would like to hit type 'yes', or if you would like to stand type 'no'.");
      
        while (!game_win){
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine().toLowerCase();
            if (response.equals ("yes"))
            {
                System.out.println("Your new card was a " + players_hand.getcard());
                System.out.println("Your new total of your cards is "+ players_hand.grab_total());
            }
            else if (response.equals("no"))
            {
                System.out.println("You have decided to stand. The total value of your cards is " + players_hand.grab_total());
                game_win = true;
            }
            else
            {
                System.out.println("Incorrect entry. Please type 'yes' or 'no'.");
            }
            if (players_hand.grab_total()>21)
            {
                System.out.println("You have busted since your last hit caused your total to be over 21. You have lost the game.");
                game_win = true;
                player_bust = true;
                return;
                
            }
            
        }
        System.out.println("Now that you have stood, the dealer reveals his hidden card "+ dealers_hand.getCardTwo());
       
        while (dealers_hand.grab_total()<17 && !player_bust)
        {
            System.out.println("Now the dealer hits again, and gets a new card that is "+ dealers_hand.getcard());
            System.out.println("Now the dealer's hand has a total of "+dealers_hand.grab_total());
            if (dealers_hand.grab_total()>21)
            {
                  System.out.println("The dealer has busted. You win!");
            }
            
        }
        
         if (players_hand.grab_total() > 21 && dealers_hand.grab_total()<=21){
            System.out.println("The dealer has won with a total "+dealers_hand.grab_total()+"because you busted.");
            }
            else if (players_hand.grab_total() <= 21 && dealers_hand.grab_total()>21){
            System.out.println("The dealer has busted. So, you have won the game with a score of "+players_hand.grab_total());
            
         }
                else if (players_hand.grab_total() <= 21 && dealers_hand.grab_total()<=21 && players_hand.grab_total() >dealers_hand.grab_total()){
            System.out.println("You have a higher score than the dealer, so you win!");
         }
         else if (players_hand.grab_total() <=21 && dealers_hand.grab_total()<=21 &&players_hand.grab_total() <dealers_hand.grab_total())
         {
            System.out.println("The dealer has a higher score than you, so you have lost the game.");
         }
         else if (players_hand.grab_total() ==dealers_hand.grab_total()){
            System.out.println("The dealer and you have the same score so, it is a tie.");
         }
    }
    public static void main(String[] args){
        play_game();
    }
}

