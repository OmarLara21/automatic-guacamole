
/**
 * Write a description of class Blunt_Weapons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class BluntWeapons extends Weapon
{
    public BluntWeapons(String name, String type, String description, int level){
         super(name, type, description, level, "Blunt");
    }
    public String AddStuds(){
        String AddtheStuds = "You add studs to your blunt weapon to add to the blunt force.";
        return AddtheStuds;
    }
}
