/**
 * This is an Application to test the methods of the RationalNumber class
 * as well as the methods of the Task and Process classes that both
 * implement the Priority interface
 * 
 * @author Kirin Sharma
 * @version 1.0 Programming Project 2 CS131
 */

public class Application {

	public static void main(String[] args) {
		
		// Testing the RationalNumber class
		RationalNumber oneThird = new RationalNumber(1, 3);
		RationalNumber oneFourth = new RationalNumber(1, 4);
		RationalNumber twoSevenths = new RationalNumber(2, 7);

		System.out.println("Testing compareTo method(expected 1): " +oneThird.compareTo(oneFourth));
		System.out.println("Testing compareTo method(expected -1): " +oneFourth.compareTo(oneThird));
		System.out.println("Testing compareTo method(expected 0): " +twoSevenths.compareTo(twoSevenths));

		
		// Testing the methods of the Task class
		Task task1 = new Task("First Task");
		Task task2 = new Task("Second Task");

		task1.setPriority(3);
		task2.setPriority(9);
		task1.setStatus(Status.NOT_STARTED);
		task2.setStatus(Status.IN_PROCESS);

		System.out.println("\nThe name of task1 is (getter): " + task1.getName());
		System.out.println("The priority of task1 is (getter): " + task1.getPriority());
		System.out.println("The status of task1 is (getter): " + task1.getStatus());
		System.out.println("\nThe name of task2 is (getter): " + task2.getName());
		System.out.println("The priority of task2 is (getter): " + task2.getPriority());
		System.out.println("The status of task2 is (getter): " + task2.getStatus());

		System.out.println("\nTesting the compareTo method (expected -1): " + task1.compareTo(task2));
		System.out.println("Testing the compareTo method (expected 1): " + task2.compareTo(task1));
		task1.setPriority(9);
		System.out.println("Testing the compareTo method (expected 0): " + task1.compareTo(task2));

		System.out.println("\nOverridden toString method: " + task1.toString());

		
		// Testing the methods of the Process class
		Process process1 = new Process("First Process");
		Process process2 = new Process("Second Process");

		process1.setPriority(5);
		process2.setPriority(8);
		System.out.println("\nThe processID of process1 is (getter): " + process1.getProcessID());
		System.out.println("The priority of process1 is (getter): " + process1.getPriority());
		System.out.println("\nThe processID of process2 is (getter): " + process2.getProcessID());
		System.out.println("The priority of process2 is (getter): " + process2.getPriority());

		System.out.println("\nTesting the compareTo method(expected -1): " + process1.compareTo(process2));
		System.out.println("Testing the compareTo method(expected 1): " + process2.compareTo(process1));
		process2.setPriority(5);
		System.out.println("Testing the compareTo method(expected 0): " + process1.compareTo(process2));

		System.out.println("\nOverriden toString method: " + process1.toString());

	} // end main

} // end class
