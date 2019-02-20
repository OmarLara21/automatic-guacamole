
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
        int pivet = 0;
        for(int i = 0; i<Array.length-1; i++){
            if(Array[i] >pivet){
                for(int j = 0; j<Array.length- 1-i; j++){
                    MM = Array[i];
                    Array[i] = Array[i+1];
                    Array[i+1] = MM;
                }
            }
            else{
                if(Array[i]<pivet){
                    pivet = Array[i];
                    MM = Array[i];
                    Array[i] = Array[i+1];
                    Array[i+1] = MM;
            }
        }
        }
    }
    
    public void selection(){
        
    }
}
