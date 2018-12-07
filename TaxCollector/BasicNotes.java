
/**
 * Write a description of class BasicNotes here.
 *
 * @author Omar
 * @version 11.15.2018
 */
import java.util.Scanner;
public class BasicNotes
{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }

    public static void inputs(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is yor name?");
        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("In 5 years, you will be " + (age + 5) + " years old.");
    }
    
    
    public static void main2(){
        // This is a comment

        /*
         * Multi-line Comment
         */

        int number; // Declaration
        number = 5;  // Instantiation
        double number2 = 2.2;
        boolean bool = true;
        String name = "Omar";

        //NOt so important, but there
        char c = 'c';
        byte a = 127; //2^7-1
        short b; // 2^15-1
        int d; //2^31 - 1      - 2.1 billion
        long r;

        int x = Integer.MAX_VALUE;
        // System.out.println(x);
        // System.out.println(x+1);

        // System.out.println(x+2);

        int f = 5;
        int g = 8;
        System.out.println(g/f);
        System.out.println((double) g / f);

        if (g > 7){
            System.out.println("g is bigger");
        } else if (g < 0){
            System.out.println("g is negative");
        } else {

            System.out.println("other thing");   
        }

    }
}
