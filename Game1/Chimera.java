
/**
 * Write a description of class Chimera here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chimera extends Enemies
{
    protected String MonsterType;
    public Chimera(String name, String gender, int age){
        super(name, gender, age);
        MonsterType = "Chimera";
    }
    public String Snakebite(){
        String snakebiteline = "The tail of the Chimera bites you, before you can react.";
        return snakebiteline;
    }
}
