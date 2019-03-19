
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player extends Character
{   
    protected boolean blocked;
    public Player(String name, String gender, int age){
        super(name, gender, age);
    }
    @Override
    public boolean blocked(){
       super.blocked();
       if (blocked){
           System.out.println("You are blocking.");
        }
       else{
           System.out.println("You are no longer blocking.");
        }
       return blocked;
    }
    public boolean parry(){
        super.parry();
        if(parry){
            System.out.println("You parry the attack");
        }
        if(parry){
            System.out.println("You did not parry the attack");
        }
        return parry;
    }
}
