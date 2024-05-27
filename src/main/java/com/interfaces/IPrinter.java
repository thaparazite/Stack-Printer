/*
 * Author: Flaviu Vanca
 * Student ID: 22195092
 */

package com.interfaces;

public interface IPrinter {
    /*
     * This interface is used to define the methods that a printer should have
     * public modifier is not necessary in the interface in Java as they are public
     * by default
     */
    void submitPrintJob(String job);// submit a print job to the printer

    String printNextJob();// print the next job in the queue then remove it from the queue

    int size();// get the number of jobs waiting to be printed

    String pollNextJob();// return the next job in the queue without removing it

}// end of IPrinter interface
