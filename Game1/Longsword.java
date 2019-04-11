
/**
 * Write a description of class EnglishLongsword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Longsword extends Sword
{
    public Longsword(){
        super("Longsword", "Elven Legion","A standard longsword.", 2);
    }
    public String EnglishSlash(){
        String EnglishSlashLine = "You jump into the air and strike down hard on your oppenent delivering a devastating blow.";
        return EnglishSlashLine;
    }
}
