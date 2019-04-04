
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Player
{
    public Elf(){
        super("Xür", "Male", 339);
    }
    
    public String ElvenJump(){
        String ElvenJumpLine = "You jump in the air at an incredible hieght, allowing you to hit the enemy's head doing double damage.";
        return ElvenJumpLine;
    }
}
