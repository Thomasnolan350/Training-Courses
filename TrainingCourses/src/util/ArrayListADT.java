package util;

/** @author Catherine Higgins
 *  Generic version of methods required for an ArrayList
 * @param <T>
 */
public interface ArrayListADT<T> {
	
	/**
	 * This is a pure module which adds an element to the ArrayList
	 * @param element any object of type T
	 */
	public void add (T element);
		
	/** function to remove the last element in the ArrayList and return its memory address 
	 * @return element - address of the object that has been removed */
	public T remove();
	
	/** boolean function to indicate if the ArrayList is empty or not 
	 * @return boolean - indicates if the list is empty*/
	 public boolean isEmpty();

	 /** return the number of elements in the ArrayList 
	  * @return int - size of list*/
	 public int size();
	 
	 /** toString to create a "sentence" containing the contents of all objects in the 
	  * list
	  * @return String - returns string version  */
	 public String toString();

}
