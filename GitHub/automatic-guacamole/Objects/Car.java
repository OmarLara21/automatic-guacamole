
/**
 * Write a description of class Car here.
 *
 * @author (Omar Lara)
 * @version (11/26/18)
 */
public class Car
{
    //Things a car has
    //Instance Variables
    private String color;
    private String type;
    private int modelNumber;
    private boolean engineOn = false;

    //Constructor
    public Car(){
        this("Black", "Ferrari", 1);
    }

    public Car(String car_color, String car_type, int modelNum){
        color = car_color;
        type = car_type;
        modelNumber = modelNum;
    }

    //Methods
    public void turn_on(){
        engineOn = true;
        System.out.println("The car turns on");
    }

    //Mutator Method
    public void repaint(String color){
        this.color = color;
    }

    //Accessor Method
    public String getColor(){
        return color;   
    }
}
