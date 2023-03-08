/**
 * This class represents a process and implements the priority and comparable interfaces
 * 
 * @author Kirin Sharma
 * @version 1.0
 * Programming Project 2
 * CS131
 */

public class Process implements Priority, Comparable <Process> {

	private String processID; // holds the id of the process
	private int priority; // holds the priority of the process
	
	/**
	 * Preferred constructor allows caller to pass in value for processID
	 * @param id
	 */
	public Process(String id)
	{
		processID = id;
	} // end constructor
	
	@Override
	/**
     * Returns negative value if current process has less priority than the other, positive if current
     * process has a greater priority, and 0 if they are equal
     */
	public int compareTo(Process comparison)
	{
		int comparisonPriority = comparison.getPriority();
		if (priority < comparisonPriority)
		{
			return -1;
		}
		else if (priority > comparisonPriority)
		{
			return 1;
		}
		else 
		{
			return 0;
		}
	} // end compareTo

	/**
	 * Getter for processID
	 * @return the processID
	 */
	public String getProcessID() 
	{
		return processID;
	} // end getProcessID

	/**
	 * Setter for processID
	 * @param processID the processID to set
	 */
	public void setProcessID(String processID) 
	{
		this.processID = processID;
	} // end setProcessID

	/**
	 * Getter for priority
	 * @return the priority
	 */
	public int getPriority() 
	{
		return priority;
	} // end getPriority

	/**
	 * Setter for priority
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) 
	{
		this.priority = priority;
	} // end setPriority

	@Override
	/**
	 * Override of the toString method
	 */
	public String toString() 
	{
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	} // end toString
	
} // end class
