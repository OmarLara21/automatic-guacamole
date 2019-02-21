
/**
 * Write a description of class Sorting here.
 *
 * @author Omar Lara
 * @version 2.20.19
 */
public class Sorting
{
    int[] Array = {3,6,2,19,45,4,2};
    public void bubble(){
        int MM = 0;
        for(int i =0; i<Array.length-1;i++){
            for(int j = 0; j<Array.length-1 - i; j++){
                if(Array[j] >= Array[j+1]){
                MM = Array[j];
                Array[j] = Array[j+1];
                Array[j+1]= MM;
                }
        }
    }
    }
    
    public void insertion(){
        int MM = 0;
        for(int i = 0; i<Array.length-1; i++){
            int pivet = Array[i];
            while(Array[i] <pivet){
                    MM = Array[i];
                    Array[i] = Array[i-1];
                    Array[i-1] = MM;
            }
            if(Array[i]>pivet){
                MM = pivet;
                pivet = Array[i];
                Array[i] = MM;
                }
            }
        
        }
    }
 
