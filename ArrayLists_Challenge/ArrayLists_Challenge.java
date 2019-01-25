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
    
    //9
    public void copy(){
         for (String str: colorsList){
             colors = colorsList;
            }
    }
    //14
    /*public void swap(int index){
        colors.get(index) = colorsList.get(0);
        colorsList.get(index) = colors.get(0);
    }
    */
    //17
    public void removeAll(){
            colorsList.clear();
        
    }
    //18
    public boolean checkempty(){
        return (colorsList.isEmpty());
    }
    //19
    public void trimsize(){
        colorsList.trimToSize();
    }
    //21
    public void change2ndcolor(String newColor ){
        colorsList.set(1, newColor);
    }
}