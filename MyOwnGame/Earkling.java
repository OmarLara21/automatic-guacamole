
/**
 * Write a description of class Earkling here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Earkling extends Enemies
{   
    protected String MonsterType;
    public Earkling(String name, String gender, int age, String MonsterType){
        super(name, gender, age);
        this.MonsterType = "Earkling";
    }
}
