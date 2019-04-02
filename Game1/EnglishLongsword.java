
/**
 * Write a description of class EnglishLongsword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EnglishLongsword extends Sword
{
    public EnglishLongsword( String type, String description, int level){
        super("EnglishLongsword", type, description, level);
    }
    public String EnglishStrike(){
        String EnglishStrikeLine = "You jump into the air and strike down hard on your oppenent delivering a devastating blow.";
        return EnglishStrikeLine;
    }
}
