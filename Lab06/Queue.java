/**
* A class that models a Queue using an ArrayList.
*
* @author		Kevin Murphy
* @version	10/4/2019
*/
import java.util.ArrayList;

public class Queue<T> {

	private ArrayList<T> elements;

	public Queue() {
		this.elements = new ArrayList<T>();
	}

	/**
	* Offers an element to the end of the queue.
	*
	* @param	T 	element
	*/
	public void offer(T element) {
		this.elements.add(element);
	}

	/**
	* Peeks at, but does not remove, the element at the head of the queue.
	*
	* @return	T
	*/
	public T peek() {
		if(this.elements.size()==0) {
			return null;
		}
		else {
			return this.elements.get(0);
		}
	}

	/**
	* Polls an element from the head of the queue.
	*
	* @return	T
	*/
	public T poll() {
		return this.elements.remove(0);
	}
	/**
	* Provides a String representation of the queue.
	*
	* @return 	String
	*/
	@Override
	public String toString() {
		String queueString = "";

		for (int i = 0; i < this.elements.size(); i++) {
			queueString = queueString + this.elements.get(i) + "\n";
		}
		return queueString;
	}
} // end Queue
