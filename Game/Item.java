
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    //Implemented in your own way
    protected String name;
    protected String type;
    protected String description;
    protected int level;
    public Item(String name, String type, String description, int level){
        this.name = name;
        this.type = type;
        this.description = description;
        this.level = level;
    }
    public String getName(){
        String itemName = this.name;
        return itemName;
    }
}
