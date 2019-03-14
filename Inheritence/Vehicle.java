
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Vehicle
{
    protected int passengers;
    protected String start;
    protected String end;
    public Vehicle(int passengers, String start, String end){
        this.passengers = passengers;
        this.start = start;
        this.end = end;
    }
    public int getPassengers(){
        return passengers;
    }
    public String getStart(){
        return start;
    }
    public String getEnd(){
        return end;
    }
    public abstract boolean toggleLocks();
    
}
