
/**
 * Write a description of class ModArrays here.
 *
 * @author (Omar Lara)
 * @version (1/7/19)
 */
public class modarraysV2
{
    int[] array = {4,7,8,9,3,0};
    public void add(int index, int num){
        for(int i = array.length-1; i >index;i--){
            array[i] = array[i-1];
        }
        array[index] = num;
    }
    public void remove(int index){
        for(int i = index;i < array.length-1; i++){
                array[i] =array[i+1];
                
            
        }
        array[array.length-1] = 0;
    }
}