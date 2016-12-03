/**
 * MagazineList --- Represents a collection of magazine.
 * @author          David Ye Luo, Kenta Medina
 * @version         1.0
 * @since           2016-12-3
 */
public class MagazineList
{
   private MagazineNode list;

   //----------------------------------------------------------------
   //  Sets up an initially empty list of magazines.
   //----------------------------------------------------------------
   public MagazineList()
   {
      list = null;
   }

   //----------------------------------------------------------------
   //  Creates a new MagazineNode object and adds it to the end of
   //  the linked list.
   //----------------------------------------------------------------
   public void add (Magazine mag)
   {
      MagazineNode node = new MagazineNode (mag);
      MagazineNode current;

      if (list == null)
         list = node;
      else
      {
         current = list;
         while (current.next != null)
            current = current.next;
         current.next = node;
      }
   }
   
   //----------------------------------------------------------------
   //  Adds the desired magazine starting at the begining of the list
   //----------------------------------------------------------------
   public void insert(Magazine m)
   {
	   MagazineNode copy = list;
	   list = new MagazineNode(m);
	   list.next = copy;
   }
   
   //----------------------------------------------------------------
   //  Extra Credit: Delete a certain magazine
   //----------------------------------------------------------------
   public void delete(Magazine m)
   {
	   if(list == null)
	   {
		   System.out.println("Magazine is empty");
	   }
	   else
	   {
		   MagazineNode current = list;
		   MagazineNode future = list.next;
		   
		   // When the head node should be deleted
		   if(current.magazine.equals(m))  
		   {
			   list = current.next;
			   return;
		   }
		   // Try to find the magazine
		   while(future != null)
		   {
			   if(future.magazine.equals(m))
			   {
				   current.next = future.next;
				   return;
			   }
			   else // When it doesn't match
			   {
				   current = current.next; // navigate
				   future = future.next; // navigate
			   }

		   }
		   // When magazine isn't found
		   System.out.println("Entered magazine doesn't exist");
	   }
   }
   
   //----------------------------------------------------------------
   //  Clears the whole list
   //----------------------------------------------------------------
   public void deleteAll()
   {
	   list = null;
   }

   //----------------------------------------------------------------
   //  Returns this list of magazines as a string.
   //----------------------------------------------------------------
   public String toString ()
   {
      String result = "";

      MagazineNode current = list;

      while (current != null)
      {
         result += current.magazine + "\n";
         current = current.next;
      }

      return result;
   }

   //*****************************************************************
   //  An inner class that represents a node in the magazine list.
   //  The public variables are accessed by the MagazineList class.
   //*****************************************************************
   private class MagazineNode
   {
      public Magazine magazine;
      public MagazineNode next;

      //--------------------------------------------------------------
      //  Sets up the node
      //--------------------------------------------------------------
      public MagazineNode (Magazine mag)
      {
         magazine = mag;
         next = null;
      }
   }
}
