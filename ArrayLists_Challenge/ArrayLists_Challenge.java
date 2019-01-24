
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
    ArrayList<String> shapesList;
    ArrayList<String> colors;
    public ArrayLists_Challenge(){
        colorsList= new ArrayList();
        colorsList.add("Blue");
        colorsList.add("Purple");
        colorsList.add("White");
        colorsList.add("Gray");
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
    public void changecolor(int index, String newColor ){
        colorsList.set(index, newColor);
    }
    public void remove3rdcolor(){
        colorsList.remove(3);
    }
    public boolean searchforColor(String color){
        for (int i = 0; i <colorsList.size(); i++){
           if (colorsList.equals(color)){
               return true;
           }
        }
       return false;
    }
}
