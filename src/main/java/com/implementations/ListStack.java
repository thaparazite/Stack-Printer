/*
 * Author: Flaviu Vanca
 * Student ID: 22195092
 */

package com.implementations;

import com.interfaces.Stack;
import java.util.List;
import java.util.ArrayList;

public class ListStack<T> implements Stack<T> {
    private List<T> stack;// create a list to store the elements of the stack

    // constructor to create a new stack with an empty list
    public ListStack() {
        this.stack = new ArrayList<>();
    }// end of the constructor

    @Override
    public void push(T element) {
        stack.add(element);// add the element to the stack
    }// end of the push method

    @Override
    public T pop() {
        // if the stack is empty, return null
        if (stack.isEmpty())
            return null;
        // return the top element of the stack
        return stack.remove(stack.size() - 1);
    }// end of the pop method

    @Override
    public T peek() {
        // if the stack is empty, return null
        if (stack.isEmpty())
            return null;
        // return the top element of the stack
        return stack.get(stack.size() - 1);
    }// end of the peek method

    public int size() {
        return stack.size();// return the size of the stack
    }// end of the size method

    @Override
    public String toString() {
        return stack.toString();// return the stack as a string
    }// end of the toString method
}// end of ListStack class
