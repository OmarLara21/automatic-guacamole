
/**
 * Write a description of class ArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;

public class ArrayLists_Challenge
{  
    ArrayList<String> colorsList;
    ArrayList<Boolean> test;
    public ArrayLists_Challenge(){
        colorsList= new ArrayList();
        colorsList.add("Blue");
        colorsList.add("Purple");
        colorsList.add("White");
    }
    public void printColors(){
     for (String str: colorsList){
         System.out.println(str);
        }
    }
    public void makeFirstElement(){
        colorsList.add(0,"purple");
    }
    public String getcolor(int index){
        return colorsList.get(index);
        }
    }
