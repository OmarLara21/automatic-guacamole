
/**
 * Write a description of class Earkling here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Earkling extends Enemies
{   
    protected String MonsterType;
    public Earkling(String name, String gender, int age){
        super(name, gender, age);
        MonsterType = "Earkling";
    }
    public String Eak(){
        String Eaksound = "EEEEEEEEAAAAAKKKKKK";
        return Eaksound;
    }
}
