
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
    public ArrayLists_Challenge(){
        colorsList= new ArrayList();
        colorsList.add("Blue");
        colorsList.add("Purple");
        colorsList.add("White");
        colorsList.add("Gray");
    }
    //2
    public void printColors(){
     for (String str: colorsList){
         System.out.println(str);
        }
    }
    //3
    public void makeFirstElement(String color){
        colorsList.add(0,color);
    }
    //4
    public String getcolor(int index){
        return colorsList.get(index);
        }
    //5
    public void changecolor(int index, String newColor ){
        colorsList.set(index, newColor);
    }
    //6
    public void remove3rdcolor(){
        colorsList.remove(2);
    }
    //7
    public boolean searchforColor(String color){
        for (int i = 0; i <colorsList.size(); i++){
           if (colorsList.get(i).equals(color)){
               return true;
           }
        }
       return false;
    }
    //8
    /*public void sortArrayList(){
        ArrayList<String> colorsinOrder = new ArrayList();
        for(int i = 0; i<colorsList.size();i++){
            if (colorsList.get(i).length()<=colorsList.get(i+1).length()){
                colorsList.set(0, colorsList.get(i));
            }
        }
    }
     * 
     */
    //17
    public void removeAll(){
        
        for (int i= 0; i<colorsList.size();i++){
            colorsList.remove(i);
        }
        colorsList.remove(0);
    }
}
