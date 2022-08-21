package excercise3lab4.src;

/** Exercise 3: 
 * 
 * Using an inheritance hierarchy, design a Java program to model items at a 
 * library 
(books, journal articles, videos and CDs.) Have an abstract superclass called Item and include 
common information that the library must have for every item (such as unique identification 
number, title, and number of copies). No actual objects of type Item will be created - each actual 
item will be an object of a (non-abstract) subclass. Place item-type-specific behavior in 
subclasses (such as a video's year of release, a CD's musical genre, or a book's author).
More in detail:

1. Implement an abstract superclass called Item and define all common operations on 
this class (constructors, getters, setters, equals, toString, print, checkIn, checkOut, 
addItem, etc). Have private data for: identification number, title, and number of copies.

2. Implement an abstract subclass of Item named WrittenItem and define all common 
operations on this class. Added private data for author.

3. Implement 2 subclasses of WrittenItem: Book and JournalPaper.

	3.1. Class Book: no new private data. When needed, override/overload methods from the superclass.

	3.2. Class JournalPaper: added private data for year published. When needed,override/overload methods from the superclass.

4. Implement another abstract subclass of Item named MediaItem and define all common 
operations on this class. Added private data for runtime (integer).

5. Implement 2 subclasses of MediaItem: Video and CD.
	
	5.1. Class Video: added private data for director, genre and year released. When needed, override/overload methods from the superclass.

	5.2. Class CD: added private data for artist and genre. When needed,override/overload methods from the superclass.

Write the definitions of these classes and a client program (your choice!) showing them in use.*/

public class Library1 
{
	public static void main()
	{
		
	}
	
}
