
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon extends Enemies
{
   protected String MonsterType;
   public Dragon(String name, String gender, int age,String MonsterType){
        super(name, gender, age);
        this.MonsterType = MonsterType;
   }
   public String BreathFire(){
       String DragonFire = "*Fire breaths all around you.";
       return DragonFire;
    }
}
