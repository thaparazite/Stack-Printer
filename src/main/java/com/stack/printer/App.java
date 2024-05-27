/*
 * Author: Flaviu Vanca
 * Student ID: 22195092
 * Project: StackPrinter
 * Date: 09/3/2024
 */

package com.stack.printer;

import com.implementations.ListStack;// import the ListStack class
import com.implementations.PrintServer;// import the PrintServer class

public class App {
    public static void main(String[] args) {

        App.divider();// call the divider method
        // Person Stack
        System.out.println("Person Stack");
        App.divider();// call the divider method

        // create a new person stack
        ListStack<String> personStack = new ListStack<>();
        String person1 = "John", person2 = "Martin", person3 = "Flaviu";// create new persons
        String text = " was added to the stack";// create a text to be displayed
        // add three persons to the person stack
        personStack.push(person1);// add the person to the person stack
        System.out.println(person1 + text);// display which person was added to the stack
        personStack.push(person2);// add the person to the person stack
        System.out.println(person2 + text);// display which person was added to the stack
        personStack.push(person3);// add the person to the person stack
        System.out.println(person3 + text);// display which person was added to the stack

        System.out.println("Person Stack: " + personStack.toString());// display the person stack
        // stack size
        System.out.println("Person Stack Size: " + personStack.size());
        App.divider();// call the divider method
        // remove the top person from the person stack
        System.out.println("Popped: " + personStack.pop());
        // display the person stack
        System.out.println("Person Stack: " + personStack.toString());
        // stack size
        System.out.println("Person Stack Size: " + personStack.size());
        App.divider();// call the divider method
        // display the top person from the person stack
        System.out.println("Peek: " + personStack.peek());
        // display the person stack
        System.out.println("Person Stack: " + personStack.toString());
        // stack size
        System.out.println("Person Stack Size: " + personStack.size());
        App.divider();// call the divider method

        // Print Server
        App.divider();// call the divider method
        System.out.println("Print Server");
        App.divider();// call the divider method

        // create a new print server
        PrintServer printServer = new PrintServer();
        String job1 = "Job 1", job2 = "Job 2", job3 = "Job 3";// create a new print job
        text = " was added to the print queue";// create a text to be displayed

        // add three print jobs to the print server
        printServer.submitPrintJob(job1);// call the submitPrintJob method to add a print job to the print server
        System.out.println(job1 + text);// displaywhich job was added to the print queue
        printServer.submitPrintJob(job2);// call the submitPrintJob method to add a print job to the print server
        System.out.println(job2 + text);// displaywhich job was added to the print queue
        printServer.submitPrintJob(job3);// call the submitPrintJob method to add a print job to the print server
        System.out.println(job3 + text);// displaywhich job was added to the print queue

        App.divider();// call the divider method
        System.out.println("Print Queue: " + printServer.toString());// display the print queue
        App.divider();// call the divider method

        // display the print jobs in the print server
        printServer.processJobs();
        App.divider();// call the divider method

    }// end of the main method

    private static void divider() {
        System.out.println("--------------------------------------------------");
    }// end of the divider method

}// end of the App class