
/**
 * Write a description of class Tesla here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class Tesla extends Car implements DriverlessCar
{
    int speed;
    final double MODEL = 1.1;
    public Tesla(int passengers, String start, String end){
        super(passengers, start, end);
        speed = 0;
    }
    public void emergencyStop(){
        System.out.println("The car comes to a stop on its own using $100 bills as brakes.");
    }
    public void slowDown(int speed){
        System.out.println("The car slows to "+speed+ " mph.");
        this.speed = speed;
    }
    public void speedUp(int speed){
        System.out.println("The car speeds up to "+speed+ " mph.");
        this.speed = speed;
    }
    
    @Override
    public boolean toggleLocks(){
        super.toggleLocks();
        if (locked){
           System.out.println("Bleep bloop. It's locked!");
        } else{
            System.out.println("Bleep bloop. Unlocked!");
        }
        return locked;
    }
}
