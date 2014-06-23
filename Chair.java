public class Chair
{
 
   public int legs = 4;
   public String color = "red";
   public int rotation;
   
   // Constructors

   public Chair()
   {
      // empty constructor
   }
   public Chair(int rotation)
   {
      this.rotation = rotation;
   }
 
   public void turn()
   {
      System.out.print("The " + color + " Chair with ");
      System.out.println(legs + " legs is rotating: ");
      
      for(int i = 1; i <= rotation; i++)
      {
         System.out.print(i + " ");
      }
      
      System.out.println(" times!");
   }
   public void setColor(String color)
   {
      this.color = color;
   }
   
}