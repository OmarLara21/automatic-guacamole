
/**
 * Write a description of class ModArrays here.
 *
 * @author (Omar Lara)
 * @version (1/7/19)
 */
public class modarraysV2
{
    int[] array = {4,7,8,9,3,0};
    public void remove(int index){
        for(int i = 0;i < array.length; i++){
            ///if (i ==index){
                ///array[i] =array[index+1];
                while(array[i]==index){
                    array[i]=array[index+1];
                    i--;
                }
            ///}
        }
    }
}