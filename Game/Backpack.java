
/**
 * This creates an Inventory for a character
 * 
 * @author Wiebe
 * @version 1.2
 */
import java.util.ArrayList;
public class Backpack implements BackpackInterface {
    // instance variables - replace the example below with your own
    private ArrayList<Item> backpack;

    /**
     * Constructor for objects of class Backpack
     */
    public Backpack()
    {
        // initialise instance variables
        backpack = new ArrayList<Item>();
    }

    /**
     * Adds an item to the backpack
     * 
     * @param  item   The item of which to add
     * @return     true if added
     */
    public void storeItem(Item item){
            backpack.add(item);       
    }

    /**
     * Consumes an item in the backpack, removing it.
     * 
     * @param  item   The item of which to delete
     * @return     true if deleted
     */
    public boolean useItem(Item item){
        for (int i = 0; i < backpack.size(); i++){
            if(backpack.get(i).equals(item)){
                backpack.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Gets the contents of the backpack
     * 
     * 
     * @return     An arraylist of Items in the backpack.
     */
    public ArrayList<Item> getInventory(){
        return backpack;
    }

    public int countItems(){
        int count = 0;
        for (Item item : backpack){
            count++;
        }
        return count;
    }
}
