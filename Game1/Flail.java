
/**
 * Write a description of class Flail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Flail extends BluntWeapons
{
    public Flail(){
        super("Flail", "Black Legion", "A black flail that is worn down, but still usable.", 5);
    }
    public String Knockback(){
        String Knockbackline = "You swing the end of your flail at the chest of your opponent, making them stagger and fall to the ground. This stunning them for a while.";
        return Knockbackline;
    }
}
