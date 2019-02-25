import java.lang.Math;
/**
 * Write a description of class Blackjack here.
 *
 * @author (Omar Lara)
 * @version (12/6/18)
 */

public class Hand
{
    private int first_card;
    private int second_card;
    private int card_total;

    public Hand(){
        first_card = getcard();
        second_card = getcard();
    }

    public int getcard(){
        int new_card = (int)(Math.random()*10) + 2;
        card_total += new_card;
        return new_card;
    }

    public int grab_total(){
        return card_total;
    }

    public int getCardOne(){
        return first_card;       
    }
    
    public int getCardTwo(){
     return second_card;   
    }
}

