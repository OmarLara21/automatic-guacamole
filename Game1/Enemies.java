
/**
 * Write a description of class Enemies here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Enemies extends Character
{
    public Enemies(String name, String gender, int age){
        super(name, gender, age);
    }
    public String introduceEnemy(){
        String introduction  = "I am an enemy.";
        return introduction;
    }
}