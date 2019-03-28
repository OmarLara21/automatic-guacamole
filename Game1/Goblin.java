
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
        this.MonsterType = MonsterType;
    }
    public String Steal(){
        String StealAction = "The goblin steals your gold!";
        return StealAction;
    }
}
