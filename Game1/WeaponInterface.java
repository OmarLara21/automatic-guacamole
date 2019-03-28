
/**
 * Methods for all weapons
 * 
 * @author Wiebe 
 * @version 1.2
 */
public interface WeaponInterface
{
    /**
     * Attacks an enemy for an amount
     * 
     * 
     * @return        Returns amount of damage successfully done to the opponent 
     */
    public int attack();
    /**
     * Parry Attack Method
     * 
     * A Parry is when a incoming attack is blocked with your weapon
     * 
     * @return        True if the attack was parried. 
     */
    public boolean parry();
    
}
