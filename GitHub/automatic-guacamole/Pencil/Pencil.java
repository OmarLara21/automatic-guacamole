
/**
 * Write a description of class Pencil here.
 *
 * @author (Omar Lara)
 * @version (11/26/18)
 */
public class Pencil
{
   private String length;
   private String color;
   private int numberofpencils;
   private String madein;
   private String width;
   private boolean sharpened = false;
   private boolean broken = false;
   
   public Pencil(){
       this("long", "black", "wide");
    }
   
   public Pencil(String pencil_length, String pencil_color, String pencil_width){
       length = pencil_length;
       color = pencil_color;
       width = pencil_width;
   }
   public Pencil(String made_in, int numberinpack){
   madein = made_in;
   numberofpencils = numberinpack;
   }
   public void sharpen_pencil(){
    sharpened = true;
    System.out.println("The pencil is sharpened");
   }
   public void scrap_paint(String color){
     this.color = ("The paint is scrapped off");  
   }
   public void break_pencil(){
    broken = true;
    System.out.println("The pencil is now broken");
    }
}
