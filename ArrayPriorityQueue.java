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
    public void add( int item ) 
    {
	//queue is empty
	if ( queue.isEmpty() ) {
	    queue.add( item );
	    return;
	}
	
	//queue is not empty
	else {
	    //find spot of insetion
	    for ( int i = 0; i < queue.size(); i++ ) {			    
		if ( (int) queue.get(i) < item ) {
		    queue.add( i, item );
		    return;
		}		
	    }
	}
    }

    // Returns true if this stack is empty, otherwise returns false.
    public boolean isEmpty() 
    {
	return queue.size() == 0;
    }

    // Returns the smallest item stored in this priority queue without removing it.
    public int peekMin() 
    {
	for ( int i = 0; i < queue.size(); i++ ) {
	    if ( queue.get( i + 1 ) == null ) {
		return (int) queue.get(i);
	    }
	}
	
	//nothing to peek at!
	if ( queue.isEmpty() ) {
	    throw new NoSuchElementException();
	}

	return 0;
    }


    // Removes and returns the smallest item stored in this priority queue.
    public int removeMin() 
    {
	//error
	if ( queue.isEmpty() ) {//nothing to remove
	    System.out.println( "Error! Nothing to remove!" );
	    throw new NoSuchElementException();
	}

	int ret = (int) queue.get(0);
	queue.remove(0);
	return ret;    
    }

    // toString() method
    public String toString() 
    {
	return queue.toString();	
    }

    // Main method
    public static void main ( String[] args ) {

	ArrayPriorityQueue test1 = new ArrayPriorityQueue();
	System.out.println( "New ArrayPriorityQueue instantiated..." );

	System.out.println( "Should return true for isEmpty..." );
	System.out.println( "Testing isEmpty()..." );
	System.out.println( test1.isEmpty() );
	
	System.out.println( "Adding ints [ 4, 6, 1, 7, 7, 2 ]..." );
	test1.add(4);
	test1.add(6);
	test1.add(1);
	test1.add(7);	
	test1.add(7);
	test1.add(2);

	System.out.println( "Should print out 7, 7, 6, 4, 2, 1..." );
	System.out.println( "Testing toString()..." );
	System.out.println( test1 );

	System.out.println( "Peeking at smallest element, should return 1..." );
	test1.peekMin();
	System.out.println( "Removing smallest element..." );
	test1.removeMin();
	System.out.println( "Should print 2, 4, 6, 7, 7..." );
    }	

}//end class ArraypriorityQueue
