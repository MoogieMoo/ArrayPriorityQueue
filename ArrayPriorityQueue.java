// Maggie Xia
// APCS2 pd1
// HW32--Getting Past the Velvet Rope
// 2017-04-19

import java.util.NoSuchElementException;
import java.lang.RuntimeException;
import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {
    
    private ArrayList queue;

    // Default constructor creates an empty queue
    public ArrayPriorityQueue()
    { 
	queue = new ArrayList();
    }

    // Adds an item to this priority queue.
    public void add( item ) 
    {
	for ( int i = 0; i < queue.size(); i++ ) {
	    //item is smaller than the ith element
	    if ( item < queue.get(i) ) {
		queue.add( i, item );
	    }
	    //item is larger than the ith element
	    if ( item >= queue.get(i) ) {
		queue.add( i + 1, item );
	    }
    }

    // Returns true if this stack is empty, otherwise returns false.
    public boolean isEmpty() 
    {
	return queue.size() == 0;
    }

    // Returns the smallest item stored in this priority queue without removing it.
    public peekMin() 
    {
	return queue.get(0);
    }

    // Removes and returns the smallest item stored in this priority queue.
    public removeMin() 
    {
	//error
	if ( queue.size() == 0 ) {//nothing to remove
	    System.out.println( "Error! Nothing to remove!" );
	    return null;
	}

	ret = queue.get(0);
	queue.remove(0);
	return ret;    
    }

    // toString() method
    public String toString() 
    {
	String ret = "";
	for ( int i = 0; i < queue.size(); i++ ) {//traverse
	    ret += " ";
	    ret += queue.get(i);//add to String
	}
	return ret;	
    }

    // Main method
    public static void main ( String[] args ) {
	PriorityQueue<Integer> test1 = new ArrayPriorityQueue<Integer>();
	

}//end class ArraypriorityQueue
