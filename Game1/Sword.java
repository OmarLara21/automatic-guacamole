
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Sword extends Weapon
{
    public Sword(String name, String type, String description, int level){
        super(name, type, description, level, "Sword");
    }
    public String Sharpen(){
        String SharpenSword = "You sharpen your sword.";
        return SharpenSword;
    }
}
