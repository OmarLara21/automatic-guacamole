
/**
 * Write a description of class Ghoul here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ghoul extends Enemies
{
    protected String MonsterType;
    public Ghoul(String name, String gender, int age,String MonsterType){
        super(name, gender, age);
        MonsterType = "Ghoul";
    }
    public String Rot(){
        String rotline = "The Ghoul's arm falls off.";
        return rotline;
    }
}
