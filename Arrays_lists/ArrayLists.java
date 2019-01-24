
/**
 * Write a description of class ArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;

public class ArrayLists
{  
    ArrayList<String> shoppingList;
    ArrayList<Boolean> test;
    public ArrayLists(){
        shoppingList= new ArrayList();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
    }
    public void printShoppingList(){
     for (String str: shoppingList){
         System.out.println(str);
        }
    }
    public String getFirstElement(){
        return shoppingList.get(0);
    }
    public void engageCookieMonster(){
        for (int i= 0; i<shoppingList.size(); i++){
            shoppingList.set(i, "COOKIES!!!!!!!!");
        }
    }
    public void removeFirstElement(){
        shoppingList.remove(0);
    }
}
