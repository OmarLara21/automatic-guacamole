
/**
 * Write a description of class EnhancedSlingshot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EnhancedSlingshot extends Range
{
    public EnhancedSlingshot(){
        super("Enhanced Slingshot", "Red Cross", "This is an enhanced Slingshot with enormous power due to being made out of elder wood.", 15);
        
    }
    public String deathball(){
        String deathballline = "A black liquid releases from the Slingshot into a ball, allowing you to shoot the deathball towards your opponent. This causing them to take more damage.";
        return deathballline;
    }
}
