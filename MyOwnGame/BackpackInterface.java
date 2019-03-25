
/**
 * These methods are required for this project.
 * 
 * @author Wiebe 
 * @version 1.2
 */
public interface BackpackInterface
{
    /**
     * Puts an item into the backpack
     * 
     * @param  x    The item to be stored
     * @return        true if added, false if not.
     */
    void storeItem(Item x);
    /**
     * Counts the number of items in the backpack
     * 
     * 
     * @return        The number of items in the backpack
     */
    int countItems();
}
