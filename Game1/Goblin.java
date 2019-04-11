
/**
 * Write a description of class Goblin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Goblin extends Enemies
{
    protected String MonsterType;
    public Goblin(String name, String gender, int age,String MonsterType){
        super(name, gender, age);
        MonsterType ="Goblin";
    }
    public String Steal(){
        String StealAction = "The goblin steals your gold!";
        return StealAction;
    }
}
