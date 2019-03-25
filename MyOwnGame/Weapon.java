
/**
 * Write a description of class Weapons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Weapon extends Item
{
    protected String name;
    protected String type;
    protected String description;
    protected int level;
    protected String WeaponType;
    public Weapon(String name, String type, String description, int level, String WeaponType){
        super(name, type, description, level);
        this.WeaponType = WeaponType;
    }
    public String TellDescription(){
        String Description = this.description;
        return Description;
    }
}
