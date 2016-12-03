/**
 * Magazine --- Represents a single magazine.
 * @author      David Ye Luo, Kenta Medina
 * @version     1.0
 * @since       2016-12-3
 */
public class Magazine 
{
   private String title;

   //-----------------------------------------------------------------
   //  Sets up the new magazine with its title.
   //-----------------------------------------------------------------
   public Magazine (String newTitle)
   {    
      title = newTitle;
   }
   
   //-----------------------------------------------------------------
   //  Checks whether the magazine is identical
   //-----------------------------------------------------------------
   public boolean equals(Magazine m)
   {
	   return this.title.equals(m.toString());
   }

   //-----------------------------------------------------------------
   //  Returns this magazine as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return title;
   }
}
