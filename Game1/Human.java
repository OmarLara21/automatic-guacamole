
/**
 * Write a description of class Human here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Human extends Player
{
    public Human(){
        super("Jink", "Male", 18);
    }
    public String HaveHope(){
        String HaveHopeLine = "You do what humans do best, pray. This causing you to get a +1 bonus to all stats.";
        return HaveHopeLine;
    }
}
