/*
 * Author: Flaviu Vanca
 * Student ID: 22195092
 */

package com.interfaces;

public interface Stack<T> {
    /*
     * This interface is used to define the methods that a stack should have
     * public modifier is not necessary in the interface in Java as they are public
     * by default
     */
    public void push(T element);// method to add an element on top of the stack

    public T pop();// method to return and remove the top element of the stack

    public T peek();// method to return the top element of the stack without removing it

}// end of Stack interface
