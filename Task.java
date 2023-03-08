/**
 * This class represents a task and implements the priority and comparable interfaces
 * 
 * @author Kirin Sharma
 * @version 1.0
 * Programming Project 2
 * CS131
 */

enum Status {
		NOT_STARTED,
		IN_PROCESS,
		COMPLETE
	} // enumerated type to hold the status of the task

public class Task implements Priority, Comparable <Task> {
	
	private String name; // holds the name of the task
	private int priority; // holds the priority of the task
	private Status status; // holds status of the task
	
	/**
	 * Default constructor allows caller to pass in value for name
	 * @param taskName
	 */
	public Task(String taskName)
	{
		name = taskName;
	} // end default constructor

	/**
	 * Getter for name
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	} // end getName

	/**
	 * Setter for name
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	} // end setName

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
	
	/**
	 * Getter for currentStatus
	 * @return the current status
	 */
	public Status getStatus()
	{
		return status;
	} // end getStatus
	
	
	/**
	 * Setter for currentStatus
	 * @param s
	 */
	public void setStatus(Status s)
	{
		status = s;
	} // end setStatus
	
	@Override
	/**
     * Returns negative value if current task has less priority than the other, positive if current
     * task has a greater priority, and 0 if they are equal
     */
	public int compareTo(Task comparison)
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

	@Override
	/**
	 * Override of the toString method
	 */
	public String toString() 
	{
		return "Task [name=" + name + ", priority=" + priority +
				", currentStatus=" + status + "]";
	} // end toString
	
} // end class
