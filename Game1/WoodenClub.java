
/**
 * Write a description of class WoodenClub here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WoodenClub extends BluntWeapons
{
    public WoodenClub(String type, String description, int level, String WeaponType){
        super("Wooden Club", type, description, level);
        
    }
    public String GroundSlam(){
        String GroundSlamLine = "You slam the ground causing your opponent to become stunned.";
        return GroundSlamLine;
    }
}
