package arrayIterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardArrayIterator<E> implements Iterator<E> {

	private E[] arr;    // the array to iterate over
	private int current = 0;
	
	public ForwardArrayIterator(E[] arr) { 
		this.arr = arr; 
	}
	
	public boolean hasNext() {
		if (current == arr.length) {
			return false;
		}
		return true;
	}

	public E next() throws NoSuchElementException {
		if (!hasNext())
			throw new NoSuchElementException("No more elements to iterate over.");
		int n = current;
		current++; 
		return arr[n];
	}

	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException(
				"Remove operation not implemented.");
		// do not implement
	}
}
