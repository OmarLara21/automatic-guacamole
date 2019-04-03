
/**
 * Write a description of class Bow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bow extends Range
{
    public Bow(String name, String type, String description, int level){
        super(name, type, description, level);
        this.WeaponType = WeaponType;
    }
    public String threearrowshot(){
        String threeshotline = "You load three arrows into your bow and fire those shots at your opponent hitting three critical points.";
        return threeshotline;
    }
}
