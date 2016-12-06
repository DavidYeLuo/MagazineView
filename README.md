# MagazineView

[ ] 1) Add an insert operation into the MagazineList class. Your insert() method will insert each magazine at the beginning of the list (this is a head insert).

Note: The add() method already included in MagazineList (Chapter 12) adds magazines to the END of the list (the tail of the list). This method will not change.

[ ] 2) Add a deleteAll() method that will delete all magazines from the list.

Hint: If the pointer to the beginning (head) of the list is null, the list is empty. This method only needs to be one line long.

Here are the specifications for the new MagazineViewPanel class: 


Note

As we are not using any of the draw() methods, no need for paintComponent() to be defined.

[ ] 3) The only line from the original MagazineRack class that you will use ‘as is’ is the one that instantiates the MagazineList (named rack):

MagazineList rack = new MagazineList();

[ ] 4) Provide an editable field of type TextField where a user can ‘Add Magazine’; that is, enter a magazine title to be added to the magazine list (use the getText() method to get user input).

Hint: The getText() method of the TextField class returns a String. It is this String that will be used as an argument to insert() a new title into the list (in the same way that the add() method takes a String as its argument).

Note: In Chapter 12’s MagazineRack code, all the magazine titles were hardcoded strings. In our MagazineView application, the titles will be strings that were input from the user using a TextField and then stored in a variable. Remember the TextField 'fires' an event when the user hits the <enter> key.

[ ] 5) Allow the user to display all the magazines in a TextArea by pressing a ‘List Magazines’ Button. Both TextField and TextArea objects use the method setText() to show text in their fields.

Hint: The MagazineList class contains a toString() method that returns a String. The setText() method of the TextArea class takes a String as its argument. 

Note: setting the TextArea to empty string "" essentially clears the TextArea object.

[ ] 6) Allow the user to clear (set to null) the contents of the magazine list by pressing a ‘Delete All’ Button. This is where you call the deleteAll() method. 

Hint: Setting the reference to the first node to null will cause all the nodes in the list to be garbage collected.

[ ] 7) FOR THOSE DOING EXTRA CREDIT: Program should not delete an already empty list. If user tries to clear an already empty list do nothing (use an if statement).

Here are some additional design thoughts: 


[ ] 8) You will need separate inner (listener) classes for all TextFields and Buttons you use. You DO NOT need a listener for the TextArea as it does NOT generate user input. These listeners are part of the MagazineViewPanel file. It is within these listener/inner classes that 'rack' (the MagazineList object) will call the insert, deleteAll, etc. methods.


[ ] 9) Hint: I used the BorderLayout for my front-end design. I created a JPanel to which I added a JLabel, TextArea and a JButton. I then added the this panel to the North region. I created another JPanel/JLabel/TextArea/JButton that I added to South region. I added the TextArea to the Center region. See Chapter 6 for layout manager examples. 


[ ] 10) You must separate your implementation so that the Magazine and MagazineList classes are in separate file(s) from the MagazineView and MagazineViewPanel files that you use to implement your program.

Extra Credit:

[ ] Provide a ‘Delete Magazine’ TextField where a user can enter a Magazine to be deleted from the Magazine list. The program will search for that magazine title and remove it from the list. Put this code into a method named delete() and add the method to the MagazineList class.
