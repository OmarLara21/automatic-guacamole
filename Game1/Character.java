
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Character implements DefenseCommands, WeaponInterface
{
    protected String name;
    protected String gender;
    protected int age;
    protected boolean blocked;
    protected boolean parry;
    protected int attack;
    public Character(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public boolean blocked(){
        if(blocked){
            blocked  = true;
        }
        else{
            blocked = false;
        }
        return blocked;
    }
    public boolean parry(){
        if(parry){
            parry = true;
        }
        else{
            parry = false;
        }
        return parry;
    }
    public int attack(){
        System.out.println("You attack the enemy.");
        return attack;
    }
}
