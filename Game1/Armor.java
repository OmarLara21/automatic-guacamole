
/**
 * Write a description of class Armor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Armor extends Item
{
    public Armor(String name, String type, String description, int level){
        super(name, type, description, level);
    }
    public String TakeOff(){
        String takeoffline = "You take off your armor set.";
        return takeoffline;
    }
}
