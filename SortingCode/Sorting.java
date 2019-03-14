
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

        for( int i = 0; i<Array.length-1; i++){
            int Pivot = i+1;
            for(int j = i; j>=0;j--){
                while(Array[j]>Array[Pivot]){
                    MM  = Array[Pivot];
                    Array[Pivot] = Array[j];
                    Array[j] = MM;
                    Pivot--;

                }
            }

        }
    }
    public void selection(){
        int MM = 0;
        for(int i = 0; i<Array.length-1;i++){
            int LowestValue = i;
            for(int j = i+1; j<Array.length; j++){
                if(Array[j]<Array[LowestValue]){
                    LowestValue = j;
                }
            }
            MM = Array[i];
            Array[i] = Array[LowestValue];
            Array[LowestValue] = MM;
        }
    }
}
