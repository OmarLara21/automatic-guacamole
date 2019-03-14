
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{   
    protected boolean locked;
    public Car(int passengers, String start, String end){
        super(passengers, start, end);
        locked = true;
    }
    public void start(){
        System.out.println("You start the car.");
    }
    public void moveForward(){
        System.out.println("You drive the car forward");
    }
    public void turnOff(){
        System.out.println("You turn off the engine.");
    }
    public void youDriving(){
        System.out.println("You hit the older gentleman.");
    }
    public boolean toggleLocks(){
        if (locked){
            locked = false;
        }
        else {
            locked = true;
        }
        return locked;
    }
}
