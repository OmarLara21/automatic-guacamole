
/**
 * Write a description of class CarRide here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarRide
{
   public static void goForADrive(){
       DriverlessCar car = new Tesla(4, "Edison", "Home");
       //car.start();
       car.speedUp(55);
       car.slowDown(30);
       car.emergencyStop();
       //car.turnOff();
    }
}
