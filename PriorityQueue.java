/*****************************************************
 * interface PriorityQueue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 ******************************************************/

public interface PriorityQueue {

    public void add( int Item );
    
    public boolean isEmpty();

    public int peekMin();

    public int removeMin();

}
