
/**
 * Write a description of class Werewolf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Werewolf extends Enemies
{
    protected String MonsterType;
    public Werewolf(String name, String gender, int age,String MonsterType){
        super(name, gender, age);
        this.MonsterType = MonsterType;
    }
    public String Roar(){
        String RoarLine = "ROAR!!!";
        return RoarLine;
    }
}
