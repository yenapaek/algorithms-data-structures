import java.util.*;

public class ArrayList<E> implements List<E> {
	// fields
	private E[] data; // generic array
	private int size = 0; // num of elements
	public static final int CAPACITY = 16;
	
	// constructors
	public ArrayList() { this(CAPACITY); }
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	// return values and statuses of fields
	// O(1)
	public int size() {
		return size;
	}
	// O(1)
	public boolean isEmpty() {
		return size == 0;
	}
	
	// O(1)
	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		return data[i];
	}
	
	// update methods
	// O(1)
	public E set(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}
	
	// O(n)
	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		
		for (int k=i; k < size-1; k++) {
			data[k] = data[k+1];
		}
		data[size-1] = null;
		size--;
		
		return temp;
	}
	
	// O(n)
	public void add(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size+1);
		
		if (size == data.length) {
			resize(2*data.length);
		}
		
		for (int k = size-1; k >= i; k--) {
			data[k+1] = data[k];
		}
		
		data[i] = e;
		size++;
	}
	
	protected void resize(int capacity) {
		// allocate new bigger shell
		E[] temp = (E[]) new Object[capacity];
		
		// copy references from old to new
		for (int k = 0; k < size; k++) {
			temp[k] = data[k];
		}
		
		// point to new shell
		data = temp;
	}
	public void prepend(E e) {
		add(0 , e);
	}
	
	// O(n)
	public void push(E e) {
		add(size, e);
	}
	
	public E pop() {
		if (size == data.length * (1/4)) {
			resize((1/2) * data.length);
		}

		return remove(size-1);
	}
	
	
	// utility method
	public static void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i<0 || i >= n) {
			throw new IndexOutOfBoundsException("Illegal index: "+ i);
		}
	}
}
