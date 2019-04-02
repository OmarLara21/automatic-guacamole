
/**
 * Write a description of class Rapier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rapier extends Sword
{
    public Rapier( String type, String description, int level){
        super("Rapier", type, description, level);
    }
    
    public String SwiftStrike(){
        String SwiftStrikeLine = "You swiftly move towards your opponent damaging their stomach with the tip of your rapier.";
        return SwiftStrikeLine;
    }
}
