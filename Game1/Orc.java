
/**
 * Write a description of class Orc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Orc extends Enemies
{
    protected String MonsterType;
    public Orc(String name, String gender, int age,String MonsterType){
        super(name, gender, age);
        MonsterType = "Orc";
    }
    public String Grunt(){
        String Gruntline = "GRRRRRunt";
        return Gruntline;
    }
}
