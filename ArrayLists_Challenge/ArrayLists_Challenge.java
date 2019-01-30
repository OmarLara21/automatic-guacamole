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
    ArrayList<String> colorsinOrder;
    ArrayList<String> colors;
    //1
    public ArrayLists_Challenge(){
        colorsList= new ArrayList();
        colorsList.add("Blue");
        colorsList.add("Purple");
        colorsList.add("White");
        colorsList.add("Gray");
        
        colors = new ArrayList();
        colors.add("Black");
        
        colorsinOrder = new ArrayList();
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
    public void sortArrayList(){
        for(int i = 0; i<colorsList.size()+1;i++){
            if (colorsList.get(i).length()<=colorsList.get(i+1).length()){
                colorsinOrder.add(colorsList.get(i));
            }
        }
    }
    
    
    //9 and 16
    public void copy(){
         for (String str: colorsList){
             colors.add(str);
            }
    }
    //11
    /*public void reverseStuff(){
        for (int i = colorsList.size()-1; i>-1; i--){
            for (int j = 0; j<colorsList.size(); j++){
                colorsList.set(j, colorsList.get(i));
        }
    }
    }
    */
    //12
    public void getportionofColors(int amount_of_colors){
        for (int i = 0; i <amount_of_colors; i++ ){
             System.out.println(colorsList.get(i));
            }
            
    }
    //13
    /*public boolean isthisArraybiggerthan( ArrayList<String> firstArray, ArrayList<String> secondArray){
        if (firstArray.size() >secondArray.size()){
            return true;
            
        }
        return false;
    }
    */
   

    //14
    public void swap(int index, int index2){
        String color1 = colorsList.get(index);
        colorsList.set(index, colorsList.get(index2));
        colorsList.set(index2, color1);
    }
   
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
    //22
    public void printcolorsinorder(){
        for(int i = 0; i<colorsList.size(); i++){
            System.out.println(colorsList.get(i));
        }
    }
}