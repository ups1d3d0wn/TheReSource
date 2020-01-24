/**
* A class that models a Stack using an ArrayList.
*
* @name		Kevin Murphy
* @version	10/02/2019
*/
import java.util.ArrayList;
import java.lang.IndexOutOfBoundsException;


public class Stack<T> {

	private ArrayList<T> elements;

	public Stack() {
		this.elements = new ArrayList<T>();
	}

	public int getSize() {
		return this.elements.size();
	}

	/**
	* Pushes an item to the top of the stack.
	*
	* @param	T 	item
	*/
	public void push(T item) {

		this.elements.add(item);

	}

	/**
	* Peeks at, but does not remove, the item on the top of the stack.
	*
	* @return	T
	*/
	public T peek() {

			if (this.elements.size() ==0) {
				return null;
			}
			return this.elements.get(this.elements.size()-1);

	}

	/**
	* Pops off the item on the top of the stack.
	*
	* @return	T
	*/
	public T pop() {
		if(this.elements.size()==0) {
				return null;
		}
		return this.elements.remove(this.elements.size()-1);

	}

	/**
	* Provides a String representation of the stack.
	*
	* @return	String
	*/
	@Override
	public String toString() {
		String stackString = "";

		for (int i = 0; i < this.elements.size(); i++) {
			stackString = stackString + this.elements.get(i) + "\n";
		}
		return stackString;
	}
}
