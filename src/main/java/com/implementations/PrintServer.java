/*
 * Author: Flaviu Vanca
 * Student ID: 22195092
 */

package com.implementations;// package name

import com.interfaces.IPrinter;// import the IPrinter interface
import java.util.LinkedList;// import the LinkedList class
import java.util.Queue;// import the Queue class

/*
 * This class is used to implement the IPrinter interface and define the methods in the interface
 */
public class PrintServer implements IPrinter {
    private Queue<String> printQueue;// create a queue to store the print jobs

    // constructor to create a new print server with an empty print queue
    public PrintServer() {
        this.printQueue = new LinkedList<>();
    }// end of the constructor

    @Override
    public void submitPrintJob(String job) {
        printQueue.add(job);// add the print job to the print queue
    }// end of the submitPrintJob method

    @Override
    public String printNextJob() {
        // check if the print queue is empty and return a message if it is
        if (printQueue.isEmpty()) {
            return "No jobs in the print queue !";
        } // end of the if statement
        return printQueue.poll();// return the next print job in the queue
    }// end of the printNextJob method

    @Override
    public int size() {
        return printQueue.size();// return the size of the print queue
    }// end of the size method

    @Override
    public String pollNextJob() {
        // check if the print queue is empty and return a message if it is
        if (printQueue.isEmpty()) {
            return "No jobs in the print queue !";
        } // end of the if statement
        return printQueue.peek();// return the next print job in the queue
    }// end of the pollNextJob method

    @Override
    public String toString() {
        return printQueue.toString();// return the print queue as a string
    }// end of the toString method

    /*
     * simulate processing the print jobs by pausing for 1.5 seconds for each job
     * to display dots and show the progress of the print job.
     * the sleep method throws a InterruptedException so its being handled by
     * displaying the appropriate message and terminate the method using return
     * prompt a message to show that the print job x has been processed
     */
    public void processJobs() {
        while (!printQueue.isEmpty()) {
            System.out.print("Processing job: " + printQueue.peek());
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1500); // pause for 1.5 second
                    System.out.print(".");// display a dot
                } catch (InterruptedException e) {// catch the InterruptedException
                    System.out.println("Interrupted while processing job: " + printQueue.peek());
                    Thread.currentThread().interrupt(); // restore interrupted status
                    return; // exit the method
                } // end of the try-catch block
            } // end of the for loop
            System.out.println(" Done!");
            printQueue.poll();// remove the print job from the queue
        } // end of the while loop
        System.out.println("All print jobs have been processed!");
    } // end of the processJobs method

}// end of the PrintServer class