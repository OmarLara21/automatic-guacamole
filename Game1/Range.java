
/**
 * Write a description of class Range here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Range extends Weapon
{
    public Range(String name, String type, String description, int level){
         super(name, type, description, level, "Range");
    }
    public String Reload(){
        String ReloadWeapon = "You reload your current ranged weapon.";
        return ReloadWeapon;
    }
}
