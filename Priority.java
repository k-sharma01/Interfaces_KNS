/**
 * This is an interface to establish numeric priority among objects
 * 
 * @author Kirin Sharma
 * @version 1.0
 * Programming Project 2
 * CS131
 */

public interface Priority {

	final int MIN_PRIORITY = 1; // constant for the minimum priority level
	final int MED_PRIORITY = 5; // constant for the medium priority level
	final int MAX_PRIORITY = 10; // constant for the maximum priority level
	
	public void setPriority(int priority);
	
	public int getPriority();
	
} // end interface
