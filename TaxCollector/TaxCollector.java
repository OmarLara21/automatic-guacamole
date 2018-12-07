
/**
 * Write a description of class TaxCollector here.
 *
 * @author (Omar Lara)
 * @version (11/16/18)
 */
import java.util.Scanner;
public class TaxCollector
{
    public static void inputs(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is your annual income?");
        double income = scanner.nextDouble();
        System.out.println("How many dependents in your household?");
        int dependents = scanner.nextInt();
        double incometax = income-10000-(dependents*2000);
        System.out.println("Your income tax is " + (incometax*0.2));
 
    }
    }