
/**
 * Write a description of class Rapier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rapier extends Sword
{
    public Rapier(){
        super("Rapier","Black Legion", "This is a normal rapier, made by the black legion.", 3);
    }
    
    public String SwiftStrike(){
        String SwiftStrikeLine = "You swiftly move towards your opponent damaging their stomach with the tip of your rapier.";
        return SwiftStrikeLine;
    }
}
