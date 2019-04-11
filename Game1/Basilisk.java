
/**
 * Write a description of class Basilisk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Basilisk extends Enemies
{
    protected String MonsterType;
    public Basilisk(String name, String gender, int age){
        super(name, gender, age);
        MonsterType = "Basilisk";
    }
    public String Deathstare(){
        String Deathstareline = "The basilisk looks directly at you, instantly killing you.";
        return Deathstareline;
    }
}
