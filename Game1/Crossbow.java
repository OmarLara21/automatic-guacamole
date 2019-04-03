
/**
 * Write a description of class Crossbow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Crossbow extends Range
{
    public Crossbow(String type, String description, int level){
        super("Crossbow", type, description, level);
    }
    public String FlameArrow(){
        String FlameArrowLine = "You reload a flaming arrow into your crossbow and set a blaze your opponent.";
        return FlameArrowLine;
    }
}
