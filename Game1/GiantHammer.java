
/**
 * Write a description of class GiantHammer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GiantHammer extends BluntWeapons
{
    public GiantHammer(String type, int level){
        super("Giant Hammer", "Elven","This is a giant hammer made by the Elf Legion, you see detailed dsigning on the hammer head." , 2);
    }
    public String PoiseIncrease(){
        String PoiseIncreaseLine = "You place the head of the hammer on the ground, and you feel an increase of vitality making you feel strong.";
        return PoiseIncreaseLine;
    }
}
